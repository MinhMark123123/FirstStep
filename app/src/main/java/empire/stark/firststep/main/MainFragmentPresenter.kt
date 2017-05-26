package empire.stark.firststep.main

import android.app.Activity
import android.util.Log
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/13/2017 3:00 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

class MainFragmentPresenter @Inject
constructor(private val mView: MainFragmentContract.View) : MainFragmentContract.Presenter {

    @Inject
    lateinit var activity: Activity

    override fun start() {
        Log.d(TAG , "-activity inject success " + activity.localClassName)
        mView.showLog("MainFragmentPresenter")
    }

    override fun stop() {

    }

    companion object {
        val TAG = "MainFragmentPresenter"
    }
}
