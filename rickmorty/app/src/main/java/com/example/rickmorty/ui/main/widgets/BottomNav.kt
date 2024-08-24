package com.example.rickmorty.ui.main.widgets

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.rickmorty.domain.entities.ItemButtonNav
import com.example.rickmorty.ui.navigation.currentRoute
import com.example.rickmorty.ui.theme.RickMortyColor

@Composable
fun BottomNavBar(
    navHostController: NavHostController
) {
    val menuItems = listOf(
        ItemButtonNav.ItemOne,
        ItemButtonNav.ItemTwo,
        ItemButtonNav.ItemThree
    )
    BottomAppBar {
        NavigationBar {
            menuItems.forEach{item ->
                val selected = currentRoute(navController = navHostController) == item.route
                NavigationBarItem(
                    selected = selected,
                    onClick = {
                              navHostController.navigate(item.route)
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.bodySmall
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = RickMortyColor.kiwiGreen,
                        indicatorColor = MaterialTheme.colorScheme.surfaceColorAtElevation(
                            LocalAbsoluteTonalElevation.current)
                    )
                )
            }
        }
    }
}
