package com.example.rickmorty.ui.features.character.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmorty.data.repository.CharacterRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CharacterViewModel: ViewModel() {
    private val repository = CharacterRepositoryImpl()

    private val _uiState = MutableStateFlow(CharacterUiState())
    val uiState: StateFlow<CharacterUiState> = _uiState.asStateFlow()

    init {
        fetchCharacter()
    }

    private fun fetchCharacter() {
        viewModelScope.launch {
            try {
                val responseCharacter = repository.fetchListCharacters()
                _uiState.value = _uiState.value.copy(characterPage = responseCharacter)
            } catch (e: Exception) {
                Log.d("Repo", "fetchCharacter Exception: $e")
            }
        }
    }
}