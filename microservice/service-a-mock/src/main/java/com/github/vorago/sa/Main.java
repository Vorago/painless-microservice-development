package com.github.vorago.sa;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class Main {
    public static void main(String[] args) {
        new WireMockServer(8888).start();
        WireMock.configureFor(8888);

        stubFor(get(urlEqualTo("/hello"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "text/plain")
                .withBody("Hello, World!")));
    }
}
