package com.vu.androidbasicapp.home.ui.recyclerview

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vu.androidbasicapp.R
import com.vu.androidbasicapp.home.data.Entity
import com.vu.androidbasicapp.home.data.FoodResponseItem
import com.vu.androidbasicapp.home.data.ResponseItem

class ResponseItemViewHolder(view: View,private val navigationFunction: (Entity) -> Unit) : RecyclerView.ViewHolder(view) {


    private val name: TextView = view.findViewById(R.id.itemNametext)
    private val origin: TextView = view.findViewById(R.id.itemOriginText)
    private val mainIngredient: TextView = view.findViewById(R.id.itemIngredientText)
    private val mealType: TextView = view.findViewById(R.id.itemMealTypeText)
    private val details: TextView = view.findViewById(R.id.detailsText)
    private val button: Button = view.findViewById(R.id.navigationButton)


    fun bind(item: Entity) {
        name.text = item.dishName
        origin.text = "Country of Origin: ${item.origin}"
        mainIngredient.text = "Main Ingredient: ${item.mainIngredient}"
        mealType.text = item.mealType


        val showDetails =  View.VISIBLE
        details.visibility = showDetails
        button.visibility = showDetails


        if (showDetails == View.VISIBLE) {
            button.setOnClickListener {
                navigationFunction(item)
            }
        }

    }

}
