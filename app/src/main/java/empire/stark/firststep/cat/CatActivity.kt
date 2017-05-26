package empire.stark.firststep.cat

import android.os.Bundle
import android.util.Log
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseActivity
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/12/2017 3:32 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

class CatActivity : BaseActivity() {

    @Inject
    lateinit var activity: CatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)
        Log.d(TAG,  "-activity name : " + activity.localClassName)
    }

    companion object {
        val TAG = "CatActivity"
    }
}
