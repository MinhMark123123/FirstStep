package empire.stark.firststep.data.source.local.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import empire.stark.firststep.data.DataSample

@Database(entities = [DataSample::class], version = 1)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun daoService(): DaoService
}