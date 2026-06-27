package com.appsnweb.astronomer.domain.model

data class Apod(
    val date: String,
    val explanation: String,
    val title: String,
    val url: String,
    val hdurl: String?,
    val mediaType: String
)
