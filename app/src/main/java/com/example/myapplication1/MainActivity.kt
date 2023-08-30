package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import com.example.myapplication1.ui.theme.MyApplication1Theme

//import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication1Theme {
                val viewModel = CalculatorViewModel()
                //val systemUiController = rememberSystemUiController()
                SideEffect {
                    //systemUiController.setSystemBarsColor(
                    //color = DarkGray,
                    //darkIcons = false
                    //)
                }
                CalculatorUI(
                    viewModel = viewModel,
                )
            }
        }
    }
}