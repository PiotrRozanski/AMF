package com.greenfield.asian.movie.finder.domain.api.service

import com.greenfield.asian.movie.finder.domain.model.core.Movie

interface MovieService {
    fun downloadSampleMovies(movies: List<Movie>)
}