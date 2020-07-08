package com.fengfang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description spring boot 入口程序 ,需使用SpringBootApplication 注解
 *
 * @Author liuxh
 * @Date 2020/7/8 11:39
 **/
@SpringBootApplication
public class DemoMainApplication {
    /**
     * 主程序入口
     * 启动
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoMainApplication.class,args);
    }
}
