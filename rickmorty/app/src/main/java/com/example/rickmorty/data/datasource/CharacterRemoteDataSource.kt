package com.example.rickmorty.data.datasource

import com.example.rickmorty.domain.entities.character.Character
import com.example.rickmorty.domain.entities.character.CharacterPage
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterRemoteDataSource {
    @GET("character/{id}")
    suspend fun fetchCharacter(@Path("id") id: Int): Character
    @GET("character/?page=1")
    suspend fun fetchListCharacters(): CharacterPage
}
