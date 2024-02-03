package com.example.profilecardui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
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

    Column {
        HorizontalPager(state = pagerState) { index ->
            Image(painter = painterResource(id = pics[index]), contentDescription = null)
        }
    }
}