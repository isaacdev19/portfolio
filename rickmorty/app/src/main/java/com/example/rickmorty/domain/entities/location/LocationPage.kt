package com.example.rickmorty.domain.entities.location

import com.example.rickmorty.domain.entities.Info

data class LocationPage(
    val info: Info,
    val results: List<Result>
)