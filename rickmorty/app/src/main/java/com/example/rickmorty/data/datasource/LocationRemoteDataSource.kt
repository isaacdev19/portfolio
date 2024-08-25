package com.example.rickmorty.data.datasource

import com.example.rickmorty.domain.entities.location.LocationPage
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationRemoteDataSource {
    @GET("location/{id}")
    suspend fun fetchLocation(@Path("id") id: Int): LocationPage
    @GET("location?page=1")
    suspend fun fetchLocationPage(): LocationPage
}