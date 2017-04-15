package empire.stark.firststep.common.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import empire.stark.firststep.common.BaseFragment;
import empire.stark.firststep.main.dagger.MainFragmentSubComponent;
import empire.stark.firststep.main.view.MainFragment;

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module(subcomponents = {SubComponentBaseFragment.class, MainFragmentSubComponent.class})
public abstract class BaseFragmentModule {

    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(BaseFragment.class)
    abstract AndroidInjector.Factory<? extends android.support.v4.app.Fragment> bindYourFragmentInjectorFactory
            (SubComponentBaseFragment.Builder builder);

    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends android.support.v4.app.Fragment> bindMainFragmentInjectorFactory
            (MainFragmentSubComponent.Builder builder);
}
