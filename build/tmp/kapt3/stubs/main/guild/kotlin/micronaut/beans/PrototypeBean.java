package guild.kotlin.micronaut.beans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguild/kotlin/micronaut/beans/PrototypeBean;", "", "()V", "value", "", "getValue", "()I", "micronaut-examples"})
@io.micronaut.context.annotation.Prototype()
public class PrototypeBean {
    private final int value = 0;
    
    public int getValue() {
        return 0;
    }
    
    public PrototypeBean() {
        super();
    }
}