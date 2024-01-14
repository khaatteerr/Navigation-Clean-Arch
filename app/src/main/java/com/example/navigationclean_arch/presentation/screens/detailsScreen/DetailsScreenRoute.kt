package com.example.navigationclean_arch.presentation.screens.detailsScreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationclean_arch.presentation.navigation.Screen

fun NavGraphBuilder.detailsScreenRoute(navController: NavController){
    composable(Screen.DetailsScreen.route){
        DetailsScreen(navController = navController)
    }
}