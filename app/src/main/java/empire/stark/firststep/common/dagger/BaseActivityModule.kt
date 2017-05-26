package empire.stark.firststep.common.dagger

import android.app.Activity

import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import empire.stark.firststep.cat.CatActivity
import empire.stark.firststep.cat.dagger.CatActivitySubComponent
import empire.stark.firststep.common.BaseActivity
import empire.stark.firststep.main.view.MainActivity
import empire.stark.firststep.main.dagger.MainActivitySubComponent


/**
 * Created by YEN_MINH on 3/9/2017.
 */
@Module(subcomponents = arrayOf(SubComponentBaseActivity::class, MainActivitySubComponent::class, CatActivitySubComponent::class))
abstract class BaseActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(BaseActivity::class)
    abstract fun bindActivityInjectorFactory(builder: SubComponentBaseActivity.Builder): AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(CatActivity::class)
    abstract fun bindCatActivityInjectorFactory(builder: CatActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>

}
