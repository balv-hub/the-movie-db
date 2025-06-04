package com.balv.imdb.ui.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.balv.imdb.R

@Composable
fun LottieLoadingIndicator(
    modifier: Modifier = Modifier,
    animationResId: Int = R.raw.loading,
    size: Dp = 150.dp
) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(animationResId))

    Box(
        modifier = modifier.fillMaxSize(), 
        contentAlignment = Alignment.Center
    ) {
        
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever, 
            modifier = Modifier.size(size)
        )
    }
}



@Composable
fun LoadingIndicator() {
    
    LottieLoadingIndicator(
        animationResId = R.raw.loading,
        size = 200.dp
    )
}