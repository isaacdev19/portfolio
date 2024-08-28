package com.example.rickmorty.domain.entities

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)