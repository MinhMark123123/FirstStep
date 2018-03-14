package empire.stark.firststep.data.dagger

import dagger.Binds
import dagger.Module
import empire.stark.firststep.common.dagger.scope.Local
import empire.stark.firststep.common.dagger.scope.Remote
import empire.stark.firststep.data.DataSource
import empire.stark.firststep.data.local.DataSourceLocal
import empire.stark.firststep.data.remote.DataSourceRemote
import javax.inject.Singleton

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
@Module
abstract class RepositoriesModule {

    @Local
    @Binds
    @Singleton
    abstract fun localDataSource(dataSource: DataSourceLocal): DataSource

    @Remote
    @Binds
    @Singleton
    abstract fun remoteDataSource(dataSource: DataSourceRemote): DataSource
}