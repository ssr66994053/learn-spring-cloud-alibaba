package com.example.demo.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "demo", fallback = EchoServiceFallback.class)
public interface EchoApi {

    @GetMapping("/p/echo/{str}")
    public String echo(@PathVariable("str") String str);

}
