package empire.stark.firststep.data.source.local.dao

import androidx.paging.DataSource
import androidx.room.*
import empire.stark.firststep.data.DataSample
import io.reactivex.Flowable

@Dao
interface DaoService {

    /*@Query("SElECT * FROM  DATA_SAMPLE")
    fun loadDataAll(): Flowable<DataSource.Factory<Int, DataSample>>*/

    @Update
    fun upDate(dataSample: DataSample)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(dataSample: DataSample)

    @Query("DELETE FROM DATA_SAMPLE")
    fun deleteData()
}