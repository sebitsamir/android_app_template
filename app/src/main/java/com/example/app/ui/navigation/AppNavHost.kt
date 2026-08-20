package com.example.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app.ui.screens.HomeScreen
import kotlinx.serialization.Serializable

object Routes {
    @Serializable
    data object Home
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Home,
    ) {
        composable<Routes.Home> {
            HomeScreen()
        }
        // Add more destinations as your app grows:
        // composable<Routes.Detail> { backStackEntry -> ... }
    }
}
