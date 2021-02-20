package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 从配置中心刷新配置
public class ConfigController {

    @Value("${name:'aaa'}")
    private String name;

    @GetMapping("/getName")
    public String getName() {
        return name;
    }
}
