package com.example.rickmorty.domain.repository

import com.example.rickmorty.domain.entities.location.LocationPage

interface LocationRepository {
    suspend fun fetchLocation(id: Int): LocationPage
    suspend fun fetchLocationPage(): LocationPage
}