package com.example.rickmorty.data.repository

import com.example.rickmorty.core.restconsumer.RestConsumer
import com.example.rickmorty.domain.entities.character.Character
import com.example.rickmorty.domain.entities.character.CharacterPage
import com.example.rickmorty.domain.repository.CharacterRepository

class CharacterRepositoryImpl: CharacterRepository {
    private val dataSource = RestConsumer.characterRemoteDataSource
    override suspend fun fetchCharacter(id: Int): Character {
        return dataSource.fetchCharacter(id)
    }

    override suspend fun fetchListCharacters(): CharacterPage {
        return dataSource.fetchListCharacters()
    }
}