package empire.stark.firststep.common.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by YEN_MINH on 4/10/2017 3:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application): Context
}
