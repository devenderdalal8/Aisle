package com.example.aisle.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/example/aisle/data/model/Preferences;", "", "answerId", "", "id", "value", "preferenceQuestion", "Lcom/example/aisle/data/model/PreferenceQuestion;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/aisle/data/model/PreferenceQuestion;)V", "getAnswerId", "()Ljava/lang/Integer;", "setAnswerId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "getPreferenceQuestion", "()Lcom/example/aisle/data/model/PreferenceQuestion;", "setPreferenceQuestion", "(Lcom/example/aisle/data/model/PreferenceQuestion;)V", "getValue", "setValue", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/aisle/data/model/PreferenceQuestion;)Lcom/example/aisle/data/model/Preferences;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Preferences {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "answer_id")
    private java.lang.Integer answerId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "value")
    private java.lang.Integer value;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "preference_question")
    private com.example.aisle.data.model.PreferenceQuestion preferenceQuestion;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aisle.data.model.Preferences copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer answerId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value, @org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.PreferenceQuestion preferenceQuestion) {
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
    
    public Preferences() {
        super();
    }
    
    public Preferences(@org.jetbrains.annotations.Nullable()
    java.lang.Integer answerId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value, @org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.PreferenceQuestion preferenceQuestion) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAnswerId() {
        return null;
    }
    
    public final void setAnswerId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.PreferenceQuestion component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aisle.data.model.PreferenceQuestion getPreferenceQuestion() {
        return null;
    }
    
    public final void setPreferenceQuestion(@org.jetbrains.annotations.Nullable()
    com.example.aisle.data.model.PreferenceQuestion p0) {
    }
}