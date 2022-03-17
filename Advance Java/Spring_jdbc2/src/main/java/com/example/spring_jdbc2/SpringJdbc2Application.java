package com.example.spring_jdbc2;

import com.example.spring_jdbc2.Dao.StudDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class SpringJdbc2Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("Bean.xml");
        StudDaoImpl template = appcont.getBean("studdao", StudDaoImpl.class);

//        Stud ob=new Stud();
//        ob.setId(1);
//        ob.setName("mahesh");
//        ob.setAddr("ramtek");
//
//       template.insert(ob);

//        template.Update(ob);

//        template.delete(ob);

//        template.displaybyid(2);

        template.displayAll();
    }

}
