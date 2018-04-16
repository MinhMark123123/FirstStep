package empire.stark.firststep.data.source.local

import empire.stark.firststep.data.DataSample
import empire.stark.firststep.data.source.DataSource
import empire.stark.firststep.data.source.local.dao.DaoService
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
class DataSourceLocal @Inject constructor(var dao: DaoService) : DataSource {
    override fun loadData(): Flowable<List<DataSample>> = dao.loadDataAll()
    override fun insertData(dataSample: DataSample) = dao.insertData(dataSample)
    override fun updateData(dataSample: DataSample) = dao.upDate(dataSample)
}