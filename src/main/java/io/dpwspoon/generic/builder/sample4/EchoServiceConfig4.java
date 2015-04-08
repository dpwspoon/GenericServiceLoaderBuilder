package io.dpwspoon.generic.builder.sample4;

import java.net.URI;

public class EchoServiceConfig4<R> implements ServiceConfig4<R>{
    
    public EchoServiceConfig4(R parent) {
       this.parent = parent;
    }

    private String type;
    
    public EchoServiceConfig4<R> type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    private final R parent;

    public R done() {
        return parent;
    }
    
    private URI accept;

    public EchoServiceConfig4<R> accept(URI accept){
        this.accept = accept;
        return this;
    }

    public URI getAccept() {
        return accept;
    }

}
