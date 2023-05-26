package com.example.aisle.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/aisle/data/model/NotesResponseModel;", "", "invites", "Lcom/example/aisle/data/model/Invites;", "likes", "Lcom/example/aisle/data/model/Likes;", "(Lcom/example/aisle/data/model/Invites;Lcom/example/aisle/data/model/Likes;)V", "getInvites", "()Lcom/example/aisle/data/model/Invites;", "setInvites", "(Lcom/example/aisle/data/model/Invites;)V", "getLikes", "()Lcom/example/aisle/data/model/Likes;", "setLikes", "(Lcom/example/aisle/data/model/Likes;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class NotesResponseModel {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "invites")
    private com.example.aisle.data.model.Invites invites;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "likes")
    private com.example.aisle.data.model.Likes likes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.data.model.NotesResponseModel copy(@org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Invites invites, @org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Likes likes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NotesResponseModel() {
        super();
    }
    
    public NotesResponseModel(@org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Invites invites, @org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Likes likes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.Invites component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.Invites getInvites() {
        return null;
    }
    
    public final void setInvites(@org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Invites p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.Likes component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.Likes getLikes() {
        return null;
    }
    
    public final void setLikes(@org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.Likes p0) {
    }
}