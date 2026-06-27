package com.appsnweb.astronomer.domain.repository

import com.appsnweb.astronomer.domain.model.Apod

interface NasaRepository {
    suspend fun getApod(date: String? = null): Result<Apod>
}
