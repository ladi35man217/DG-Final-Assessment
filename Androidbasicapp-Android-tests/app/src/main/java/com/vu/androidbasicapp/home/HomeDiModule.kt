package com.vu.androidbasicapp.home

import com.vu.androidbasicapp.home.network.ApiRetrofitClient
import com.vu.androidbasicapp.home.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HomeDiModule {

    /*
    @Provides
    fun provideRestfulApiDevService(
    ): RestfulApiDevService {
        return RestfulApiDevRetrofitClient().apiService
    }

     */

    @Provides
    fun provideApiDevService(
    ): ApiService {
        return ApiRetrofitClient().apiService
    }

}
