package com.example.spring_inheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringInheritanceApplication {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Employee bob = (Employee) appcont.getBean("base");
        System.out.println(bob);

        Employee ob2= (Employee) appcont.getBean("ob");
        System.out.println(ob2);
    }

}
