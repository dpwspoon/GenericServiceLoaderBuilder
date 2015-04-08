package io.dpwspoon.generic.builder.sample3;

import java.net.URI;

public class EchoServiceConfig3<R> extends ServiceConfig3<R>{
    
    public EchoServiceConfig3(R parent) {
        super(parent);
    }

    private URI accept;

    public EchoServiceConfig3<R> accept(URI accept){
        this.accept = accept;
        return this;
    }

    public URI getAccept() {
        return accept;
    }

}
