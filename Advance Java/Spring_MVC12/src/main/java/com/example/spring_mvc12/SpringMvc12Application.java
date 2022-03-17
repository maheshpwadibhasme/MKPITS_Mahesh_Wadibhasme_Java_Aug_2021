package com.example.spring_mvc12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class SpringMvc12Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvc12Application.class, args);
//        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
//        EntityManager entityManager=entityManagerFactory.createEntityManager();
//        System.out.println("Starting Transaction");
//
//        entityManager.getTransaction().begin();
//        Student12 sob=new Student12();
//        sob.setName("Mahesh");
//        sob.setAddress("Ramtek");
//        sob.setMobile_no("7030486117");
//
//        System.out.println("Saving Student data into database");
//        entityManager.persist(sob);
//        entityManager.getTransaction().commit();
//
//        //close the entity manager
//        entityManager.close();
//        entityManagerFactory.close();
    }

}
