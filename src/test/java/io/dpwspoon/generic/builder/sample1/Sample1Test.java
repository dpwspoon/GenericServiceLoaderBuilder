package io.dpwspoon.generic.builder.sample1;

import java.net.URI;

import org.junit.Test;

public class Sample1Test {

    @Test
    public void test(){
        GatewayConfig1 gc = new GatewayConfig1()
        .echoService()
            .accept(URI.create("http://someuri1:80"))
            .done()
        .echoService()
            .accept(URI.create("http://someuri2:80"))
            .accept(URI.create("http://someuri3:80"))
        .done();
    }
}
