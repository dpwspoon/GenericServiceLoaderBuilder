package io.dpwspoon.generic.builder.sample2;

import java.net.URI;

public class EchoServiceConfig2<R> extends ServiceConfig2<R>{
    
    public EchoServiceConfig2(R parent) {
        super(parent);
    }

    private URI accept;

    public EchoServiceConfig2<R> accept(URI accept){
        this.accept = accept;
        return this;
    }

    public URI getAccept() {
        return accept;
    }

}
