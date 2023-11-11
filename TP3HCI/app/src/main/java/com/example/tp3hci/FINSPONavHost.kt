package com.example.tp3hci

//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
//import androidx.navigation.navDeepLink
//import com.example.tp3hci.ui.screens.TESTHomeScreen
//import com.example.tp3hci.ui.screens.OtherScreen

//@Composable
//fun FINSPONavHost(
//    navController: NavHostController = rememberNavController(),
//    startDestination: String = "home",
//){
//    val uri = "http://finspo.com"
//    val secureUri = "https://finspo.com"
//
//    NavHost(
//        navController = navController,
//        startDestination = startDestination
//    ){
//        composable("home"){
//            HomeScreen(onNavigateToOtherScreen = { id -> navController.navigate("other/$id") } )
//        }
//        composable(
//            "other/{id}",
//            arguments = listOf(navArgument("id") { type = NavType.IntType }),
//            deepLinks = listOf(navDeepLink { uriPattern = "$uri/other?id={id}"},
//            navDeepLink { uriPattern = "$secureUri/other?id={id}" })
//        ){ route ->
//            OtherScreen(route.arguments?.getInt("id"))
//        }
//    }
//}