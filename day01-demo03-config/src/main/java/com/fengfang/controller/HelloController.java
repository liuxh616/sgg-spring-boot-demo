package com.fengfang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/13 15:26
 **/
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello "+name;

    }
}
