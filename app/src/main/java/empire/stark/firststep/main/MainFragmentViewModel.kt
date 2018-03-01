package empire.stark.firststep.main

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log
import empire.stark.firststep.common.BaseViewModel

/**
 * Created by YENMINH on 12/5/2017 1:42 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class MainFragmentViewModel : BaseViewModel(), MainFragmentContract.ViewModel {

    var counter = MutableLiveData<Int>()


    companion object {
        val TAG = "MainFragmentViewModel"

    }

    /*@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {

    }*/

    override fun start() {
        if (counter.value == null) {
            counter.value = 0
        }
        Log.d(TAG, "start")
    }

    override fun increaseCounter() {
        counter.value = counter.value?.plus(1)
    }

    override fun loadData() {

    }

    override fun openDetail() {

    }


}