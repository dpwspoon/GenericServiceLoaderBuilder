package io.dpwspoon.generic.builder.sample3;

public abstract class ServiceConfig3<R> {

    private String type;

    private final R parent;

    public ServiceConfig3(R parent) {
        this.parent = parent;
    }

    public R done() {
        return parent;
    }

    public ServiceConfig3<R> type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    @SuppressWarnings("unchecked")
    public static <S extends ServiceConfig3<R>, R> S create(Class<S> type, R gatewayConfig3){
        // ServiceLoader code would be here, for now its hard coded
//            return new EchoServiceConfig<R>(parent);
            return (S) new EchoServiceConfig3<R>(gatewayConfig3);
    }
}
