package empire.stark.firststep.common.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module(subcomponents = SubComponentBaseFragment.class)
public abstract class BaseFragmentModule {
    @Binds
    @IntoMap
    @dagger.android.support.FragmentKey(BaseFragment.class)
    abstract AndroidInjector.Factory<? extends android.support.v4.app.Fragment> bindYourFragmentInjectorFactory
            (SubComponentBaseFragment.Builder builder);
}
