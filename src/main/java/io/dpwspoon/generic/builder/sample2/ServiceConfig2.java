package io.dpwspoon.generic.builder.sample2;

public abstract class ServiceConfig2<R> {

    private String type;

    private final R parent;

    public ServiceConfig2(R parent) {
        this.parent = parent;
    }

    public R done() {
        return parent;
    }

    public ServiceConfig2<R> type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    @SuppressWarnings("unchecked")
    public static <S extends ServiceConfig2<R>, R> S create(String type, R parent){
        // ServiceLoader code would be here, for now its hard coded
        if(type.equals("echo")){
//            return new EchoServiceConfig<R>(parent);
            return (S) new EchoServiceConfig2<R>(parent);
        }
        return null;
    }
}
