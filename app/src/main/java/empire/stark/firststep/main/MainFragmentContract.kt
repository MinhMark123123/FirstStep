package empire.stark.firststep.main

import empire.stark.firststep.common.mvp.BasePresenter
import empire.stark.firststep.common.mvp.BaseView

/**
 * Created by YEN_MINH on 4/13/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

interface MainFragmentContract {

    interface View : BaseView<Presenter> {
        fun showLog(message: String)
    }

    interface Presenter : BasePresenter
}
