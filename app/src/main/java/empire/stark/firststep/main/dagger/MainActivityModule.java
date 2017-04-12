package empire.stark.firststep.main.dagger;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import dagger.Module;
import dagger.Provides;
import empire.stark.firststep.data.YenMinh;
import empire.stark.firststep.main.MainActivityContract;
import empire.stark.firststep.main.view.MainActivity;

/**
 * Created by YEN_MINH on 4/11/2017 3:10 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
public class MainActivityModule {

    @Provides
    MainActivityContract.View view(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    YenMinh application(Application application) {
        if (application != null) {
            Log.d("MainActivityModule", "application != null");
        } else {
            Log.e("MainActivityModule", "application == null");
        }
        return new YenMinh(application);
    }


    /*@Provides
    Activity activity(MainActivity mainActivity) {
        return mainActivity;
    }*/
}
