package com.example.rickmorty.core.restconsumer

import com.example.rickmorty.data.datasource.CharacterRemoteDataSource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestConsumer {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val characterRemoteDataSource: CharacterRemoteDataSource by lazy {
        retrofit.create(CharacterRemoteDataSource::class.java)
    }
}