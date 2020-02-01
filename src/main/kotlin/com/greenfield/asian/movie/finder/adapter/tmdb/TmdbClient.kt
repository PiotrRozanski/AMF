package com.greenfield.asian.movie.finder.adapter.tmdb

import com.greenfield.asian.movie.finder.domain.model.core.Movie
import info.movito.themoviedbapi.TmdbApi
import org.springframework.stereotype.Component

@Component
class TmdbClient {

    private val apiKey = "8cadacb5fc6b6332713462ca575a2ebe"
    private val client = TmdbApi(apiKey)

    fun build(): TmdbApi {
        return client
    }

    fun getSampleMovies(): ArrayList<Movie> {
        val movies = client.movies
        val moviesList = ArrayList<Movie>()
        (1..5).forEach {
            movies.getPopularMovies("US", it).forEach { movie ->
                moviesList.add(Movie(movie.title,
                        movie.originalLanguage))
            }
        }
        return moviesList
    }
}