package com.example.aisle.data.ApiService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/aisle/data/ApiService/ApiService;", "", "getNotesApi", "Lretrofit2/Response;", "Lcom/example/aisle/data/model/NotesResponseModel;", "auth", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLogin", "Lcom/example/aisle/data/model/LoginResponseModel;", "number", "Lcom/example/aisle/data/model/LoginRequestModel;", "(Lcom/example/aisle/data/model/LoginRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postOtp", "Lcom/example/aisle/data/model/OtpResponseModel;", "Lcom/example/aisle/data/model/OtpRequestModel;", "(Lcom/example/aisle/data/model/OtpRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users/phone_number_login")
    public abstract java.lang.Object postLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.aisle.data.model.LoginRequestModel number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aisle.data.model.LoginResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users/verify_otp")
    public abstract java.lang.Object postOtp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.aisle.data.model.OtpRequestModel number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aisle.data.model.OtpResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/test_profile_list")
    public abstract java.lang.Object getNotesApi(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aisle.data.model.NotesResponseModel>> continuation);
}