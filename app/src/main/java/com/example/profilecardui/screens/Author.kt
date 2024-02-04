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
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.profilecardui.R
import com.example.profilecardui.ui.theme.fontProtest

@Composable
fun Author(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
    ) {
        Image(
            painter = painterResource(id = R.drawable.wendy_brooks_x_igsznnqva_unsplash),
            contentDescription = "Mombasa Beach Image",
            contentScale = ContentScale.FillWidth
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(
                    y = (-150).dp
                )
        ) {
            Column(
                modifier = Modifier.fillMaxHeight()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.christopher),
                        contentDescription = "Mombasa Beach Image",
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .size(200.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "The Coding Montana \uD83C\uDDF0\uD83C\uDDEA",
                        fontFamily = fontProtest,
                        fontSize = 20.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = "Ineffable \uD83D\uDE0F\uD83D\uDE0A: I would shoot \uD83D\uDD2B for the moon \uD83C\uDF19 but I am too busy gazin' at stars ✨⭐\uD83D\uDCAB",
                            textAlign = TextAlign.Center,
                            fontSize = 15.sp,
                            color = Color(android.graphics.Color.parseColor("#d3d8d5"))
                        )
                    }
                }
                Spacer(modifier = Modifier.height(6.dp))
                Column(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(
                                shape = RoundedCornerShape(10.dp),
                                color = Color(android.graphics.Color.parseColor("#222222"))
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp, horizontal = 5.dp)
                                .background(
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color(android.graphics.Color.parseColor("#222222"))
                                )
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Person,
                                contentDescription = "Person Icon",
                                modifier = Modifier.size(48.dp)
                            )
                            Spacer(modifier = Modifier.width(30.dp))
                            Column {
                                Text(text = "Fullname")
                                Text(
                                    text = "Christopher Odhiambo",
                                    fontFamily = fontProtest,
                                    fontSize = 17.sp
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(
                                shape = RoundedCornerShape(10.dp),
                                color = Color(android.graphics.Color.parseColor("#222222"))
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp, horizontal = 5.dp)
                                .background(
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color(android.graphics.Color.parseColor("#222222"))
                                )
                        ) {
                            Icon(
                                painterResource(id = R.drawable.twitter),
                                contentDescription = "Twitter Icon",
                                modifier = Modifier.size(38.dp)
                            )
                            Spacer(modifier = Modifier.width(34.dp))
                            Column {
                                Text(text = "Twitter")
                                Text(
                                    text = "@AmChrisKE",
                                    fontFamily = fontProtest,
                                    fontSize = 17.sp
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(
                                shape = RoundedCornerShape(10.dp),
                                color = Color(android.graphics.Color.parseColor("#222222"))
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 10.dp, horizontal = 5.dp)
                                .background(
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color(android.graphics.Color.parseColor("#222222"))
                                )
                        ) {
                            Icon(
                                painterResource(id = R.drawable.whatsapp),
                                contentDescription = "WhatsApp Icon",
                                modifier = Modifier.size(38.dp)
                            )
                            Spacer(modifier = Modifier.width(34.dp))
                            Column {
                                Text(text = "WhatsApp")
                                Text(
                                    text = "+254 768879348",
                                    fontFamily = fontProtest,
                                    fontSize = 17.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}