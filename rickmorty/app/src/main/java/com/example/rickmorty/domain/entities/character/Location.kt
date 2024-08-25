package com.example.rickmorty.domain.entities.character

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val name: String,
    val url: String
)