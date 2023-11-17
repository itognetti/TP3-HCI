package com.example.tp3hci

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tp3hci.ui.screens.AboutUs
import com.example.tp3hci.ui.screens.HomeScreen
import com.example.tp3hci.ui.screens.LoginRegisterScreen
import com.example.tp3hci.ui.screens.LoginScreen
import com.example.tp3hci.ui.screens.ProfileScreen
import com.example.tp3hci.ui.screens.RegisterScreen
import com.example.tp3hci.ui.screens.SearchScreen
import com.example.tp3hci.ui.screens.SecurScreen

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
            ProfileScreen(
                onNavegateTologinRegisterScreen = {navController.navigate(Screen.LoginRegisterScreen.route)}
            )
        }
        composable(Screen.LoginRegisterScreen.route) {
            LoginRegisterScreen(
                onNavegateToLoginScreen = {navController.navigate(Screen.LoginScreen.route)},
                onNavegateToRegisterScreen = {navController.navigate(Screen.RegisterScreen.route)},
                onNavegateToAboutUs = {navController.navigate(Screen.AboutUs.route)}
            )
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(
                onNavegateToHomeScreen = {navController.navigate(Screen.HomeScreen.route)}
            )
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(
                onNavegateToSecurScreen = {navController.navigate(Screen.SecurScreen.route)}
            )
        }

        composable(Screen.SecurScreen.route) {
            SecurScreen(
                onNavegateToHomeScreen = {navController.navigate(Screen.HomeScreen.route)}
            )
        }

        composable(Screen.AboutUs.route) {
            AboutUs(
                onNavegateTologinRegisterScreen = {navController.navigate(Screen.LoginRegisterScreen.route)}
            )
        }
    }
}