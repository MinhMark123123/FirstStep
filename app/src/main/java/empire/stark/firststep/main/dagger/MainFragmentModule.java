package empire.stark.firststep.main.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import empire.stark.firststep.main.MainFragmentContract;
import empire.stark.firststep.main.view.MainFragment;

/**
 * Created by YEN_MINH on 4/13/2017 2:55 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
public class MainFragmentModule {
    @Provides
    Activity activity(MainFragment mainFragment) {
        return mainFragment.getActivity();
    }

    @Provides
    MainFragmentContract.View view(MainFragment mainFragment) {
        return mainFragment;
    }
}
