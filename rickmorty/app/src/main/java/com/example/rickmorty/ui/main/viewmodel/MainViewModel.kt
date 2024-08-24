package com.example.rickmorty.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmorty.data.repository.CharacterRepositoryImpl
import com.example.rickmorty.domain.entities.Character
import com.example.rickmorty.domain.entities.CharacterPage
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val repository = CharacterRepositoryImpl()

    private val _character = MutableLiveData<CharacterPage>()
    val character: LiveData<CharacterPage> = _character

    fun fetchCharacter() {
        viewModelScope.launch {
            try {
                val responseCharacter = repository.fetchListCharacters()
                _character.value = responseCharacter
            } catch (e: Exception) {
                Log.d("Repo", "fetchCharacter Exception: $e")
            }
        }
    }
}