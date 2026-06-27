package com.appsnweb.astronomer.domain.usecase

import com.appsnweb.astronomer.domain.model.Apod
import com.appsnweb.astronomer.domain.repository.NasaRepository
import javax.inject.Inject

class GetApodUseCase @Inject constructor(
    private val repository: NasaRepository
) {
    suspend operator fun invoke(date: String? = null): Result<Apod> {
        return repository.getApod(date)
    }
}
