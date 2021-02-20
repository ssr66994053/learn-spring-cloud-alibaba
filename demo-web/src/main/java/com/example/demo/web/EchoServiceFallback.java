package com.example.demo.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class EchoServiceFallback implements EchoApi {

    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }
}
