package empire.stark.firststep.common.activity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YEN_MINH on 3/23/2017 3:45 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
public class BaseActivityModule {
    @Provides
    public Activity activity(Activity activity) {
        return activity;
    }

}
