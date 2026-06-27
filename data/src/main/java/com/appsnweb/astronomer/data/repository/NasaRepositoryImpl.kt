package com.appsnweb.astronomer.data.repository

import com.appsnweb.astronomer.data.remote.NasaRemoteDataSource
import com.appsnweb.astronomer.data.remote.dto.toDomain
import com.appsnweb.astronomer.domain.model.Apod
import com.appsnweb.astronomer.domain.repository.NasaRepository
import javax.inject.Inject

class NasaRepositoryImpl @Inject constructor(
    private val remoteDataSource: NasaRemoteDataSource
) : NasaRepository {
    override suspend fun getApod(date: String?): Result<Apod> {
        return try {
            val response = remoteDataSource.getApod(date)
            Result.success(response.toDomain())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
