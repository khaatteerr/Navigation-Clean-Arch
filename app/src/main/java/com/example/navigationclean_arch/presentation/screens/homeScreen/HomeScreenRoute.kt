package com.example.navigationclean_arch.presentation.screens.homeScreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationclean_arch.presentation.navigation.Screen

fun NavGraphBuilder.homeScreenRoute(navController: NavController){
    composable(Screen.HomeScreen.route){
        HomeScreen(navController = navController)
    }
}