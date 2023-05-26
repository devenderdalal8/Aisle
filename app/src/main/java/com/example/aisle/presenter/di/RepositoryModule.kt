package com.example.aisle.presenter.di

import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import com.example.aisle.data.repository.dataSource.NotesRemoteDataSource
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.domain.repository.NotesRepository
import com.example.aisle.domain.repository.OtpRepository
import com.example.aisle.domain.repositoryImpl.LoginRepositoryImpl
import com.example.aisle.domain.repositoryImpl.NotesRepositoryImpl
import com.example.aisle.domain.repositoryImpl.OtpRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideLoginRepository(loginRemoteDataSource: LoginRemoteDataSource): LoginRepository {
        return LoginRepositoryImpl(loginRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideOtpRepository(otpRemoteDataSource: OtpRemoteDataSource): OtpRepository {
        return OtpRepositoryImpl(otpRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideNotesRepository(notesRemoteDataSource: NotesRemoteDataSource): NotesRepository {
        return NotesRepositoryImpl(notesRemoteDataSource)
    }


}