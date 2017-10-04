package empire.stark.firststep

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


/**
 * Created by YEN_MINH on 3/8/2017.
 */

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        var appComponent = DaggerAppComponent.builder().build()
        appComponent.inject(this)
        return appComponent
    }

}
