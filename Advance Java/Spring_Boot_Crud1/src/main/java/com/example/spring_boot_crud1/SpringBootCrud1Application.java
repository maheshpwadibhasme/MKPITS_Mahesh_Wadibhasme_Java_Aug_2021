package com.example.spring_boot_crud1;

import com.example.spring_boot_crud1.model.Login;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrud1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootCrud1Application.class, args);

        Login ob=new Login();

    }

}
