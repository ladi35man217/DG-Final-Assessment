package com.vu.androidbasicapp.home.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResponse(
    val entities: List<Entity>,
    val entityTotal: Int
)

@JsonClass(generateAdapter = true)
data class Entity(
    @Json(name = "data") val dataSection: Map<String, String>?,
    @Json(name = "dishName") val dishName: String,
    @Json(name = "origin") val origin: String,
    @Json(name = "mainIngredient") val mainIngredient: String,
    @Json(name = "mealType") val mealType: String,
    @Json(name = "description") val description: String
    )