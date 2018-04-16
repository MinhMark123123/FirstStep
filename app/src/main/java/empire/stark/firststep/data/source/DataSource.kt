package empire.stark.firststep.data.source

import empire.stark.firststep.data.DataSample
import io.reactivex.Flowable

/**
 * Created by YEN_MINH on 3/14/2018.
 * Code and Life (o ^_^)o
 */
interface DataSource {
    fun loadData(): Flowable<List<DataSample>>
}