package com.fengfang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring boot 里面没有spring的配置文件，我们自己编写的配置文件，也不能自动识别，想让spring的配置文件生效，
 * 就需要使用@ImportResource注解，标注在一个配置类上，一般会标注到主配置类上
 * 若要加载，需在入口程序中使用@ImportResource注解，加载配置文件
 * 但sprin boot 推荐的给容器中的添加组件的方式，
 *
 * <?xml version="1.0" encoding="UTF-8"?>
 * <beans xmlns="http://www.springframework.org/schema/beans"
 *        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
 *     <bean id="helloService" class="com.fengfang.services.HelloService">
 *
 *     </bean>
 * </beans>
 *
 * 1、写一个配置类，类似于spring的配置文件，即不用写配置文件，推荐使用全注解的方式，如config/MyAppConfig.class
 * 2、这个配置类，用于替代上面的配置文件，通过配置类的方法中，添加@Bean注解，这个方法返回值作为组件加入到容器中，组件ID就是方法名
 */

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication

public class Day01Demo03ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day01Demo03ConfigApplication.class, args);
    }

}
