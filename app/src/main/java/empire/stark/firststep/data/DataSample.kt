package empire.stark.firststep.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

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