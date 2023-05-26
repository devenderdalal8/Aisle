package com.example.aisle.presenter.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0016\u0010\u0019\u001a\u00020\u000e*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/example/aisle/presenter/views/OtpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBinding", "Lcom/example/aisle/databinding/ActivityOtpBinding;", "phoneNumber", "", "viewModel", "Lcom/example/aisle/presenter/viewModel/OtpViewModel;", "getViewModel", "()Lcom/example/aisle/presenter/viewModel/OtpViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initializeObserver", "", "initializeView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setOnClickListener", "startTimer", "validation", "", "otp", "setVisibility", "Landroid/view/View;", "isVisible", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OtpActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.aisle.databinding.ActivityOtpBinding mBinding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String phoneNumber = "";
    
    public OtpActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.presenter.viewModel.OtpViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setVisibility(android.view.View $this$setVisibility, boolean isVisible) {
    }
    
    private final void initializeView() {
    }
    
    private final void startTimer() {
    }
    
    private final void setOnClickListener() {
    }
    
    private final void initializeObserver() {
    }
    
    private final boolean validation(java.lang.String otp) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}