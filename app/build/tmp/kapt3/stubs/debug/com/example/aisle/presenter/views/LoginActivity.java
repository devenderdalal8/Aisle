package com.example.aisle.presenter.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\u001b\u001a\u00020\u000f*\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/aisle/presenter/views/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "code", "", "mBinding", "Lcom/example/aisle/databinding/ActivityLoginBinding;", "phone", "viewModel", "Lcom/example/aisle/presenter/viewModel/LoginViewModel;", "getViewModel", "()Lcom/example/aisle/presenter/viewModel/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "setObservers", "setOnClickListener", "validates", "", "setVisibility", "Landroid/view/View;", "isVisible", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.aisle.databinding.ActivityLoginBinding mBinding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String code;
    private java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.aisle.presenter.views.LoginActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    
    public LoginActivity() {
        super();
    }
    
    private final com.example.aisle.presenter.viewModel.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setOnClickListener() {
    }
    
    private final void setVisibility(android.view.View $this$setVisibility, boolean isVisible) {
    }
    
    private final void setObservers() {
    }
    
    private final boolean validates(java.lang.String code, java.lang.String phone) {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/aisle/presenter/views/LoginActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}