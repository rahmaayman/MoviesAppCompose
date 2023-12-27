package com.example.moviesappcompose.movieList.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.moviesappcompose.movieList.presentation.MovieListState
import com.example.moviesappcompose.movieList.presentation.MovieListUiEvent
import com.example.moviesappcompose.movieList.presentation.UpcomingMoviesScreen
import com.example.moviesappcompose.movieList.util.Screen

fun NavGraphBuilder.UpcomingMoviesRoute(
    movieListState: MovieListState,
    navController: NavHostController,
    onEvent: (MovieListUiEvent) -> Unit
) {
    composable(Screen.UpcomingMovieList.rout) {
        UpcomingMoviesScreen(
            navController = navController,
            movieListState = movieListState,
            onEvent = onEvent
        )
    }

}