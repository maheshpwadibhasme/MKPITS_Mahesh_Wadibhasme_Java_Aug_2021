package com.example.spring_autowire_byconstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAutowireByConstructorApplication {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

    }

}
