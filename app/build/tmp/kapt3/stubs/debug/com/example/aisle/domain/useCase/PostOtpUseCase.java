package com.example.aisle.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/aisle/domain/useCase/PostOtpUseCase;", "", "otpRepository", "Lcom/example/aisle/domain/repository/OtpRepository;", "(Lcom/example/aisle/domain/repository/OtpRepository;)V", "execute", "Lcom/example/aisle/utils/Resource;", "Lcom/example/aisle/data/model/OtpResponseModel;", "data", "Lcom/example/aisle/data/model/OtpRequestModel;", "(Lcom/example/aisle/data/model/OtpRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PostOtpUseCase {
    private final com.example.aisle.domain.repository.OtpRepository otpRepository = null;
    
    @javax.inject.Inject()
    public PostOtpUseCase(@org.jetbrains.annotations.NotNull()
    com.example.aisle.domain.repository.OtpRepository otpRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.model.OtpRequestModel data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.aisle.utils.Resource<com.example.aisle.data.model.OtpResponseModel>> continuation) {
        return null;
    }
}