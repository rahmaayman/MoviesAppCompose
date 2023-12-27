package com.example.moviesappcompose.core.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.moviesappcompose.movieList.presentation.MovieListState
import com.example.moviesappcompose.movieList.presentation.MovieListUiEvent
import com.example.moviesappcompose.movieList.presentation.PopularMoviesRoute
import com.example.moviesappcompose.movieList.presentation.UpcomingMoviesRoute
import com.example.moviesappcompose.movieList.util.Screen

@Composable
fun BottomBarNavGraph(
    bottomNavController: NavHostController,
    movieListState: MovieListState,
    navController: NavHostController,
    onEvent: (MovieListUiEvent) -> Unit
) {
    NavHost(
        navController = bottomNavController,
        startDestination = Screen.PopularMovieList.rout
    ) {
        PopularMoviesRoute(
            movieListState = movieListState,
            navController = navController,
            onEvent = onEvent
        )
        UpcomingMoviesRoute(
            movieListState = movieListState,
            navController = navController,
            onEvent = onEvent
        )
    }
}