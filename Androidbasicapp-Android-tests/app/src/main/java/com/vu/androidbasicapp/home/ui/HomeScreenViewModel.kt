package com.vu.androidbasicapp.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vu.androidbasicapp.home.data.ApiRepository
import com.vu.androidbasicapp.home.data.ApiResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.w3c.dom.Entity
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    val greetingText = MutableStateFlow("Hello Class")
    val apiResponseObjects = MutableStateFlow<List<com.vu.androidbasicapp.home.data.Entity>>(listOf())

    init {
        Log.d("nit3213", "HomeScreenViewModel ViewModel injected ")

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