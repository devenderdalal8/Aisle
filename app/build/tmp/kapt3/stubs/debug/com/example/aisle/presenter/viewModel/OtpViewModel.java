package com.example.aisle.presenter.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/aisle/presenter/viewModel/OtpViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "otpUseCase", "Lcom/example/aisle/domain/useCase/PostOtpUseCase;", "(Landroid/content/Context;Lcom/example/aisle/domain/useCase/PostOtpUseCase;)V", "_OtpResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/aisle/utils/Resource;", "Lcom/example/aisle/data/model/OtpResponseModel;", "get_OtpResponseLiveData", "()Landroidx/lifecycle/LiveData;", "otpResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "postPhoneNumberApi", "data", "Lcom/example/aisle/data/model/OtpRequestModel;", "app_debug"})
public final class OtpViewModel extends androidx.lifecycle.ViewModel {
    private android.content.Context context;
    private final com.example.aisle.domain.useCase.PostOtpUseCase otpUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.OtpResponseModel>> otpResponseLiveData = null;
    
    @javax.inject.Inject()
    public OtpViewModel(@org.jetbrains.annotations.Nullable()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.aisle.domain.useCase.PostOtpUseCase otpUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.OtpResponseModel>> get_OtpResponseLiveData() {
        return null;
    }
    
    public final void postPhoneNumberApi(@org.jetbrains.annotations.NotNull()
    com.example.aisle.data.model.OtpRequestModel data) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}