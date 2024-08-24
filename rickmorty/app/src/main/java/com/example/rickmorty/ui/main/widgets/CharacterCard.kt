package com.example.rickmorty.ui.main.widgets

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.rickmorty.ui.main.viewmodel.MainViewModel

@Composable
fun CharacterCard(viewModel: MainViewModel) {

    val character by viewModel.character.observeAsState()
    
    LaunchedEffect(Unit) {
        viewModel.fetchCharacter()
    }

    Column(
        Modifier.padding(10.dp)
    ) {
        if(character == null){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressIndicator()
            }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                character?.let {
                    items(it.results) {character ->
                        Column(
                            Modifier.wrapContentSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AsyncImage(
                                model = character.image,
                                contentDescription = null,
                                Modifier
                                    .size(180.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .padding(bottom = 1.dp)
                            )
                            Text(
                                text = character.name,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Text(
                                text = "${character.species}, ${character.gender}",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }
            }
        }
    }
}