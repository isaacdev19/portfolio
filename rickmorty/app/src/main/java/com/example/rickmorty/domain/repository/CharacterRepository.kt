package com.example.rickmorty.domain.repository

import com.example.rickmorty.domain.entities.character.Character
import com.example.rickmorty.domain.entities.character.CharacterPage

interface CharacterRepository {
    suspend fun fetchCharacter(id: Int): Character
    suspend fun fetchListCharacters(): CharacterPage
}