package empire.stark.firststep.common

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment

import dagger.android.support.AndroidSupportInjection

/**
 * Created by YEN_MINH on 3/9/2017.
 */

open class BaseFragment : Fragment() {

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


}
