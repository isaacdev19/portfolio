package com.example.rickmorty.domain.entities

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Map
import androidx.compose.material.icons.rounded.Tv
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.rickmorty.ui.navigation.NavScreen

sealed class ItemButtonNav (
    val icon: ImageVector,
    val title: String,
    val route: String
){
    data object ItemOne: ItemButtonNav(
        Icons.Rounded.Home,
        "Characters",
        NavScreen.CharacterPage.name
    )
    data object ItemTwo: ItemButtonNav(
        Icons.Rounded.Map,
        "Locations",
        NavScreen.LocationPage.name
    )
    data object ItemThree: ItemButtonNav(
        Icons.Rounded.Tv,
        "Episode",
        NavScreen.EpisodePage.name
    )
}
