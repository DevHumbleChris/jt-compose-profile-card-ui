package com.example.profilecardui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.profilecardui.data.ProfileCardViewModel

@Composable
fun MainNavigation(navController: NavHostController, profilesViewModel: ProfileCardViewModel) {
    NavHost(navController = navController, startDestination = "profiles") {
        composable(route = "profiles") {
            HomeProfiles(navController, profilesViewModel)
        }
        composable(route = "author") {
            Author(navController)
        }
        composable(
            route = "userProfile/{userId}",
            arguments = listOf(navArgument("userId") { type = NavType.StringType})
        ) {backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userId")

            userId?.let {
                UserProfile(navController = navController, profilesViewModel, userId)
            }
        }
    }
}