package com.fengfang;

import com.fengfang.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * 可以在
 */
@SpringBootTest
class Day01Demo03ConfigApplicationTests {

    @Autowired
    Person person ;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean result =ioc.containsBean("helloService");
        System.out.println(result);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }


}
