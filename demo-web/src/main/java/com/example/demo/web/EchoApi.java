package com.example.demo.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("demo")
public interface EchoApi {

    @GetMapping("/p/echo/{string}")
    public String echo(@PathVariable String string);
}
