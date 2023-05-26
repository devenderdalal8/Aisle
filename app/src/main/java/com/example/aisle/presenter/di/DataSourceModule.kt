package com.example.aisle.presenter.di

import com.example.aisle.data.ApiService.ApiService
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import com.example.aisle.data.repository.dataSource.NotesRemoteDataSource
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import com.example.aisle.data.repository.dataSourceImpl.LoginRemoteDataSourceImpl
import com.example.aisle.data.repository.dataSourceImpl.NotesRemoteDataSourceImpl
import com.example.aisle.data.repository.dataSourceImpl.OtpRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun provideLoginPhoneNumberDataSource(apiService: ApiService): LoginRemoteDataSource {
        return LoginRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideOtpDataSource(apiService: ApiService): OtpRemoteDataSource {
        return OtpRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideNotesDataSource(apiService: ApiService): NotesRemoteDataSource {
        return NotesRemoteDataSourceImpl(apiService)
    }


}