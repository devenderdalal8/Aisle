package com.example.aisle.presenter.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/aisle/presenter/di/RepositoryModule;", "", "()V", "provideLoginRepository", "Lcom/example/aisle/domain/repository/LoginRepository;", "loginRemoteDataSource", "Lcom/example/aisle/data/repository/dataSource/LoginRemoteDataSource;", "provideNotesRepository", "Lcom/example/aisle/domain/repository/NotesRepository;", "notesRemoteDataSource", "Lcom/example/aisle/data/repository/dataSource/NotesRemoteDataSource;", "provideOtpRepository", "Lcom/example/aisle/domain/repository/OtpRepository;", "otpRemoteDataSource", "Lcom/example/aisle/data/repository/dataSource/OtpRemoteDataSource;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.domain.repository.LoginRepository provideLoginRepository(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.repository.dataSource.LoginRemoteDataSource loginRemoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.domain.repository.OtpRepository provideOtpRepository(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.repository.dataSource.OtpRemoteDataSource otpRemoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.aisle.domain.repository.NotesRepository provideNotesRepository(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.repository.dataSource.NotesRemoteDataSource notesRemoteDataSource) {
        return null;
    }
}