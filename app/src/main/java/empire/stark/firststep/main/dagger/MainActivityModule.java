package empire.stark.firststep.main.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import empire.stark.firststep.main.MainActivity;
import empire.stark.firststep.main.MainActivityContract;

/**
 * Created by YEN_MINH on 4/11/2017 3:10 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
public class MainActivityModule {
    @Provides
    Activity activity(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    MainActivityContract.View view(MainActivity mainActivity) {
        return mainActivity;
    }
}
