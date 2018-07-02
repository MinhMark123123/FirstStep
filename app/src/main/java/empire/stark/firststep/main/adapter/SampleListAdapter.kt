/*
package empire.stark.firststep.main.adapter

import android.databinding.DataBindingUtil
import android.support.v7.recyclerview.extensions.AsyncListDiffer
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import empire.stark.firststep.R
import empire.stark.firststep.data.DataSample
import empire.stark.firststep.databinding.ItemDataBinding

class SampleListAdapter : BaseDiffAdapter<DataSample, SampleListAdapter.ViewHolder>() {

    var onItemClickListener: OnItemClickListener? = null
    var differData = AsyncListDiffer<DataSample>(this, differItemCallBack())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        var viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            var position = viewHolder.adapterPosition
            onItemClickListener?.onItemClickListener(position, differData.currentList[position])
        }
        return viewHolder
    }

    override fun getItemCount(): Int = differData.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //var viewHolder = holder
        holder.bind(differData.currentList[position])
    }

    override fun differItemCallBack(): DiffUtil.ItemCallback<DataSample> = object : DiffUtil.ItemCallback<DataSample>() {
        override fun areItemsTheSame(oldItem: DataSample, newItem: DataSample): Boolean = oldItem == newItem

        override fun areContentsTheSame(oldItem: DataSample, newItem: DataSample): Boolean = oldItem.data == newItem.data

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: ItemDataBinding = DataBindingUtil.bind(itemView)!!
        */
/**
         * execute binding item immediately
         *//*

        fun bind(dataSample: DataSample) {
            binding.item = dataSample
            binding.executePendingBindings()
        }
    }

    interface OnItemClickListener {
        fun onItemClickListener(position: Int, dataSample: DataSample)
    }
}*/
