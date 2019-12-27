package com.greenfield.asian.movie.finder.adapter.database.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "Movie")
class MovieEntity(
        @Id
        private val id: UUID = UUID.randomUUID(),
        val title: String = "",
        val country:  String = ""
)