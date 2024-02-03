package com.example.profilecardui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.profilecardui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeProfiles(navController: NavHostController) {
    val pics = listOf(
        R.drawable.woman,
        R.drawable.woman,
        R.drawable.woman
    )

    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = {
            pics.size
        }
    )

    val screenWidth = LocalConfiguration.current.screenWidthDp
    val pageWidth = (screenWidth / 5f).dp

//    contentPadding = PaddingValues(horizontal = pageSize - 40.dp),

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth(),
            pageSize = PageSize.Fill,
        ) { index ->
            Box {
                Column {
                    Image(
                        painter = painterResource(id = pics[index]),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
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
                                    color = Color(android.graphics.Color.parseColor("#222222"))
                                )
                                .padding(20.dp)
                                .width(120.dp)
                        ) {

                            Text(text = "Johana, 25", color = Color.White)
                            Spacer(modifier = Modifier.height(10.dp))
                            Divider(
                                modifier = Modifier.fillMaxWidth(),
                                thickness = 1.dp
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "UX Designer", color = Color.White)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "Google", color = Color.White)
                        }
                    }
                }
            }

        }
    }
}