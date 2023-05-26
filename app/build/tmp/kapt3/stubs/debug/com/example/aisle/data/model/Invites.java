package com.example.aisle.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ@\u0010\u0018\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/example/aisle/data/model/Invites;", "", "profiles", "Ljava/util/ArrayList;", "Lcom/example/aisle/data/model/Profiles;", "Lkotlin/collections/ArrayList;", "totalPages", "", "pendingInvitationsCount", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPendingInvitationsCount", "()Ljava/lang/Integer;", "setPendingInvitationsCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfiles", "()Ljava/util/ArrayList;", "setProfiles", "(Ljava/util/ArrayList;)V", "getTotalPages", "setTotalPages", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/aisle/data/model/Invites;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Invites {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "profiles")
    private java.util.ArrayList<com.example.aisle.data.model.Profiles> profiles;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "totalPages")
    private java.lang.Integer totalPages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pending_invitations_count")
    private java.lang.Integer pendingInvitationsCount;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.data.model.Invites copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Profiles> profiles, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pendingInvitationsCount) {
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
    
    public Invites() {
        super();
    }
    
    public Invites(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Profiles> profiles, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pendingInvitationsCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.Profiles> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.Profiles> getProfiles() {
        return null;
    }
    
    public final void setProfiles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Profiles> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPendingInvitationsCount() {
        return null;
    }
    
    public final void setPendingInvitationsCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}