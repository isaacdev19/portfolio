package com.example.rickmorty.data.datasource

import com.example.rickmorty.domain.entities.Character
import com.example.rickmorty.domain.entities.CharacterPage
import retrofit2.http.GET

interface CharacterRemoteDataSource {
    @GET("character/2")
    suspend fun fetchCharacter(): Character
    @GET("character/?page=1")
    suspend fun fetchListCharacters(): CharacterPage
}
