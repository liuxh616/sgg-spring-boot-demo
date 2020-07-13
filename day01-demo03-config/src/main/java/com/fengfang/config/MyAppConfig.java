package com.fengfang.config;

import com.fengfang.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Configuration表明当前类是一个配置类，替代之前的spring的配置文件 ，以前是用bean标签添加组件，在配置类里面也有@Bean注解，标注在方法
 * @Author liuxh
 * @Date 2020/7/13 15:54
 **/
@Configuration
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中，容器中的这个组件的id默认就为方法名
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类中Bean给容器中添加组件");
        return new HelloService();
    }
}
