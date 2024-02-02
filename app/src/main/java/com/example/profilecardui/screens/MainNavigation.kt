package com.example.profilecardui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home-profiles") {
        composable(route = "home-profiles") {
            HomeProfiles(navController)
        }
    }
}