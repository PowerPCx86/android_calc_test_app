package com.example.myapplication1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    testStyle: TextStyle = TextStyle()
) {
    Box(
        modifier = modifier.then(
            Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(color)
        ),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = symbol,
            style = TextStyle(),
            fontSize = 36.sp,
            color = Color.White
        )
    }

}
