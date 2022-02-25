package com.example.spring_dependencyinjection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDependencyInjection1Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

            Employee emp= (Employee) appcont.getBean("Emp");
            emp.dis();

            Account act = (Account) appcont.getBean("aob");
            act.trans();
    }

}
