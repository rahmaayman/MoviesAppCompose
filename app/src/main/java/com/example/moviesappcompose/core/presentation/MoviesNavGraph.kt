package com.example.moviesappcompose.core.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.moviesappcompose.details.presentation.movieDetailsRoute
import com.example.moviesappcompose.movieList.util.Screen

@Composable
fun MoviesNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.rout
    ) {

        homeRoute(navController = navController)
        movieDetailsRoute(navController = navController)

    }
}