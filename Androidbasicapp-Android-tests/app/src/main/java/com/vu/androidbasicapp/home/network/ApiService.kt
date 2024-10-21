package com.vu.androidbasicapp.home.network

import android.telecom.Call
import com.vu.androidbasicapp.home.data.ApiRequest
import com.vu.androidbasicapp.home.data.ApiResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {

    @POST("footscray/auth") // do i even need this?
    suspend fun loginToApi (@Body requestBody: ApiRequest)// (ApiRequest is a data class
    // that matches the json response expected by the server/endpoint )

    @GET("dashboard/food")
    suspend fun getAllObjects(): List<ApiResponse>

}

