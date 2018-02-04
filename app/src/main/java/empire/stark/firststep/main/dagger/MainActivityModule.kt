package empire.stark.firststep.main.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import empire.stark.firststep.common.dagger.BaseActivityModule
import empire.stark.firststep.common.dagger.BaseFragmentModule
import empire.stark.firststep.common.dagger.scope.PerFragment
import empire.stark.firststep.main.view.MainFragment

/**
 * Created by YEN_MINH on 4/11/2017 3:10 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
abstract class MainActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = [(BaseActivityModule::class), (MainFragmentModule::class), (BaseFragmentModule::class)])
    abstract fun mainFragment(): MainFragment
}
