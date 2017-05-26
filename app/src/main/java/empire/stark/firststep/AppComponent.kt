package empire.stark.firststep

import android.app.Application

import javax.inject.Singleton

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import empire.stark.firststep.common.dagger.BaseActivityModule
import empire.stark.firststep.common.dagger.BaseFragmentModule

/**
 * Created by YEN_MINH on 3/8/2017.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidSupportInjectionModule::class, BaseActivityModule::class, BaseFragmentModule::class))
interface AppComponent {

    fun inject(app: App)

    //exported for child-component
    fun application(): Application
}
