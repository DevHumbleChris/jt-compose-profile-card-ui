package com.example.profilecardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.profilecardui.app.ProfileCardUIApp
import com.example.profilecardui.data.ProfileCardViewModel
import com.example.profilecardui.ui.theme.ProfileCardUITheme

class MainActivity : ComponentActivity() {
    private val profilesViewModel by viewModels<ProfileCardViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    ProfileCardUIApp(profilesViewModel)
                }
            }
        }
    }
}