package com.example.rickmorty.ui.features.location.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rickmorty.domain.entities.location.LocationPage
import com.example.rickmorty.ui.theme.RickMortyColor

@Composable
fun LocationCards(locationPage: LocationPage?) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        if(locationPage == null) {
            CircularProgressIndicator()
        } else {
            LazyColumn{
                items(locationPage.results) {location ->
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.LightGray
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 3.dp
                        )
                    ) {
                        Column(
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.padding(10.dp)
                        ){
                            Text(
                                fontSize = 20.sp,
                                text = location.name,
                                style = MaterialTheme.typography.headlineSmall,
                                color = RickMortyColor.endo,
                                modifier = Modifier.padding(bottom = 5.dp)
                            )
                            Text(
                                fontSize = 16.sp,
                                text = "Type: ${location.type}",
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(
                                fontSize = 16.sp,
                                text = "Dimensions: ${location.dimension}",
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(
                                fontSize = 16.sp,
                                text = "Created: ${location.created}",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }
            }
        }
    }
}
