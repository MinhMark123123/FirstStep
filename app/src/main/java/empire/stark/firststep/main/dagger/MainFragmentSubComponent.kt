package empire.stark.firststep.main.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import empire.stark.firststep.main.view.MainFragment

/**
 * Created by YEN_MINH on 4/13/2017 2:55 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Subcomponent(modules = arrayOf(MainFragmentModule::class))
interface MainFragmentSubComponent : AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainFragment>()
}
