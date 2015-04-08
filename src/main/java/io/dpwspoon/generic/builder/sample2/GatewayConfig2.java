package io.dpwspoon.generic.builder.sample2;

import java.util.ArrayList;
import java.util.List;

public class GatewayConfig2 {

    private List<ServiceConfig2<?>> services = new ArrayList<>();

    public ServiceConfig2<GatewayConfig2> service(String type){
        ServiceConfig2<GatewayConfig2> service = ServiceConfig2.create(type, this);
        services.add(service);
        return service;
    }
}
