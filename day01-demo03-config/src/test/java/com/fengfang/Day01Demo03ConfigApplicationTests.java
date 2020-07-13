package com.fengfang;

import com.fengfang.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 可以在
 */
@SpringBootTest
class Day01Demo03ConfigApplicationTests {

    @Autowired
    Person person ;
    @Test
    void contextLoads() {
        System.out.println(person);
    }


}
