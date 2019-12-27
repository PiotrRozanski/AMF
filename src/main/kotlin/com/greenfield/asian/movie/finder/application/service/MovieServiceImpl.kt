package com.greenfield.asian.movie.finder.application.service

import com.greenfield.asian.movie.finder.application.mapper.mapToEntity
import com.greenfield.asian.movie.finder.domain.api.service.MovieService
import com.greenfield.asian.movie.finder.domain.model.core.Movie
import com.greenfield.asian.movie.finder.domain.spi.repository.MovieRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
        private val repository: MovieRepository
): MovieService {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    override fun downloadSampleMovies(movies: List<Movie>) {
        movies.forEach {
            repository.save(it)
        }

    }
}