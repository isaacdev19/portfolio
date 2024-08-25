package com.example.rickmorty.ui.features.character

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rickmorty.ui.features.character.viewmodel.CharacterViewModel
import com.example.rickmorty.ui.features.character.widgets.CharacterCard
import com.example.rickmorty.ui.features.character.widgets.UpperPanel

@Composable
fun CharacterPage(
    characterViewModel: CharacterViewModel = viewModel()
) {
    val characterUiState by characterViewModel.uiState.collectAsState()

    Column {
        UpperPanel()
        CharacterCard(characterUiState.characterPage)
    }
}
