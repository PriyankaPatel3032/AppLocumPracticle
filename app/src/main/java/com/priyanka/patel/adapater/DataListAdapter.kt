package com.priyanka.kotlinstructurecorotines.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.priyanka.patel.R
import com.priyanka.patel.activities.MainActivity
import com.priyanka.patel.models.Data.DataResponseItem
import kotlinx.android.synthetic.main.row_list.view.*

class DataListAdapter(private val lists:ArrayList<DataResponseItem>, private var activity:MainActivity) : RecyclerView.Adapter<DataListAdapter.DataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false))

    override fun getItemCount(): Int = lists.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(lists[position],activity)

    }

    fun addUsers(list: List<DataResponseItem>) {
        this.lists.apply {
            clear()
            addAll(list)
        }

    }

    class DataViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(data: DataResponseItem,activity:MainActivity) {

            itemView.apply {

                var image_url= GlideUrl(data.url,
                    LazyHeaders.Builder().addHeader("User-Agent","your-user-agent").build())

                Glide.with(ivData.context)
                    .load(image_url)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivData)

                tvDataTitle.text = data.title
            }

            itemView.setOnClickListener {

                activity.passImageUrl(data)
            }
        }

    }
}