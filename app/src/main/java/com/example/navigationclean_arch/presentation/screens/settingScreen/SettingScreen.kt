package com.example.navigationclean_arch.presentation.screens.settingScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.navigationclean_arch.presentation.navigation.Screen

@Composable
fun SettingScreen(
    navController: NavController,
    settingViewModel: SettingViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green.copy(0.5f)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Setting Screen",
            fontSize = 25.sp,
            color = Color.Black,
            modifier = Modifier.align(
                Alignment.Center
            )
        )
        Button(
            onClick = { navController.navigate(Screen.HomeScreen.route) },
            modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = 50.dp)
        ) {
            Text(text = "Navigate to home screen", fontSize = 18.sp, color = Color.Black)
        }
    }
}