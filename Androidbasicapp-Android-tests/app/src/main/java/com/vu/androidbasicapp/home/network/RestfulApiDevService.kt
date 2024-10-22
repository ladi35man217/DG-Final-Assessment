package com.vu.androidbasicapp.home.network

import com.vu.androidbasicapp.home.data.ApiLoginRequest
import com.vu.androidbasicapp.home.data.Entity
import com.vu.androidbasicapp.home.data.FoodResponseItem
import com.vu.androidbasicapp.home.data.ResponseItem
import com.vu.androidbasicapp.home.data.loginApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RestfulApiDevService {

    @POST("footscray/auth")
    suspend fun loginToApi(@Body requestBody: ApiLoginRequest) : loginApiResponse


    @GET("dashboard/{keypass}")
    suspend fun getAllObjects(@Path("keypass") keypass: String): FoodResponseItem

}