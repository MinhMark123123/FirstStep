package empire.stark.firststep.data.source.dagger

import androidx.room.Room
import dagger.Module
import dagger.Provides
import empire.stark.firststep.App
import empire.stark.firststep.data.source.local.dao.RoomDatabase
import javax.inject.Singleton

@Module
class RoomModule {

    @Singleton
    @Provides
    fun room(app: App): RoomDatabase = Room.databaseBuilder(app.applicationContext, RoomDatabase::class.java, "database.db")
            .allowMainThreadQueries()
            .build()

    @Singleton
    @Provides
    fun daoService(roomDb: RoomDatabase) = roomDb.daoService()

}