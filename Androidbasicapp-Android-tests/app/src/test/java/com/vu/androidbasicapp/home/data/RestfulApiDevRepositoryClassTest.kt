// RestfulApiDevRepositoryClassTest.kt
package com.vu.androidbasicapp.home.data

import com.vu.androidbasicapp.home.network.RestfulApiDevService
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import org.mockito.Mockito

class RestfulApiDevRepositoryClassTest {

    private val mockApiService = Mockito.mock(RestfulApiDevService::class.java)
    private val repository = RestfulApiDevRepositoryClass(mockApiService)

    @Test
    fun `test loginToFoodApi stores keypass correctly`() = runBlocking {
        // Arrange
        val username = "testUser"
        val password = "testPassword"
        val loginRequest = ApiLoginRequest(username, password)
        val expectedKeypass = "testKeypass"
        val expectedResponse = loginApiResponse(expectedKeypass)

        Mockito.`when`(mockApiService.loginToApi(loginRequest)).thenReturn(expectedResponse)

        // Act
        val response = repository.loginToFoodApi(loginRequest)

        // Assert
        assertEquals(expectedKeypass, response.keypass)
    }

    @Test
    fun `test getAllObjectsData returns correct data when logged in`() = runBlocking {
        // Arrange
        val keypass = "testKeypass"
        repository.loginToFoodApi(ApiLoginRequest("testUser", "testPassword"))

        val expectedEntity = Entity(
            dishName = "Pasta",
            mainIngredient = "Wheat",
            origin = "Italy",
            mealType = "Dinner",
            description = "A delicious pasta dish"
        )
        val expectedResponse = FoodResponseItem(
            entities = listOf(expectedEntity),
            entityTotal = 1
        )

        Mockito.`when`(mockApiService.getAllObjects(keypass)).thenReturn(expectedResponse)

        // Act
        val response = repository.getAllObjectsData()

        // Assert
        assertEquals(expectedResponse.entities.size, response.entities.size)
        assertEquals(expectedEntity.dishName, response.entities[0].dishName)
    }

    @Test
    fun `test getAllObjectsData throws IllegalStateException when keypass is null`() = runBlocking {
        // Act & Assert
        val exception = assertThrows(IllegalStateException::class.java) {
            runBlocking { repository.getAllObjectsData() }
        }
        assertEquals("Keypass is null. User might not be logged in.", exception.message)
    }
}
