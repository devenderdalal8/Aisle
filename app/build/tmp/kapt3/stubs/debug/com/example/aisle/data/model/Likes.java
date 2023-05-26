package com.example.aisle.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J@\u0010\u001c\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\tH\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006#"}, d2 = {"Lcom/example/aisle/data/model/Likes;", "", "profiles", "Ljava/util/ArrayList;", "Lcom/example/aisle/data/model/AvatarProfiles;", "Lkotlin/collections/ArrayList;", "canSeeProfile", "", "likesReceivedCount", "", "(Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCanSeeProfile", "()Ljava/lang/Boolean;", "setCanSeeProfile", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLikesReceivedCount", "()Ljava/lang/Integer;", "setLikesReceivedCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProfiles", "()Ljava/util/ArrayList;", "setProfiles", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/example/aisle/data/model/Likes;", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class Likes {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "profiles")
    private java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> profiles;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "can_see_profile")
    private java.lang.Boolean canSeeProfile;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "likes_received_count")
    private java.lang.Integer likesReceivedCount;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.data.model.Likes copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> profiles, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean canSeeProfile, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likesReceivedCount) {
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
    
    public Likes() {
        super();
    }
    
    public Likes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> profiles, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean canSeeProfile, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likesReceivedCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> getProfiles() {
        return null;
    }
    
    public final void setProfiles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.AvatarProfiles> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCanSeeProfile() {
        return null;
    }
    
    public final void setCanSeeProfile(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLikesReceivedCount() {
        return null;
    }
    
    public final void setLikesReceivedCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}