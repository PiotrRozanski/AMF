package com.greenfield.asian.movie.finder.application.service

import com.greenfield.asian.movie.finder.adapter.tmdb.TmdbRepositoryImpl
import com.greenfield.asian.movie.finder.application.mapper.mapToEntity
import com.greenfield.asian.movie.finder.domain.api.service.MovieService
import com.greenfield.asian.movie.finder.domain.model.core.Movie
import com.greenfield.asian.movie.finder.domain.spi.repository.MovieRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class MovieServiceImpl(
        private val repository: MovieRepository,
        private val api: TmdbRepositoryImpl
): MovieService {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @PostConstruct
    override fun downloadSampleMovies() {
        api.downloadSampleData().forEach {
            repository.save(it)
        }
    }
}