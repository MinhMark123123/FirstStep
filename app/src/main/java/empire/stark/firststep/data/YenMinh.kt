package empire.stark.firststep.data

import android.app.Application
import android.util.Log
import javax.inject.Inject

/**
 * Created by YEN_MINH on 3/25/2017 3:35 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
class YenMinh @Inject
constructor(private val mApplication: Application) {
    fun doSomething() {
        Log.d("YenMinh","YenMinh-doSomething")
    }
}
