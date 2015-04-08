package io.dpwspoon.generic.builder.sample4;

import java.net.URI;

import org.junit.Test;

public class Sample4Test {

    @Test
    public void test(){
        GatewayConfig4 gc = new GatewayConfig4()
        .<EchoServiceConfig4<GatewayConfig4>>service("echo")
            .accept(URI.create("http://someuri2:80"))
            .type("echo")
            .accept(URI.create("http://someuri4:80"))
        .done()
        .<EchoServiceConfig4<GatewayConfig4>>service("echo")
            .accept(URI.create("http://someuri2:80"))
            .type("echo")
            .accept(URI.create("http://someuri4:80"))
        .done();
    }
}
