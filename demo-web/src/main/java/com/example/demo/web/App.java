package com.example.demo.web;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        init();
        SpringApplication.run(App.class, args);
    }

    private static void init(){
        // 所有限流规则的合集
        List<FlowRule> rules = new ArrayList<>();

        FlowRule rule = new FlowRule();
        // 资源名称
        rule.setResource("sayHello");
        // 限流的类型
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // 2 qps
        rule.setCount(2);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }
}
