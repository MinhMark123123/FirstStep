package empire.stark.firststep.common.dagger

import android.app.Activity
import android.support.v4.app.Fragment
import dagger.Module
import dagger.Provides

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
abstract class BaseFragmentModule {

    @Provides
    fun activity(fragment: Fragment): Activity {
        return fragment.activity
    }
}
