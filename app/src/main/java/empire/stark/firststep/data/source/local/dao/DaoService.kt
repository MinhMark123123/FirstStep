package empire.stark.firststep.data.source.local.dao

import android.arch.persistence.room.*
import empire.stark.firststep.data.DataSample
import io.reactivex.Flowable

@Dao
interface DaoService {

    @Query("SElECT * FROM  DATA_SAMPLE")
    fun loadDataAll(): Flowable<List<DataSample>>

    @Update
    fun upDate(dataSample: DataSample)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(dataSample: DataSample)
}