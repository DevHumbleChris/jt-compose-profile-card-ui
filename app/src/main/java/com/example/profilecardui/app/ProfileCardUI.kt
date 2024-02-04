package com.example.profilecardui.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.profilecardui.R
import com.example.profilecardui.screens.MainNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCardUIApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = {
                                    navController.navigate("profiles")
                                },
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.akariconspeoplegroup),
                                    contentDescription = "Home Outlined Icon",
                                    tint = Color(android.graphics.Color.parseColor("#e91e63")),
                                    modifier = Modifier.size(52.dp)
                                )
                            }
                            Text(text = "Profiles", color = Color.White, fontSize = 15.sp)
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = {
                                    navController.navigate("author")
                                },
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.thecodingmontana),
                                    contentDescription = "Panda Outlined Icon",
                                    tint = Color(android.graphics.Color.parseColor("#e91e63")),
                                    modifier = Modifier.size(52.dp)
                                )
                            }
                            Text(text = "Author", color = Color.White, fontSize = 15.sp)
                        }
                    }
                },
                containerColor = Color(android.graphics.Color.parseColor("#222222"))
            )
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = Color(android.graphics.Color.parseColor("#181816"))
        ) {
            MainNavigation(navController)
        }
    }
}