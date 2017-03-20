package empire.stark.firststep.common.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by YEN_MINH on 3/11/2017 6:06 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Subcomponent
public interface SubComponentBaseFragment extends AndroidInjector<BaseFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseFragment>{}
}
