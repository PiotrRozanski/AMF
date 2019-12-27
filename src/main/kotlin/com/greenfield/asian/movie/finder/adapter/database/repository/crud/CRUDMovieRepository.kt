package com.greenfield.asian.movie.finder.adapter.database.repository.crud

import com.greenfield.asian.movie.finder.adapter.database.entity.MovieEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface CRUDMovieRepository : MongoRepository<MovieEntity, Int>