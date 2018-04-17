package empire.stark.firststep.main

import android.arch.lifecycle.*
import android.util.Log
import empire.stark.firststep.common.BaseViewModel
import empire.stark.firststep.data.DataSample
import empire.stark.firststep.data.source.DataRepository
import empire.stark.firststep.extensions.AppExecutors
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by YENMINH on 12/5/2017 1:42 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class MainFragmentViewModel @Inject constructor(
        private var dataRepository: DataRepository
) : BaseViewModel(), LifecycleObserver, MainFragmentContract.ViewModelContract {
    var valueEdit = MutableLiveData<String>()
    var valueInsert = MutableLiveData<String>()
    var lisData = MutableLiveData<ArrayList<DataSample>>()
    var currentDataSelect = MutableLiveData<DataSample>()
    private var executor = AppExecutors()

    init {
        Log.e("MainFragmentViewModel", "this class init")
    }

    var compositeDisposable = CompositeDisposable()

    companion object {
        val TAG = "MainFragmentViewModel"
    }

    override fun start() {
        /*if (counter.value == null) {
            counter.value = 0
        }*/
        loadData()
        //dataRepository.loadData()
    }

    override fun increaseCounter() {
        //counter.value = counter.value?.plus(1)
    }

    override fun loadData() {
        compositeDisposable.add(
                dataRepository.loadData()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                { next -> lisData.postValue(ArrayList(next)) },
                                { error -> error.printStackTrace() }
                        )
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    override fun openDetail() {

    }

    override fun updateData() {
        if (currentDataSelect.value != null) {
            executor.diskIO.execute { dataRepository.updateData(currentDataSelect.value!!) }
        }
    }

    override fun insertData() {
        if (valueInsert.value != null) {
            executor.netWorkIO.execute { dataRepository.insertData(DataSample(valueInsert.value!!, 1)) }
        }
    }
}