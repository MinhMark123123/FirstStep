package empire.stark.firststep.main

import android.util.Log
import empire.stark.firststep.main.view.MainActivity
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/13/2017 2:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

class MainActivityPresenter @Inject
constructor(private val mView: MainActivityContract.View) : MainActivityContract.Presenter {

    @Inject
    lateinit var activity: MainActivity

    override fun start() {
        Log.d(TAG , "-activity inject success " + activity.localClassName)
        mView.showLog("MainActivityPresenter")
    }

    override fun stop() {

    }

    companion object {
        val TAG = "MainActivityPresenter"
    }
}
