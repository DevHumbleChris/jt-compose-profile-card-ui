package com.example.profilecardui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeProfiles(navController: NavHostController, profilesViewModel: ProfileCardViewModel) {

    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = {
            profilesViewModel.userProfiles.size
        }
    )

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth(),
            pageSize = PageSize.Fill,
        ) { index ->
            Box {
                Column {
                    Image(
                        painter = painterResource(id = profilesViewModel.userProfiles[index].imgSrc),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier.height(600.dp)
                    )
                    Box(
                        modifier = Modifier
                            .offset(
                                y = (-90).dp,
                                x = 10.dp
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .background(
                                    color = Color(android.graphics.Color.parseColor("#222222")),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .padding(20.dp)
                                .width(250.dp)
                        ) {

                            Text(
                                text = profilesViewModel.userProfiles[index].shortName,
                                color = Color.White,
                                fontFamily = fontProtest,
                                fontSize = 30.sp
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Divider(
                                modifier = Modifier.fillMaxWidth(),
                                thickness = 1.dp
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = profilesViewModel.userProfiles[index].occupation,
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = profilesViewModel.userProfiles[index].company,
                                color = Color(android.graphics.Color.parseColor("#e91e63"))
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {
                                    navController.navigate("userProfile/${index}")
                                },
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
                                        painter = painterResource(id = R.drawable.eye),
                                        contentDescription = "Visibility Icon",
                                        modifier = Modifier.size(20.dp)
                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "View Profile")
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}