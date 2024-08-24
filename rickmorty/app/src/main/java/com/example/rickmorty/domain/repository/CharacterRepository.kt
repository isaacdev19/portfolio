package com.example.rickmorty.domain.repository

import com.example.rickmorty.domain.entities.Character
import com.example.rickmorty.domain.entities.CharacterPage

interface CharacterRepository {
    suspend fun fetchCharacter(): Character
    suspend fun fetchListCharacters(): CharacterPage
}