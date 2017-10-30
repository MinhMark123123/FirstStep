package empire.stark.firststep

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import empire.stark.firststep.common.dagger.DaggerAppComponent


/**
 * Created by YEN_MINH on 3/8/2017.
 */

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        var appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }

}
