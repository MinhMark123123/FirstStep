package empire.stark.firststep

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject


/**
 * Created by YEN_MINH on 3/8/2017.
 */

class App : Application(), HasDispatchingActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        /*
         Create component and inject it .
         This way AppComponent will be create as same as builder.build but no app module
         */
        DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)
    }


    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}
