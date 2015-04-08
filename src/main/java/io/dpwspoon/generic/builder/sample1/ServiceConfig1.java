package io.dpwspoon.generic.builder.sample1;

public abstract class ServiceConfig1<R> {

    private String type;

    private final R parent;

    public ServiceConfig1(R parent) {
        this.parent = parent;
    }

    public R done() {
        return parent;
    }

    public ServiceConfig1<R> type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

}
