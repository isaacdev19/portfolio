package com.example.rickmorty.domain.entities

data class CharacterPage(
    val info: Info,
    val results: List<Character>
)