package com.greenfield.asian.movie.finder.adapter.database.repository

import com.greenfield.asian.movie.finder.adapter.database.repository.crud.CRUDMovieRepository
import com.greenfield.asian.movie.finder.application.mapper.mapToEntity
import com.greenfield.asian.movie.finder.domain.model.core.Movie
import com.greenfield.asian.movie.finder.domain.spi.repository.MovieRepository
import org.springframework.stereotype.Repository

@Repository
class MovieRepositoryImpl(
        private val crud: CRUDMovieRepository
): MovieRepository {

    override fun save(movie: Movie) {
        crud.save(movie.mapToEntity())
    }
}