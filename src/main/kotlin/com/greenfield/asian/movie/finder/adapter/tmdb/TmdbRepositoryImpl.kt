package com.greenfield.asian.movie.finder.adapter.tmdb

import com.greenfield.asian.movie.finder.domain.model.core.Movie
import info.movito.themoviedbapi.TmdbApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.annotation.PostConstruct

@Repository
class TmdbRepositoryImpl {

    @Autowired
    private lateinit var tmdbClient: TmdbClient

    fun downloadSampleData() = tmdbClient.getSampleMovies()
}