package com.example.tp3hci

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val title: String, val icon: ImageVector, val route: String) {
    object HomeScreen: Screen("Home", Icons.Filled.Home, "home_screen")
    object SearchScreen: Screen("Search", Icons.Filled.Favorite, "search_screen")
    object ProfileScreen: Screen("Profile", Icons.Filled.Face, "profile_screen")
}