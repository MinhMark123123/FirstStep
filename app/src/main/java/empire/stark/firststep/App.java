package empire.stark.firststep;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import dagger.android.support.DaggerAppCompatActivity;


/**
 * Created by MINH NGUYEN on 3/8/2017.
 */

public class App extends Application implements HasDispatchingActivityInjector{



    @Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

    }


    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
