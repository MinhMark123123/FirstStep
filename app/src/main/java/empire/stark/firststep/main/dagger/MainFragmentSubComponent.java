package empire.stark.firststep.main.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import empire.stark.firststep.main.view.MainFragment;

/**
 * Created by YEN_MINH on 4/13/2017 2:55 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentSubComponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainFragment> {}
}
