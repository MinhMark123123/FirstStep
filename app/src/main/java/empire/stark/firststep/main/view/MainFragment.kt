package empire.stark.firststep.main.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseFragment
import empire.stark.firststep.main.MainFragmentContract
import empire.stark.firststep.main.MainFragmentPresenter
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/13/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

class MainFragment : BaseFragment(), MainFragmentContract.View {


    @Inject
    lateinit var presenter: MainFragmentPresenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }
    override fun showLog(message: String) {
        Log.d(TAG , message)
    }

    companion object {
        val TAG = "MainFragment"
    }
}
