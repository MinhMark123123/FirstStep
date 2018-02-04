package empire.stark.firststep.common

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel

/**
 * Created by YENMINH on 12/13/2017 12:21 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
abstract class BaseViewModel : ViewModel(), LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    abstract fun start()

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    abstract fun stop()

}