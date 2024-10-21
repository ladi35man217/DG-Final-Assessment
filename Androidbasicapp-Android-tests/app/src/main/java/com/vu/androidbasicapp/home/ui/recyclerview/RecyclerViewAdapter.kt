package com.vu.androidbasicapp.home.ui.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vu.androidbasicapp.R
import com.vu.androidbasicapp.home.data.ApiResponse
import com.vu.androidbasicapp.home.data.Entity

class RecyclerViewAdapter(private val dataList: MutableList<Entity> = mutableListOf(), private val navigationFunction: (Entity) -> Unit) : RecyclerView.Adapter<ApiResponseItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiResponseItemViewHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.item_layout_restful_api_dev, parent, false)
        return ApiResponseItemViewHolder(view, navigationFunction = navigationFunction)
    }

    override fun onBindViewHolder(viewHolder: ApiResponseItemViewHolder, position: Int) {
        viewHolder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    fun setData(newDataList: Collection<Entity>) {
        dataList.clear()
        dataList.addAll(newDataList)
        notifyDataSetChanged()
    }
}