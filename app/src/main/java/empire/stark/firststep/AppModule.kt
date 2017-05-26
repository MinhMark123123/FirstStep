package empire.stark.firststep

import android.app.Application

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by YEN_MINH on 4/10/2017 3:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
class AppModule(private val mApplication: Application) {
    @Singleton
    @Provides
    internal fun application(): Application {
        return mApplication
    }
}
