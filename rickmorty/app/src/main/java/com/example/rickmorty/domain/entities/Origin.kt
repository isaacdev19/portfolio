package com.example.rickmorty.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Origin(
    val name: String,
    val url: String
)