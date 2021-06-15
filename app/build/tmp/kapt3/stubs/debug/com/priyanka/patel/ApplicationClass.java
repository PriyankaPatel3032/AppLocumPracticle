package com.priyanka.patel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u001f\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u001aJ\u001f\u0010\u001b\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/priyanka/patel/ApplicationClass;", "Landroid/app/Application;", "()V", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "setActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "clearePreferenceData", "", "getactivity", "onCreate", "savePreferenceDataBoolean", "key", "", "value", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "savePreferenceDataInt", "", "savePreferenceDataLong", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "savePreferenceDataString", "setActity", "Companion", "app_debug"})
public final class ApplicationClass extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AppCompatActivity activity;
    @org.jetbrains.annotations.Nullable()
    private static com.priyanka.patel.ApplicationClass mInstance;
    public static final com.priyanka.patel.ApplicationClass.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AppCompatActivity p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void setActity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AppCompatActivity getactivity() {
        return null;
    }
    
    public final void savePreferenceDataString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void savePreferenceDataBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    public final void savePreferenceDataLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
    }
    
    public final void savePreferenceDataInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    public final void clearePreferenceData() {
    }
    
    public ApplicationClass() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0082\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/priyanka/patel/ApplicationClass$Companion;", "", "()V", "mInstance", "Lcom/priyanka/patel/ApplicationClass;", "getMInstance", "()Lcom/priyanka/patel/ApplicationClass;", "setMInstance", "(Lcom/priyanka/patel/ApplicationClass;)V", "create", "context", "Landroid/content/Context;", "get", "getmInstance", "setmInstance", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.priyanka.patel.ApplicationClass getMInstance() {
            return null;
        }
        
        public final void setMInstance(@org.jetbrains.annotations.Nullable()
        com.priyanka.patel.ApplicationClass p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.priyanka.patel.ApplicationClass getmInstance() {
            return null;
        }
        
        public final void setmInstance(@org.jetbrains.annotations.Nullable()
        com.priyanka.patel.ApplicationClass mInstance) {
        }
        
        private final com.priyanka.patel.ApplicationClass get(android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.priyanka.patel.ApplicationClass create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}