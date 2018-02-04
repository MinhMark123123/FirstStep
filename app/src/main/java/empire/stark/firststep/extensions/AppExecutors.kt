package empire.stark.firststep.extensions

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by YENMINH on 2/4/2018 4:38 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
const val THREAD_COUNT = 3

/**
 * Global executor pools for the whole application.
 *
 * Grouping tasks like this avoids the effects of task starvation (e.g. disk reads don't wait behind
 * webservice requests).
 */
open class AppExecutors constructor(
        val diskIO: Executor = DiskIOThreadExecutor(),
        val netWorkIO: Executor = Executors.newFixedThreadPool(THREAD_COUNT),
        val mainThread: Executor = MainExecutor()
) {

    private class MainExecutor : Executor {
        private val mainThreadExecutor = Handler(Looper.getMainLooper())
        override fun execute(command: Runnable) {
            mainThreadExecutor.post { command }
        }
    }
}