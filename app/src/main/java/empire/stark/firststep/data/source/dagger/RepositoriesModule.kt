package empire.stark.firststep.data.source.dagger

import dagger.Binds
import dagger.Module
import empire.stark.firststep.common.dagger.scope.Local
import empire.stark.firststep.common.dagger.scope.Remote
import empire.stark.firststep.data.source.DataSampleSource
import empire.stark.firststep.data.source.local.DataSourceLocal
import empire.stark.firststep.data.source.remote.DataSourceRemote
import javax.inject.Singleton

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
@Module(includes = [RoomModule::class])
abstract class RepositoriesModule {

    @Local
    @Binds
    @Singleton
    abstract fun localDataSource(dataSource: DataSourceLocal): DataSampleSource

    @Remote
    @Binds
    @Singleton
    abstract fun remoteDataSource(dataSource: DataSourceRemote): DataSampleSource
}