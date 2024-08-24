package com.example.rickmorty.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rickmorty.ui.features.character.CharacterPage
import com.example.rickmorty.ui.features.episode.EpisodePage
import com.example.rickmorty.ui.features.location.LocationPage

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.CharacterPage.name,
    ) {
        composable(NavScreen.CharacterPage.name) {
            CharacterPage()
        }
        composable(NavScreen.LocationPage.name) {
            LocationPage()
        }
        composable(NavScreen.EpisodePage.name) {
            EpisodePage()
        }
    }
}
