package com.vu.androidbasicapp.home.data

import com.squareup.moshi.Json

data class loginApiResponse(
    @Json (name = "keypass") val keypass: String
)