package empire.stark.firststep.common.adapter

import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView

abstract class BaseDiffAdapter<T, G : RecyclerView.ViewHolder> : RecyclerView.Adapter<G>() {
    /**
     * provide each differ item call back here
     */
    abstract fun differItemCallBack(): DiffUtil.ItemCallback<T>
}