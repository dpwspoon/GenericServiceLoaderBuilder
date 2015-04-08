package io.dpwspoon.generic.builder.sample3;

import java.net.URI;

import org.junit.Test;

public class Sample3Test {

    @Test
    public void test(){
        GatewayConfig3 gc = new GatewayConfig3()
        .service(EchoServiceConfig3.class)
            .accept(URI.create("http://someuri1:80"))
            .type("sometype")
//            type hides return type on accept
//           .accept(URI.create("http://someuri1:80"))
        .done()
        // can't add more services here because type object is returned ....
//        .service(EchoServiceConfig3.class)
//            .accept(URI.create("http://someuri2:80"))
//            .accept(URI.create("http://someuri3:80"))
//        .done();
    }
}
