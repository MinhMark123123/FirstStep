package empire.stark.firststep.common.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import empire.stark.firststep.common.BaseFragment;
import empire.stark.firststep.common.dagger.scope.PerFragment;

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@PerFragment
@Subcomponent
public interface SubComponentBaseFragment extends AndroidInjector<BaseFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseFragment>{}
}
