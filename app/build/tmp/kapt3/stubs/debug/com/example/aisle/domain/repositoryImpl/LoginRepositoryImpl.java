package com.example.aisle.domain.repositoryImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/aisle/domain/repositoryImpl/LoginRepositoryImpl;", "Lcom/example/aisle/domain/repository/LoginRepository;", "loginRemoteDataSource", "Lcom/example/aisle/data/repository/dataSource/LoginRemoteDataSource;", "(Lcom/example/aisle/data/repository/dataSource/LoginRemoteDataSource;)V", "postLoginPhone", "Lcom/example/aisle/utils/Resource;", "Lcom/example/aisle/data/model/LoginResponseModel;", "data", "Lcom/example/aisle/data/model/LoginRequestModel;", "(Lcom/example/aisle/data/model/LoginRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "response", "Lretrofit2/Response;", "app_debug"})
public final class LoginRepositoryImpl implements com.example.aisle.domain.repository.LoginRepository {
    private final com.example.aisle.data.repository.dataSource.LoginRemoteDataSource loginRemoteDataSource = null;
    
    @javax.inject.Inject()
    public LoginRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.repository.dataSource.LoginRemoteDataSource loginRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object postLoginPhone(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.model.LoginRequestModel data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.aisle.utils.Resource<com.example.aisle.data.model.LoginResponseModel>> continuation) {
        return null;
    }
    
    private final com.example.aisle.utils.Resource<com.example.aisle.data.model.LoginResponseModel> response(retrofit2.Response<com.example.aisle.data.model.LoginResponseModel> response) {
        return null;
    }
}