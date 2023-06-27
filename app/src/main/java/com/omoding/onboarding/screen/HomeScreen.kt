package com.omoding.onboarding.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omoding.onboarding.components.LoadingAnimation

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
//        Text(
//            text = "HOME",
//            fontSize = MaterialTheme.typography.h4.fontSize
//        )
        LoadingAnimation(circleSize = 10.dp, travelDistance = 10.dp)
        Text(text = "text", modifier = Modifier.fillMaxSize())
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}