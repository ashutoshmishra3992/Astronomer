package com.appsnweb.astronomer.data.remote

import com.appsnweb.astronomer.data.remote.dto.ApodDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import javax.inject.Inject

class NasaRemoteDataSource @Inject constructor(
    private val client: HttpClient
) {
    suspend fun getApod(date: String? = null): ApodDto {
        return client.get("planetary/apod") {
            parameter("api_key", "DEMO_KEY")
            date?.let { parameter("date", it) }
        }.body()
    }
}
