package com.example.rickmorty.ui.features.location.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmorty.data.repository.LocationRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LocationViewModel: ViewModel() {
    private val repository = LocationRepositoryImpl()

    private val _uiState = MutableStateFlow(LocationUiState())
    val uiState: StateFlow<LocationUiState> = _uiState.asStateFlow()

    init {
        fetchLocation()
    }

    private fun fetchLocation() {
        viewModelScope.launch {
            try {
                val response = repository.fetchLocationPage()
                _uiState.value = _uiState.value.copy(locations = response)
            } catch (e: Exception) {
                Log.d("Repo", "fetchLocation Exception: $e")
            }
        }
    }
}