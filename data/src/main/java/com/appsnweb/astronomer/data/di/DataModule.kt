package com.appsnweb.astronomer.data.di

import com.appsnweb.astronomer.data.AndroidLogger
import com.appsnweb.astronomer.data.repository.NasaRepositoryImpl
import com.appsnweb.astronomer.domain.Logger
import com.appsnweb.astronomer.domain.repository.NasaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindLogger(impl: AndroidLogger): Logger

    @Binds
    @Singleton
    abstract fun bindNasaRepository(impl: NasaRepositoryImpl): NasaRepository
}
