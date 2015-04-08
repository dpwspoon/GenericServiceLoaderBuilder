package io.dpwspoon.generic.builder.sample4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Service;

public class GatewayConfig4 {

    private List<ServiceConfig4<?>> services = new ArrayList<>();

//    public <S extends ServiceConfig4<GatewayConfig4>> S service(Class<S> type) {
//        final S service = ServiceConfig4.create(type, this);
//        services.add(service);
//        return service;
//    }

    public <S> S service(String type) {
        // do some service loader to get specific service
        // use service loader to create an instance of S
        return null;
    }
}
