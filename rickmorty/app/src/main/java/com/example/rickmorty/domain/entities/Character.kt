package com.example.rickmorty.domain.entities

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.util.EventObject


@Serializable
data class Character(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun characterFromJson(json: String): Character {
    return Json.decodeFromString<Character>(json)
}
