package empire.stark.firststep.data.source.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import empire.stark.firststep.data.DataSample

@Database(entities = [DataSample::class], version = 1)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun daoService(): DaoService
}