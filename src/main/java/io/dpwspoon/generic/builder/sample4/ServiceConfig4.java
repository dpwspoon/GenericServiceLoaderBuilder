package io.dpwspoon.generic.builder.sample4;

public interface ServiceConfig4<R> {

    public R done();

    @SuppressWarnings("unchecked")
    public static <S extends ServiceConfig4<R>, R> S create(String type, R gatewayConfig3){
        // ServiceLoader code would be here, for now its hard coded
//            return new EchoServiceConfig<R>(parent);
            return (S) new EchoServiceConfig4<R>(gatewayConfig3);
    }
}
