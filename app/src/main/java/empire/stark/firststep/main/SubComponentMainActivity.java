package empire.stark.firststep.main;

import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import empire.stark.firststep.common.activity.BaseActivity;
import empire.stark.firststep.common.activity.BaseActivityModule;

/**
 * Created by YEN_MINH on 3/23/2017 3:40 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Subcomponent(modules = BaseActivityModule.class)
public interface SubComponentMainActivity extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
