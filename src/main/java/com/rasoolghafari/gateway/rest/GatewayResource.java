package com.rasoolghafari.gateway.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping
public class GatewayResource {

    @GetMapping
    public String healthCheck() {
        return "Gateway is up " + new Date().toString();
    }
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback " + new Date().toString());
    }
}
