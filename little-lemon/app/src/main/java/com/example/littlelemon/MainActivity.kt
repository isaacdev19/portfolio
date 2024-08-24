package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController
import androidx.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Preview
@Composable
fun MyApp() {

}

@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinations = listOf<Destinations>(
        Home,
        Settings,
    )
    val selectedIndex = rememberSaveable() {
        mutableIntStateOf(0)
    }

    BottomNavigation() {
        destinations.forEachIndexed { index, destination -> BottomNavigationItem(
            label = { Text(text = destination.title)},
            selected = index == selectedIndex.intValue,
            icon = { Icon(imageVector = destination.icon, contentDescription = destination.title) },
            onClick = {
              selectedIndex.intValue = index
              navController.navigate(destinations[index].route){
                  popUpTo(Home.route)
                  launchSingleTop = true
              }
            }
        )}
    }
}
