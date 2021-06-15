package com.priyanka.patel.Api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/priyanka/patel/Api/UsesCaseResult;", "T", "", "()V", "Failed", "Success", "Lcom/priyanka/patel/Api/UsesCaseResult$Success;", "Lcom/priyanka/patel/Api/UsesCaseResult$Failed;", "app_debug"})
public abstract class UsesCaseResult<T extends java.lang.Object> {
    
    private UsesCaseResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/priyanka/patel/Api/UsesCaseResult$Success;", "T", "", "Lcom/priyanka/patel/Api/UsesCaseResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.priyanka.patel.Api.UsesCaseResult<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/priyanka/patel/Api/UsesCaseResult$Failed;", "Lcom/priyanka/patel/Api/UsesCaseResult;", "", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Failed extends com.priyanka.patel.Api.UsesCaseResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getException() {
            return null;
        }
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            super();
        }
    }
}