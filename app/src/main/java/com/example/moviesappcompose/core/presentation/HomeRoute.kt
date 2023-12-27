package com.example.moviesappcompose.core.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.moviesappcompose.movieList.util.Screen

fun NavGraphBuilder.homeRoute(
    navController: NavHostController
) {
    composable(Screen.Home.rout) {
        HomeScreen(navController = navController)
    }

}