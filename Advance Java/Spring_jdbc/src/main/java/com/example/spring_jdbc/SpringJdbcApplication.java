package com.example.spring_jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;


public class SpringJdbcApplication {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver load");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Spring","root","root");
            System.out.println("connection successfully");

            Statement stmt=con.createStatement();
            String qr=("insert into Students(id,name,job)values(2,'dolly','java'),(3,'Ameya','sql'),(4,'chotu','pogo');");
            stmt.executeUpdate(qr);
            System.out.println("Inserted........");
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
