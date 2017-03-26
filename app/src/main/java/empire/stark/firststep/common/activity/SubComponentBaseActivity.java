package empire.stark.firststep.common.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import empire.stark.firststep.common.fragment.BaseFragmentModule;
import empire.stark.firststep.main.MainActivityModule;

/**
 * Created by YEN_MINH on 3/9/2017.
 */
@Subcomponent(modules =
        {
                BaseActivityModule.class,
                MainActivityModule.class,
                BaseFragmentModule.class
        }
)
public interface SubComponentBaseActivity extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {
    }

}
