package com.example.demo.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class DemoService {

    @SentinelResource(value = "sayHello", blockHandler = "blockHandler", fallback = "fallback")
//    @SentinelResource(value = "sayHello")
    public String sayHello(String to) {
        return "Hello " + to;
    }

    public String fallback(String to) {
        return "fallback " + to;
    }

    public String blockHandler(String to, BlockException ex) {
        ex.printStackTrace();
        return "blockHandler " + to;
    }
}
