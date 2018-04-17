package empire.stark.firststep.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "DATA_SAMPLE")
data class DataSample(
        @ColumnInfo(name = "data")
        var data: String,
        @ColumnInfo(name = "counter")
        var counter: Int,
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        var id: Int? = null
)