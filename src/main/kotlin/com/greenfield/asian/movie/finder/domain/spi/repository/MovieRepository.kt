package com.greenfield.asian.movie.finder.domain.spi.repository

import com.greenfield.asian.movie.finder.domain.model.core.Movie

interface MovieRepository {
    fun save(movie: Movie)
}