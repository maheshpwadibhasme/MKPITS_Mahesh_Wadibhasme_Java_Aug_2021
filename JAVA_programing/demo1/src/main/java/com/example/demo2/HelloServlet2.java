package com.example.demo2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet2 extends HttpServlet {
    private String message;

    public void init() {
        message = "welcome to servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        // action logic to collect data from form
        String name=request.getParameter("name");
        String address=request.getParameter("addr");

        //display to browser
        out.println("Name= :"+name);
        out.println("Address= :"+address);

        out.println("</body></html>");
    }

    public void destroy() {
    }
}