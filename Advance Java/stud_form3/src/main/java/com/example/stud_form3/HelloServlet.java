package com.example.stud_form3;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Student Details!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");

//            Statement stmt=con.createStatement();
//            String qr=("insert into Stud_login values ('"+name+"','"+pass+"')");
//            stmt.executeUpdate(qr);

            out.println("Database Connected");
        }catch(Exception e){
            out.println(e);
        }

        // action logic to collect data from form
        String name=request.getParameter("name");
        String password=request.getParameter("pass");
        String gender=request.getParameter("gender");
        // String course=request.getParameter("course");
        String city=request.getParameter("city");
        String dob=request.getParameter("dob");
        String desc=request.getParameter("desc");

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        //display in browser
        out.println("<table>");

        out.println("<tr>");
        out.println("<td>Name:-<td>");
        out.println("<td>"+name+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Password:-<td>");
        out.println("<td>"+password+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Gender:-<td>");
        out.println("<td>"+gender+"</td>");
        out.println("</tr>");

        String[] course=request.getParameterValues("course");
        out.println("<tr>");
        out.print("<td>Course:-</td>");
        for(String s:course){
            out.print("<td>"+s+"</td>");
        }
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>City:-<td>");
        out.println("<td>"+city+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Gender:-<td>");
        out.println("<td>"+gender+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>DOB:-<td>");
        out.println("<td>"+dob+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Description:-<td>");
        out.println("<td>"+desc+"</td>");
        out.println("</tr>");

        out.println("</table>");


    }

    public void destroy() {
    }
}