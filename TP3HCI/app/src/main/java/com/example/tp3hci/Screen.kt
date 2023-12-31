package com.example.tp3hci

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val title: String, val icon: ImageVector, val route: String) {
    object HomeScreen: Screen("Home", Icons.Filled.Home, "home_screen")
    object SearchScreen: Screen("Search", Icons.Filled.Search, "search_screen")
    object ProfileScreen: Screen("Profile", Icons.Filled.AccountCircle, "profile_screen")
    object LoginRegisterScreen: Screen("LoginRegisterScreen", Icons.Filled.AccountCircle, "LoginRegisterScreen")

    object LoginScreen: Screen("Login", Icons.Filled.AccountCircle, "login_screen")

    object RegisterScreen: Screen("Register", Icons.Filled.AccountCircle, "register_screen")

    object SecurScreen: Screen("Security", Icons.Filled.AccountCircle, "secur_screen")

    object AboutUs: Screen("About Us", Icons.Filled.AccountCircle, "about_us")

}