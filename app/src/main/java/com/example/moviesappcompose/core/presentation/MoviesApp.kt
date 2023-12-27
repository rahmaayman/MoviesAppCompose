package com.example.moviesappcompose.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.moviesappcompose.ui.theme.MoviesAppComposeTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MoviesApp() {
    MoviesAppComposeTheme {
        SetBarColor(color = MaterialTheme.colorScheme.inverseOnSurface)
        // A surface container using the 'background' color from the theme

        val navController = rememberNavController()
        MoviesNavGraph(navController = navController)
    }
}


@Composable
private fun SetBarColor(color: Color) {
    val systemUiController = rememberSystemUiController()
    LaunchedEffect(key1 = color) {
        systemUiController.setSystemBarsColor(color)
    }
}