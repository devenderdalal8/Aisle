package com.example.aisle.presenter.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/aisle/presenter/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "notesUseCase", "Lcom/example/aisle/domain/useCase/GetNotesUseCase;", "(Landroid/content/Context;Lcom/example/aisle/domain/useCase/GetNotesUseCase;)V", "_NotesResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/aisle/utils/Resource;", "Lcom/example/aisle/data/model/NotesResponseModel;", "get_NotesResponseLiveData", "()Landroidx/lifecycle/LiveData;", "getContext", "()Landroid/content/Context;", "notesResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "token", "", "getToken", "postNotesApi", "", "setToken", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.example.aisle.domain.useCase.GetNotesUseCase notesUseCase = null;
    private java.lang.String token = "";
    private final androidx.lifecycle.MutableLiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.NotesResponseModel>> notesResponseLiveData = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.aisle.domain.useCase.GetNotesUseCase notesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.aisle.utils.Resource<com.example.aisle.data.model.NotesResponseModel>> get_NotesResponseLiveData() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void postNotesApi() {
    }
}