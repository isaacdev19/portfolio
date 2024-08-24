package com.example.rickmorty.data.repository

import com.example.rickmorty.core.restconsumer.RestConsumer
import com.example.rickmorty.domain.entities.Character
import com.example.rickmorty.domain.entities.CharacterPage
import com.example.rickmorty.domain.repository.CharacterRepository

class CharacterRepositoryImpl: CharacterRepository {
    private val dataSource = RestConsumer.characterRemoteDataSource
    override suspend fun fetchCharacter(): Character {
        return dataSource.fetchCharacter()
    }

    override suspend fun fetchListCharacters(): CharacterPage {
        return dataSource.fetchListCharacters()
    }
}