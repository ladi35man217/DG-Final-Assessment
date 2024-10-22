package com.vu.androidbasicapp.home.data

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

data class FoodResponseItem(
    val entities: List<Entity>,
    val entityTotal: Int
)

@Parcelize
data class Entity(
    @Json(name = "dishName") val dishName: String,
    @Json(name = "mainIngredient") val mainIngredient: String,
    @Json(name = "origin") val origin: String,
    @Json(name = "mealType") val mealType: String,
    @Json(name = "description") val description: String

): Parcelable


