package empire.stark.firststep.data.source.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import empire.stark.firststep.data.DataSample
import io.reactivex.Flowable

@Dao
interface DaoService {
    @Query("SElECT * FROM  DATA_SAMPLE")
    fun loadDataAll(): Flowable<List<DataSample>>
}