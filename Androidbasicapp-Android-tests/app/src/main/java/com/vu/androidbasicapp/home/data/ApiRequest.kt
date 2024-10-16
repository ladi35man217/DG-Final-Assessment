package com.vu.androidbasicapp.home.data

import com.squareup.moshi.Json

data class ApiRequest(
    @Json(name = "username") val username: String,
    @Json(name = "password") val password: String
)