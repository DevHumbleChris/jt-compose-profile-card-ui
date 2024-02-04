package com.example.profilecardui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.example.profilecardui.data.ProfileCardViewModel
import com.example.profilecardui.ui.theme.fontProtest

@Composable
fun UserProfile(
    navController: NavHostController,
    profilesViewModel: ProfileCardViewModel,
    userId: String
) {
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
                        painter = painterResource(id = profilesViewModel.userProfiles[userId.toInt()].imgSrc),
                        contentDescription = profilesViewModel.userProfiles[userId.toInt()].fullName,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(130.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = profilesViewModel.userProfiles[userId.toInt()].fullName,
                            fontFamily = fontProtest,
                            fontSize = 23.sp,
                            color = Color(android.graphics.Color.parseColor("#08d884"))
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = profilesViewModel.userProfiles[userId.toInt()].occupation,
                            color = Color.White,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = profilesViewModel.userProfiles[userId.toInt()].company,
                            color = Color(android.graphics.Color.parseColor("#e91e63"))
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Icon(
                                painter = painterResource(id = R.drawable.mail),
                                contentDescription = "Mail Icon"
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = profilesViewModel.userProfiles[userId.toInt()].mail,
                                fontSize = 15.sp
                            )
                        }
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
                            text = profilesViewModel.userProfiles[userId.toInt()].bio,
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
                    Text(
                        text = "Friends:",
                        color = Color(android.graphics.Color.parseColor("#08d884"))
                    )
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        items(profilesViewModel.friends) { item ->
                            Column {
                                Spacer(modifier = Modifier.height(20.dp))
                                Column(
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painter = painterResource(id = item.imgSrc),
                                        contentDescription = item.fullName,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(130.dp)
                                            .clip(CircleShape)
                                    )
                                    Column(
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = item.occupation,
                                            color = Color(android.graphics.Color.parseColor("#08d884")),
                                            fontSize = 14.sp
                                        )
                                        Spacer(modifier = Modifier.height(5.dp))
                                        Text(
                                            text = item.company,
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
    }
}