package empire.stark.firststep;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;


/**
 * Created by YEN_MINH on 3/8/2017.
 */

public class App extends Application implements HasDispatchingActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        /*
         Create component and inject it .
         This way AppComponent will be create as same as builder.build but no app module
         */
        DaggerAppComponent.create().inject(this);
    }


    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
