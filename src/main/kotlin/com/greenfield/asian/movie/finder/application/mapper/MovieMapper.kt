package com.greenfield.asian.movie.finder.application.mapper

import com.greenfield.asian.movie.finder.adapter.database.entity.MovieEntity
import com.greenfield.asian.movie.finder.domain.model.core.Movie

fun MovieEntity.mapToDomain() =
        Movie(
                title = this.title,
                country = this.country
        )

fun Movie.mapToEntity() =
        MovieEntity(
                title = this.title,
                country = this.country
        )