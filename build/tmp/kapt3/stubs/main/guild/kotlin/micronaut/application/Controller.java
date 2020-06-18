package guild.kotlin.micronaut.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lguild/kotlin/micronaut/application/Controller;", "", "applicationContext", "Lio/micronaut/context/ApplicationContext;", "(Lio/micronaut/context/ApplicationContext;)V", "getApplicationContext", "()Lio/micronaut/context/ApplicationContext;", "prototypeRequest", "", "", "refreshableRequest", "requestScope", "requestScope2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "singletonRequest", "threadLocalRequest", "threadLocalRequest2", "micronaut-examples"})
@io.micronaut.http.annotation.Controller()
public class Controller {
    @org.jetbrains.annotations.NotNull()
    private final io.micronaut.context.ApplicationContext applicationContext = null;
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/singleton")
    public java.lang.Object singletonRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/prototype")
    public java.util.List<java.lang.Integer> prototypeRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/refreshable")
    public java.util.List<java.lang.Integer> refreshableRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/thread-local")
    public java.util.List<java.lang.Integer> threadLocalRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/thread-local2")
    public java.lang.Object threadLocalRequest2(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/request-scope")
    public java.util.List<java.lang.Integer> requestScope() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/request-scope2")
    public java.lang.Object requestScope2(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.context.ApplicationContext getApplicationContext() {
        return null;
    }
    
    public Controller(@org.jetbrains.annotations.NotNull()
    io.micronaut.context.ApplicationContext applicationContext) {
        super();
    }
}