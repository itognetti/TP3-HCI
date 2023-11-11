package com.example.tp3hci

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tp3hci.ui.screens.HomeScreen
import com.example.tp3hci.ui.screens.ProfileScreen
import com.example.tp3hci.ui.screens.SearchScreen

@Composable
fun FINSPONavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreen()
        }
        composable(Screen.SearchScreen.route) {
            SearchScreen()
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen()
        }
    }
}