package empire.stark.firststep.main

/**
 * Created by YENMINH on 12/5/2017 12:20 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
interface MainFragmentContract {

    interface ViewModel {
        fun loadData()
        fun openDetail()
        fun increaseCounter()
    }

    interface Navigator {

    }

}