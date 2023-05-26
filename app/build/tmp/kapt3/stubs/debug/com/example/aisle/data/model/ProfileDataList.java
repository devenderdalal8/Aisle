package com.example.aisle.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/example/aisle/data/model/ProfileDataList;", "", "question", "", "preferences", "Ljava/util/ArrayList;", "Lcom/example/aisle/data/model/Preferences;", "Lkotlin/collections/ArrayList;", "invitationType", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getInvitationType", "()Ljava/lang/String;", "setInvitationType", "(Ljava/lang/String;)V", "getPreferences", "()Ljava/util/ArrayList;", "setPreferences", "(Ljava/util/ArrayList;)V", "getQuestion", "setQuestion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ProfileDataList {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "question")
    private java.lang.String question;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "preferences")
    private java.util.ArrayList<com.example.aisle.data.model.Preferences> preferences;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "invitation_type")
    private java.lang.String invitationType;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.data.model.ProfileDataList copy(@org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Preferences> preferences, @org.jetbrains.annotations.Nullable()
    java.lang.String invitationType) {
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
    
    public ProfileDataList() {
        super();
    }
    
    public ProfileDataList(@org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Preferences> preferences, @org.jetbrains.annotations.Nullable()
    java.lang.String invitationType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.Preferences> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.aisle.data.model.Preferences> getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.aisle.data.model.Preferences> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInvitationType() {
        return null;
    }
    
    public final void setInvitationType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}