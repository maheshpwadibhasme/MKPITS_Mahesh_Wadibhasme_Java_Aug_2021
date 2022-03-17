package com.example.spring_aop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAop2Application {

    public static void main(String[] args) {

        ApplicationContext appcont =new ClassPathXmlApplicationContext("Bean.xml");

        Employee emp = appcont.getBean("eid", Employee.class);
        System.out.println(emp.getId());
        System.out.println(emp.getName());

        Student stud = appcont.getBean("sid", Student.class);
        System.out.println(stud.getId());
        System.out.println(stud.getName());
    }

}
