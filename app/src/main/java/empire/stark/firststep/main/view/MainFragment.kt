package empire.stark.firststep.main.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseFragment
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/13/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

class MainFragment : BaseFragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }


    companion object {
        val TAG = "MainFragment"
    }
}
