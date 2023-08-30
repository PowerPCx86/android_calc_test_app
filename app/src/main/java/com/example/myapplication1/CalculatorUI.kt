package com.example.myapplication1

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorUI(viewModel: CalculatorViewModel)
{
    val exception = viewModel.expression
    val buttonSpacing = 8.dp
    Log.d("MainActivity", "onCreate: ${viewModel.expression.value}")
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray))
    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter), verticalArrangement = Arrangement.spacedBy(buttonSpacing))
        {
            LazyRow(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth(), reverseLayout = true)
            {

            }
        }
    }
}