package com.example.requestdispatcher;

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
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        String name=request.getParameter("uname");
        String pass=request.getParameter("upass");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");
            //out.println("database connected");

            Statement stmt=con.createStatement();
            String qr=("Select Sname,Spass from Stud_login where Sname='"+name+"'and Spass='"+pass+"'");
            ResultSet rs=stmt.executeQuery(qr);
            if(rs.next()){
                response.sendRedirect("success.html");
            }
            else{
                response.sendRedirect("error.html");
            }

        }catch(Exception e){
            out.println(e);
        }


//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
    }

    public void destroy() {
    }
}