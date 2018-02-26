package empire.stark.firststep.main

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.util.Log
import empire.stark.firststep.common.BaseViewModel
import empire.stark.firststep.main.MainFragmentContract

/**
 * Created by YENMINH on 12/5/2017 1:42 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class MainFragmentViewModel : BaseViewModel(), MainFragmentContract.MainFragmentLogic {
    companion object {
        val TAG = "MainFragmentViewModel"
    }

    override fun start() {

        Log.d(TAG, "start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d(TAG, "onStop")
    }


    override fun loadData() {

    }

    override fun openDetail() {

    }


}