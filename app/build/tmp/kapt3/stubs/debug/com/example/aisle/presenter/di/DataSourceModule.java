package com.example.aisle.presenter.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/aisle/presenter/di/DataSourceModule;", "", "()V", "provideLoginPhoneNumberDataSource", "Lcom/example/aisle/data/repository/dataSource/LoginRemoteDataSource;", "apiService", "Lcom/example/aisle/data/ApiService/ApiService;", "provideNotesDataSource", "Lcom/example/aisle/data/repository/dataSource/NotesRemoteDataSource;", "provideOtpDataSource", "Lcom/example/aisle/data/repository/dataSource/OtpRemoteDataSource;", "app_debug"})
@dagger.Module()
public final class DataSourceModule {
    
    public DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.data.repository.dataSource.LoginRemoteDataSource provideLoginPhoneNumberDataSource(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.ApiService.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.data.repository.dataSource.OtpRemoteDataSource provideOtpDataSource(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.ApiService.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.data.repository.dataSource.NotesRemoteDataSource provideNotesDataSource(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.ApiService.ApiService apiService) {
        return null;
    }
}