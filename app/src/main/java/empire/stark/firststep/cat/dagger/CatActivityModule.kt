package empire.stark.firststep.cat.dagger

import android.app.Activity

import dagger.Module
import dagger.Provides
import empire.stark.firststep.cat.CatActivity

/**
 * Created by YEN_MINH on 4/12/2017 3:33 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
class CatActivityModule {

    @Provides
    fun catActivity(activity: CatActivity): Activity {
        return activity
    }
}
