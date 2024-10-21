package com.vu.androidbasicapp.home.data

import android.telecom.Call
import com.vu.androidbasicapp.home.network.ApiRetrofitClient
import com.vu.androidbasicapp.home.network.ApiService
import retrofit2.http.Body
import javax.inject.Inject


class ApiRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun loginToApi (@Body request: ApiRequest) { // might need to fix
        return apiService.loginToApi(request)
    }

    suspend fun getAllObjects(): List<ApiResponse> {
        return apiService.getAllObjects()
    }


}


/*


    @POST("footscray/auth") // do i even need this?
    suspend fun loginToApi (@Body requestBody: ApiRequest) // (ApiRequest is a data class
    // that matches the json response expected by the server/endpoint )

    @GET("dashboard/food")
    suspend fun getAllObjects(): List<ApiResponse>



 */