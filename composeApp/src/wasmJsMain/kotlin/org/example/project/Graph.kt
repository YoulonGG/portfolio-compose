package org.example.project

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = ScreenRouteNameConstants.HOME_SCREEN
    ) {
        composable(ScreenRouteNameConstants.HOME_SCREEN) {
            App(navController = navController)
        }
    }
}