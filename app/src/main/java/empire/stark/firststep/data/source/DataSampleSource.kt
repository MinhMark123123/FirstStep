package empire.stark.firststep.data.source

import androidx.paging.DataSource
import androidx.paging.PagedList
import empire.stark.firststep.data.DataSample
import io.reactivex.Flowable

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
interface DataSampleSource {


    fun insertData(dataSample: DataSample)

    fun updateData(dataSample: DataSample)

    fun deleteDataTable()
}