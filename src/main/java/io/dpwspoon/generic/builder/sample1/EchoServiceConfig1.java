package io.dpwspoon.generic.builder.sample1;

import java.net.URI;

public class EchoServiceConfig1<R> extends ServiceConfig1<R>{
    
    public EchoServiceConfig1(R parent) {
        super(parent);
    }

    private URI accept;

    public EchoServiceConfig1<R> accept(URI accept){
        this.accept = accept;
        return this;
    }

    public URI getAccept() {
        return accept;
    }

}
