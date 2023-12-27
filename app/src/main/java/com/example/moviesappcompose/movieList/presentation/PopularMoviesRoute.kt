package com.example.moviesappcompose.movieList.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.moviesappcompose.movieList.presentation.MovieListState
import com.example.moviesappcompose.movieList.presentation.MovieListUiEvent
import com.example.moviesappcompose.movieList.presentation.PopularMoviesScreen
import com.example.moviesappcompose.movieList.util.Screen

fun NavGraphBuilder.PopularMoviesRoute(
    movieListState: MovieListState,
    navController: NavHostController,
    onEvent: (MovieListUiEvent) -> Unit
) {
    composable(Screen.PopularMovieList.rout) {
        PopularMoviesScreen(
            navController = navController,
            movieListState = movieListState,
            onEvent = onEvent
        )
    }
}