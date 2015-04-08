package io.dpwspoon.generic.builder.sample1;

import java.util.ArrayList;
import java.util.List;

public class GatewayConfig1 {

    private List<ServiceConfig1<?>> services = new ArrayList<>();

    public EchoServiceConfig1<GatewayConfig1> echoService(){
        EchoServiceConfig1<GatewayConfig1> echoServiceConfig = new EchoServiceConfig1<GatewayConfig1>(this);
        services.add(echoServiceConfig);
        return echoServiceConfig;
    }
}
