package empire.stark.firststep.data.source.remote

import empire.stark.firststep.data.DataSample
import empire.stark.firststep.data.source.DataSource
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
class DataSourceRemote @Inject constructor() : DataSource {
    override fun insertData(dataSample: DataSample) {

    }

    override fun updateData(dataSample: DataSample) {

    }

    override fun loadData(): Flowable<List<DataSample>> = Flowable.just(null)
}