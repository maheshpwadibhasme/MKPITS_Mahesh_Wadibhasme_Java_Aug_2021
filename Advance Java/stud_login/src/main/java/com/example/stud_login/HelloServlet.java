package com.example.stud_login;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Student Details !";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name=request.getParameter("name");
        String password=request.getParameter("pass");

        // Hello
        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//
//        out.println("<table>");
//
//        out.println("<tr>");
//        out.println("<td>Name:-<td>");
//        out.println("<td>"+name+"</td>");
//        out.println("</tr>");
//
//        out.println("<tr>");
//        out.println("<td>Password:-<td>");
//        out.println("<td>"+password+"</td>");
//        out.println("</tr>");
//
//        out.println("</table");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");
            //out.println("database connected");

            Statement stmt=con.createStatement();
            String qr=("Select Sname,Spass from Stud_login where Sname='"+name+"'and Spass='"+password+"'");
            ResultSet rs=stmt.executeQuery(qr);
            if(rs.next()){
                out.println("Successfully login ");
            }
            else{
                out.println("Incorrect Credential");
            }

        }catch(Exception e){
            out.println(e);
        }
    }

    public void destroy() {
    }
}