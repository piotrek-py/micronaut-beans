package guild.kotlin.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0010H\u0007J\b\u0010\u0014\u001a\u00020\u0010H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0007J\b\u0010\u0017\u001a\u00020\u0010H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lguild/kotlin/micronaut/SingletonTest;", "", "()V", "client", "Lio/micronaut/http/client/RxHttpClient;", "getClient", "()Lio/micronaut/http/client/RxHttpClient;", "setClient", "(Lio/micronaut/http/client/RxHttpClient;)V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "setMapper", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "prototypeTest", "", "refreshableTest", "requestScope2Test", "requestScopeTest", "simpleTest", "singletonTest", "threadLocal2Test", "threadLocalTest", "micronaut-examples"})
@io.micronaut.test.annotation.MicronautTest()
public final class SingletonTest {
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.RxHttpClient client;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.fasterxml.jackson.databind.ObjectMapper mapper;
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.RxHttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.RxHttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fasterxml.jackson.databind.ObjectMapper getMapper() {
        return null;
    }
    
    public final void setMapper(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper p0) {
    }
    
    @org.junit.jupiter.api.Test()
    public final void simpleTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void singletonTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void prototypeTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void refreshableTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void threadLocalTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void threadLocal2Test() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void requestScopeTest() {
    }
    
    @org.junit.jupiter.api.Test()
    public final void requestScope2Test() {
    }
    
    public SingletonTest() {
        super();
    }
}