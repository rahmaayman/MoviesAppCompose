package com.example.moviesappcompose.details.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.moviesappcompose.details.presentation.MovieDetailsArgs.Companion.STR_MOVIE_ID_ARGS
import com.example.moviesappcompose.movieList.util.Screen

fun NavController.navigateToMovieDetailsScreen(
    strMovieId: Int
) {
    navigate(Screen.Details.rout + "/${strMovieId}")
}

fun NavGraphBuilder.movieDetailsRoute(
    navController: NavController
) {
    composable(
        Screen.Details.rout + "/{${STR_MOVIE_ID_ARGS}}",
        arguments = listOf(
            navArgument(STR_MOVIE_ID_ARGS) { type = NavType.IntType }
        )
    ) { backStackEntry ->
        DetailsScreen()
    }
}

class MovieDetailsArgs(
    savedStateHandle: SavedStateHandle
) {
    val movieId: Int = checkNotNull(savedStateHandle[STR_MOVIE_ID_ARGS])

    companion object {
        const val STR_MOVIE_ID_ARGS = "movieId"
    }
}