package empire.stark.firststep.extensions

import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by YENMINH on 2/4/2018 4:55 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
class DiskIOThreadExecutor : Executor {
    private val diskIO = Executors.newSingleThreadExecutor()
    override fun execute(command: Runnable) {
        diskIO.execute { command }
    }
}