package empire.stark.firststep.main.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import empire.stark.firststep.common.dagger.BaseFragmentModule
import empire.stark.firststep.main.view.MainActivity

/**
 * Created by YEN_MINH on 4/11/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivitySubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}