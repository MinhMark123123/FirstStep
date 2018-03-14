package empire.stark.firststep.common.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import empire.stark.firststep.data.dagger.RepositoriesModule

/**
 * Created by YEN_MINH on 4/10/2017 3:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module(includes = [ViewModelModule::class, RepositoriesModule::class])
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context
}
