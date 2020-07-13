package com.fengfang.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description 将配置文件中的每一个属性的值映射到这个组件中
 * prefix = "person" 表示在配置文件中那个名称下面的所有属性
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能
 * @ConfigurationProperties 可以批量注入配置文件中的属性，且支持松散绑定
 * @Value    只能一个个属性指定，且不支持松散绑定
 * 获取配置文件值，
 * @Author liuxh
 * @Date 2020/7/8 16:18
 **/
@Component
//@ConfigurationProperties(prefix = "person")
public class Person {

    /*
    * <bean class="Person">
    <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
    </bean>
    * */
    @Value("${person.last-name}")
//    @Value("${person.lastName}")
    private String lastName;
    @Value("#{12*3}")
    private Integer age;
    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    @Value("true")
    private Boolean boss;
    private Date birthday;
    private Map<String,Object> map;

    private List<Object> lists;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
