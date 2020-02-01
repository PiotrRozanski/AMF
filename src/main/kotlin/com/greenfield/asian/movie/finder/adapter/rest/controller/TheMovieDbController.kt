package com.greenfield.asian.movie.finder.adapter.rest.controller

import com.greenfield.asian.movie.finder.domain.api.service.MovieService
import com.greenfield.asian.movie.finder.domain.model.core.Movie
import info.movito.themoviedbapi.TmdbApi
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/tmdb")
class TheMovieDbController(
        private val service: MovieService
) {

    private var logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping(value = ["/download/sample"])
    fun downloadSampleMovies() {
        service.downloadSampleMovies()
    }
}