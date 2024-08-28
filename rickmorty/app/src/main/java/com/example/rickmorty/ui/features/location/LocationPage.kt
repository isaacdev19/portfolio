package com.example.rickmorty.ui.features.location

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rickmorty.ui.features.location.viewmodel.LocationViewModel
import com.example.rickmorty.ui.features.location.widgets.LocationCards

@Composable
fun LocationPage(
    locationViewModel: LocationViewModel = viewModel()
) {
    val locationUiState by locationViewModel.uiState.collectAsState()

    Column {
        LocationCards(locationPage = locationUiState.locations)
    }
}
