package io.dpwspoon.generic.builder.sample3;

import java.util.ArrayList;
import java.util.List;

public class GatewayConfig3 {

    private List<ServiceConfig3<?>> services = new ArrayList<>();

    public <S extends ServiceConfig3<GatewayConfig3>> S service(Class<S> type) {
        final S service = ServiceConfig3.create(type, this);
        services.add(service);
        return service;
    }
}
