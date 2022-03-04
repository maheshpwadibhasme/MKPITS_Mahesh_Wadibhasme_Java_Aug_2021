package com.example.spring_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopApplication {

    public static void main(String[] args) {
        ApplicationContext appcont =new ClassPathXmlApplicationContext("Bean.xml");
       Employee emp = appcont.getBean("eid",Employee.class);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }

}
