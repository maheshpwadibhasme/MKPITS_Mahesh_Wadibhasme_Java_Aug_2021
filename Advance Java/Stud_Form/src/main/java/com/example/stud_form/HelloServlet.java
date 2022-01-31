package com.example.stud_form;

import java.io.*;
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

        String[] course=request.getParameterValues("course");

        PrintWriter out = response.getWriter();

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
        out.println("</table>");

        out.println("<h4> Name:-"+name+"</h4>");
        out.println("<h4> Password:-"+password+"</h4>");
        out.println("<h4> Gender:-"+gender+"</h4>");
        //out.println("<h4> Course:-"+s+"</h4>");

        //out.print("<h4> course:-</h4>");
        out.print("<h4>Course:-</h4>");
        for(String s:course){
            out.print("<h4>"+s+",</h4>");
        }

        out.println("<h4> City:-"+city+"</h4>");
        out.println("<h4> dob:-"+dob+"</h4>");
        out.println("<h4> Description:- "+desc+"</h4>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}