package com.vu.androidbasicapp.home.network

import com.vu.androidbasicapp.home.data.AddObjectRequest
import com.vu.androidbasicapp.home.data.AddObjectResponse
import com.vu.androidbasicapp.home.data.ApiLoginRequest
import com.vu.androidbasicapp.home.data.Entity
import com.vu.androidbasicapp.home.data.FoodResponseItem
import com.vu.androidbasicapp.home.data.ResponseItem
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RestfulApiDevService {

    /*

    @GET("objects")
    suspend fun getAllObjects(): List<ResponseItem>

    @GET("objects/{number}")
    suspend fun getSingleObject(@Path("number") id: Int): ResponseItem

    @POST("objects")
    suspend fun addObject(@Body requestBody: AddObjectRequest): AddObjectResponse

     */

    @POST("footscray/auth")
    suspend fun loginToApi(@Body requestBody: ApiLoginRequest)


    @GET("dashboard/food")
    suspend fun getAllObjects(): FoodResponseItem


}