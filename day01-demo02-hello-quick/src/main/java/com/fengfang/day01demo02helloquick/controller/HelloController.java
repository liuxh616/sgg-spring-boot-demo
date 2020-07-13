package com.fengfang.day01demo02helloquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/8 15:36
 **/
//这个类的所有方法返回的数据直接写给浏览器(如果是对象，还能转成json对象)
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
