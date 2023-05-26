package com.example.aisle.presenter.views.ui.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020&H\u0002J\u0016\u0010-\u001a\u00020&*\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00060"}, d2 = {"Lcom/example/aisle/presenter/views/ui/notes/NotesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/aisle/databinding/FragmentNotesBinding;", "adapter", "Lcom/example/aisle/presenter/views/adapter/ProfileAdapter;", "getAdapter", "()Lcom/example/aisle/presenter/views/adapter/ProfileAdapter;", "setAdapter", "(Lcom/example/aisle/presenter/views/adapter/ProfileAdapter;)V", "binding", "getBinding", "()Lcom/example/aisle/databinding/FragmentNotesBinding;", "profileList", "Landroidx/databinding/ObservableArrayList;", "Lcom/example/aisle/data/model/AvatarProfiles;", "getProfileList", "()Landroidx/databinding/ObservableArrayList;", "setProfileList", "(Landroidx/databinding/ObservableArrayList;)V", "token", "", "viewModel", "Lcom/example/aisle/presenter/viewModel/MainViewModel;", "getViewModel", "()Lcom/example/aisle/presenter/viewModel/MainViewModel;", "setViewModel", "(Lcom/example/aisle/presenter/viewModel/MainViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setData", "data", "Lcom/example/aisle/data/model/NotesResponseModel;", "setObservable", "setVisibility", "isVisible", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NotesFragment extends androidx.fragment.app.Fragment {
    private com.example.aisle.databinding.FragmentNotesBinding _binding;
    public com.example.aisle.presenter.viewModel.MainViewModel viewModel;
    public com.example.aisle.presenter.views.adapter.ProfileAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableArrayList<com.example.aisle.data.model.AvatarProfiles> profileList;
    private java.lang.String token = "";
    
    public NotesFragment() {
        super();
    }
    
    private final com.example.aisle.databinding.FragmentNotesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.presenter.viewModel.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.aisle.presenter.viewModel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.presenter.views.adapter.ProfileAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.aisle.presenter.views.adapter.ProfileAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.example.aisle.data.model.AvatarProfiles> getProfileList() {
        return null;
    }
    
    public final void setProfileList(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<com.example.aisle.data.model.AvatarProfiles> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObservable() {
    }
    
    private final void setData(com.example.aisle.data.model.NotesResponseModel data) {
    }
    
    private final void setVisibility(android.view.View $this$setVisibility, boolean isVisible) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}