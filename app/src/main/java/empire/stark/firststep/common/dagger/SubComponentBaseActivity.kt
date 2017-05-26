package empire.stark.firststep.common.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import empire.stark.firststep.common.BaseActivity
import empire.stark.firststep.common.dagger.scope.PerActivity

/**
 * Created by YEN_MINH on 3/9/2017.
 */
@PerActivity
@Subcomponent
interface SubComponentBaseActivity : AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<BaseActivity>()

}
