package com.example.moviesappcompose.details.presentation

import com.example.moviesappcompose.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
