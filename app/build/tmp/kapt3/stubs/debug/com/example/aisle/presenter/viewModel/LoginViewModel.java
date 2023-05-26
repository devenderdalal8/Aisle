package com.example.aisle.presenter.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/aisle/presenter/viewModel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "loginUseCase", "Lcom/example/aisle/domain/useCase/PostLoginUseCase;", "(Landroid/content/Context;Lcom/example/aisle/domain/useCase/PostLoginUseCase;)V", "_loginResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/aisle/utils/Resource;", "Lcom/example/aisle/data/model/LoginResponseModel;", "get_loginResponseLiveData", "()Landroidx/lifecycle/LiveData;", "getContext", "()Landroid/content/Context;", "loginResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "postPhoneNumberApi", "", "data", "Lcom/example/aisle/data/model/LoginRequestModel;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.example.aisle.domain.useCase.PostLoginUseCase loginUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.LoginResponseModel>> loginResponseLiveData = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.aisle.domain.useCase.PostLoginUseCase loginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.LoginResponseModel>> get_loginResponseLiveData() {
        return null;
    }
    
    public final void postPhoneNumberApi(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.model.LoginRequestModel data) {
    }
}