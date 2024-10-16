package com.vu.androidbasicapp.home.network

import android.provider.ContactsContract.RawContacts.Data
import com.vu.androidbasicapp.home.data.ApiResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("dashboard/food") // not sure how to format this stuff...
    suspend fun getAllObjects(): List<ApiResponse>

    @GET("dashboard/food/{dishName}") // yeah nah no idea
    suspend fun getObjectByName(@Path("dishName") dishName: String): ApiResponse

    @GET("dashboard/food/search") // is this needed?
    suspend fun searchObjects(
        @Query("dishName") dishName: String
    )

    /*
    @POST("dashboard/food") // do i even need this?
    suspend fun addObject(@Body data: Data:ApiRequest) // (ApiRequest is a data class
    // that matches the json response expected by the server/endpoint )
     */
}