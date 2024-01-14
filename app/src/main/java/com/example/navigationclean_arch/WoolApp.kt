package com.example.navigationclean_arch

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationclean_arch.presentation.navigation.WoolNavGraph

@Composable
fun WoolApp() {
    val navController = rememberNavController()
    WoolNavGraph(navController)
}