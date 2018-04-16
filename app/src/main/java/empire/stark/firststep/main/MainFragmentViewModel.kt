package empire.stark.firststep.main

import android.arch.lifecycle.*
import android.util.Log
import empire.stark.firststep.data.source.DataRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by YENMINH on 12/5/2017 1:42 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class MainFragmentViewModel @Inject constructor(
        var dataRepository: DataRepository
) : ViewModel(), LifecycleObserver, MainFragmentContract.ViewModel {
    init {
        Log.e("MainFragmentViewModel", "this class init")
    }

    var counter = MutableLiveData<Int>()
    var compositeDisposable = CompositeDisposable()

    companion object {
        val TAG = "MainFragmentViewModel"

    }

    fun start() {
        if (counter.value == null) {
            counter.value = 0
        }
        dataRepository.loadData()
    }

    override fun increaseCounter() {
        counter.value = counter.value?.plus(1)
    }

    override fun loadData() {

    }

    override fun openDetail() {

    }


}