package com.appsnweb.astronomer.data.remote.dto

import com.appsnweb.astronomer.domain.model.Apod
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(InternalSerializationApi::class)
@Serializable
data class ApodDto(
    val date: String,
    val explanation: String,
    val title: String,
    val url: String,
    val hdurl: String? = null,
    @SerialName("media_type")
    val mediaType: String
)

fun ApodDto.toDomain(): Apod {
    return Apod(
        date = date,
        explanation = explanation,
        title = title,
        url = url,
        hdurl = hdurl,
        mediaType = mediaType
    )
}
