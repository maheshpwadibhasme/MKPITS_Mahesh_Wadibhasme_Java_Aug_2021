package com.example.spring_autowire;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAutowireApplication {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Employee employee= (Employee) appcont.getBean("emp");
        employee.dis();

        Account account= (Account) appcont.getBean("aid");
        account.Trans();
    }
}
