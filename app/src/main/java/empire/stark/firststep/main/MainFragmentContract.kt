package empire.stark.firststep.main

import empire.stark.firststep.data.DataSample

/**
 * Created by YENMINH on 12/5/2017 12:20 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
interface MainFragmentContract {

    interface ViewModelContract {
        fun loadData()
        fun deleteData()
        fun insertData()
        fun openDetail()
        fun increaseCounter(position: Int, dataSample: DataSample)
    }

    interface Navigator {

    }

}