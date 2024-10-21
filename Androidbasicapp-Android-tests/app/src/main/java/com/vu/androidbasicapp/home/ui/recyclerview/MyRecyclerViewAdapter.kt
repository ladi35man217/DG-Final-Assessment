package com.vu.androidbasicapp.home.ui.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vu.androidbasicapp.R
import com.vu.androidbasicapp.home.data.Entity
import com.vu.androidbasicapp.home.data.FoodResponseItem
import com.vu.androidbasicapp.home.data.ResponseItem

class MyRecyclerViewAdapter(private val dataList: MutableList<Entity> = mutableListOf(), private val navigationFunction: (Entity) -> Unit) : RecyclerView.Adapter<ResponseItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResponseItemViewHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.item_layout_restful_api_dev, parent, false)
        return ResponseItemViewHolder(view, navigationFunction = navigationFunction)
    }

    override fun onBindViewHolder(viewHolder: ResponseItemViewHolder, position: Int) {
        viewHolder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    fun setData(newDataList: List<Entity>) {
        dataList.clear()
        dataList.addAll(newDataList)
        notifyDataSetChanged()
    }
}