package com.example.rickmorty.data.repository

import com.example.rickmorty.core.restconsumer.RestConsumer
import com.example.rickmorty.domain.entities.location.LocationPage
import com.example.rickmorty.domain.repository.LocationRepository

class LocationRepositoryImpl: LocationRepository {
    private val dataSource = RestConsumer.locationRemoteDataSource
    override suspend fun fetchLocation(id: Int): LocationPage {
        return dataSource.fetchLocation(id)
    }

    override suspend fun fetchLocationPage(): LocationPage {
        return dataSource.fetchLocationPage()
    }
}