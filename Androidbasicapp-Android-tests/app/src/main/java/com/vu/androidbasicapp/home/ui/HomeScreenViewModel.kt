package com.vu.androidbasicapp.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vu.androidbasicapp.home.data.AddObjectRequest
import com.vu.androidbasicapp.home.data.ApiLoginRequest
import com.vu.androidbasicapp.home.data.Entity
import com.vu.androidbasicapp.home.data.FoodResponseItem
import com.vu.androidbasicapp.home.data.RestfulApiDevRepositoryClass
import com.vu.androidbasicapp.home.data.ResponseItem
import com.vu.androidbasicapp.home.network.RestfulApiDevRetrofitClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: RestfulApiDevRepositoryClass) : ViewModel() {

    val greetingText = MutableStateFlow("Hello Class")
    val apiResponseObjects = MutableStateFlow<List<Entity>>(listOf())

    fun loginAndFetchData(loginRequest: ApiLoginRequest) {
        viewModelScope.launch {
            try {
                // Step 1: Log in and obtain keypass
                val loginResponse = repository.loginToFoodApi(loginRequest)
                updateGreetingTextState("Login Successful. Key: ${loginResponse.keypass}")

                // Step 2: Fetch the data using the keypass
                val result = repository.getAllObjectsData()
                apiResponseObjects.value = result.entities
            } catch (e: Exception) {
                updateGreetingTextState("Login or API Request failed: ${e.message}")
            }
        }
    }

    private fun updateGreetingTextState(value: String) {
        greetingText.value = value
    }
}

