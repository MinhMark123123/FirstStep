package empire.stark.firststep.common.dagger

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import empire.stark.firststep.common.BaseFragment
import empire.stark.firststep.main.dagger.MainFragmentSubComponent
import empire.stark.firststep.main.view.MainFragment

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
abstract class BaseFragmentModule {

    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(BaseFragment::class)
    internal abstract fun bindYourFragmentInjectorFactory(builder: SubComponentBaseFragment.Builder): AndroidInjector.Factory<out android.support.v4.app.Fragment>

    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(MainFragment::class)
    internal abstract fun bindMainFragmentInjectorFactory(builder: MainFragmentSubComponent.Builder): AndroidInjector.Factory<out android.support.v4.app.Fragment>
}
