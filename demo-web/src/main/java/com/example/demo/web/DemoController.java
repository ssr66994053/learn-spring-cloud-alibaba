package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    private DemoService demoService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/say/{to}")
    @ResponseBody
    public String say(@PathVariable("to") String to) {
        return demoService.sayHello(to);
    }

    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
