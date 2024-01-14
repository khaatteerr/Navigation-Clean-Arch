package com.example.navigationclean_arch.presentation.navigation

import com.example.navigationclean_arch.presentation.utilities.Constants.WOOL_DETAILS_ID

sealed class Screen(val route: String) {

    /*
    * here i have three screens ...
    * In details screen we will pass ID to fetch all data about the wool.
    * after passing ID we will get it from details screen viewModel to hit API with the specific ID
    *  */
    data object HomeScreen : Screen("HomeScreen")
    data object SettingScreen : Screen("SettingScreen")

    data object DetailsScreen : Screen("DetailsScreen/{$WOOL_DETAILS_ID}") {
        fun passId(id: String): String {
            return this.route.replace(oldValue = "{$WOOL_DETAILS_ID}", newValue = id)
        }
    }
}