package com.example.profilecardui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.profilecardui.R
import com.example.profilecardui.ui.theme.fontProtest

@Composable
fun UserProfile(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.wendy_brooks_x_igsznnqva_unsplash),
                contentDescription = "Mombasa Beach Image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.height(200.dp)
            )
            Column(
                modifier = Modifier.padding(
                    horizontal = 4.dp,
                    vertical = 8.dp
                )
            ) {
                IconButton(
                    onClick = {
                        navController.navigate("profiles")
                    },
                    modifier = Modifier.background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp),
                    ),
                ) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = "ArrowBack Icon",
                        tint = Color(android.graphics.Color.parseColor("#e91e63"))
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(
                    y = (-80).dp
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.christopher),
                        contentDescription = "Mombasa Beach Image",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .size(130.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Christopher Odhiambo", fontFamily = fontProtest,
                            fontSize = 23.sp,
                            color = Color(android.graphics.Color.parseColor("#08d884"))
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "UX Designer",
                            color = Color.White,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Google",
                            color = Color(android.graphics.Color.parseColor("#e91e63"))
                        )
                    }
                    Spacer(modifier = Modifier.height(25.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Bio:",
                            color = Color(android.graphics.Color.parseColor("#08d884"))
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
                            fontSize = 15.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(android.graphics.Color.parseColor("#e91e63")),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.thecodingmontana),
                                contentDescription = "Visibility Icon",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Add as Friend", fontSize = 15.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(30.dp))
                    Column {
                        Text(
                            text = "Friends:",
                            color = Color(android.graphics.Color.parseColor("#08d884"))
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.christopher),
                                contentDescription = "Mombasa Beach Image",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier
                                    .size(130.dp)
                                    .clip(CircleShape)
                            )
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Frontend Developer",
                                    color = Color(android.graphics.Color.parseColor("#08d884")),
                                    fontSize = 14.sp
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "Google",
                                    color = Color(android.graphics.Color.parseColor("#08d884")),
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}