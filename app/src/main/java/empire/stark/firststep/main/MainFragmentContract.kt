package empire.stark.firststep.main

/**
 * Created by YENMINH on 12/5/2017 12:20 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
interface MainFragmentContract {

    interface ViewModelContract {
        fun loadData()
        fun updateData()
        fun insertData()
        fun openDetail()
        fun increaseCounter()
    }

    interface Navigator {

    }

}