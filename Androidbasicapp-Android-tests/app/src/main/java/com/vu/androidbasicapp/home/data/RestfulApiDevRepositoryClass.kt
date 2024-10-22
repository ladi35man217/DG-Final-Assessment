package com.vu.androidbasicapp.home.data

import com.vu.androidbasicapp.home.network.RestfulApiDevRetrofitClient
import com.vu.androidbasicapp.home.network.RestfulApiDevService
import javax.inject.Inject

class RestfulApiDevRepositoryClass @Inject constructor(private val restfulDevApiService: RestfulApiDevService) {

    private var keypass: String? = null

    suspend fun loginToFoodApi(item: ApiLoginRequest): loginApiResponse {
        val response = restfulDevApiService.loginToApi(requestBody = item)
        keypass = response.keypass  // Store keypass for subsequent calls
        return response
    }

    suspend fun getAllObjectsData(): FoodResponseItem {
        keypass?.let {
            return restfulDevApiService.getAllObjects(it)  // Pass keypass to the API call
        } ?: throw IllegalStateException("Keypass is null. User might not be logged in.")
    }
}
