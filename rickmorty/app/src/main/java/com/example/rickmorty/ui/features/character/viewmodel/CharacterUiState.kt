package com.example.rickmorty.ui.features.character.viewmodel

import com.example.rickmorty.domain.entities.character.CharacterPage

data class CharacterUiState(
    var characterPage: CharacterPage? = null
)
