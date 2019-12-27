package com.greenfield.asian.movie.finder.adapter.rest.controller

import com.greenfield.asian.movie.finder.domain.api.service.MovieService
import com.greenfield.asian.movie.finder.domain.model.core.Movie
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/trakt")
class TraktTvController(
        private val service: MovieService
) {

    private var logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping(value = ["/download/sample"])
    fun downloadSampleMovies() {
         service.downloadSampleMovies(arrayListOf(Movie("1", "2")))
    }
}