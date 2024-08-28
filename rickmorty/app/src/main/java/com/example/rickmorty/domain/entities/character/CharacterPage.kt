package com.example.rickmorty.domain.entities.character

import com.example.rickmorty.domain.entities.Info

data class CharacterPage(
    val info: Info,
    val results: List<Character>
)