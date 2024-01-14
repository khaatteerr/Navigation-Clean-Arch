package com.example.navigationclean_arch.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationclean_arch.presentation.screens.detailsScreen.detailsScreenRoute
import com.example.navigationclean_arch.presentation.screens.homeScreen.homeScreenRoute
import com.example.navigationclean_arch.presentation.screens.settingScreen.settingScreenRoute

@Composable
fun WoolNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {

        // Home Screen
        homeScreenRoute(navController = navController)

        // Details Screen
        detailsScreenRoute(navController = navController)

        // Setting Screen
        settingScreenRoute(navController = navController)
    }
}