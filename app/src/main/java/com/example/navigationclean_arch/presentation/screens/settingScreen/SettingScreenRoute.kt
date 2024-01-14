package com.example.navigationclean_arch.presentation.screens.settingScreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationclean_arch.presentation.navigation.Screen

fun NavGraphBuilder.settingScreenRoute(navController: NavController){
    composable(Screen.SettingScreen.route){
        SettingScreen(navController = navController)
    }
}