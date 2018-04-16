package empire.stark.firststep.data.source

import empire.stark.firststep.common.dagger.scope.Local
import empire.stark.firststep.common.dagger.scope.Remote
import javax.inject.Inject

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
class DataRepository @Inject constructor(
        @Remote private var remote: DataSource,
        @Local private var local: DataSource
) : DataSource {
    override fun loadData() = local.loadData()

}