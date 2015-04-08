package io.dpwspoon.generic.builder.sample2;

import org.junit.Test;

public class Sample2Test {

    @Test
    public void test(){
        GatewayConfig2 gc = new GatewayConfig2()
        .service("echo")
            // no accept binding
//            .accept(URI.create("http://someuri1:80"))
            .done()
        .service("echo")
        // no accept binding
//            .accept(URI.create("http://someuri2:80"))
//            .accept(URI.create("http://someuri3:80"))
        .done();
    }
}
