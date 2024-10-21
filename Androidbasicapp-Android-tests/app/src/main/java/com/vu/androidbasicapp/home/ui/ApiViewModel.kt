package com.vu.androidbasicapp.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vu.androidbasicapp.home.data.ApiRepository
import com.vu.androidbasicapp.home.data.ApiResponse
import com.vu.androidbasicapp.home.network.ApiRetrofitClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ApiViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {


    /*
    private val mutableObjectsState = MutableStateFlow<List<ApiResponse>>(emptyList())
    val objectsState: StateFlow<List<ApiResponse>> = mutableObjectsState

    private val _errorState = MutableStateFlow<String?>(null)
    val errorState : StateFlow<String?> = _errorState




    fun getAllObjects() {
        viewModelScope.launch {
            try {
                val objects = repository.getAllObjects()
                mutableObjectsState.value = objects
            } catch (e: Exception) {
                _errorState.value = "Error fetching objects: ${e.message}"
            }
        }
    }

     */

    val greetingText = MutableStateFlow("Hello Food")
    val apiResponseObjects = MutableStateFlow<List<Entity>>(listOf())

    init {
        Log.d("nit3213", "ApiVieModel ViewModel injected ")

        viewModelScope.launch {
            val result = repository.getAllObjects()
            delay(1000)
            updateGreetingTextState("Api has responded with the following items")
            delay(1000)
            apiResponseObjects.value = result
        }


    }

    private fun updateGreetingTextState(value: String) {
        greetingText.value = value
    }

}

