package com.example.profilecardui.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.profilecardui.screens.MainNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCardUIApp() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(text = "Friendzy")
                },
            )
        }
    ) {
        Surface(
            modifier = Modifier.padding(it).fillMaxSize(),
            color = Color.White
        ) {
            MainNavigation(navController)
        }
    }
}