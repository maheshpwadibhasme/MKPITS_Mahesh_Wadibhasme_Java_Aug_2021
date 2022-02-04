<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-02-2022
  Time: 09:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String  name=request.getParameter("Uname");
    String password=request.getParameter("Upass");
    String mobno=request.getParameter("mobno");
    String dob=request.getParameter("dob");
    String gender=request.getParameter("gender");
    String Address=request.getParameter("Address");
    String city=request.getParameter("city");

//    out.println(name);
//    out.println(password);
%>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");
%>
<font color="green" size="5"> database connected </font><br>
<%
    Statement stmt=con.createStatement();
    String qr=("insert into User_login(Uname,Upass,mobno,dob,gender,Address,city) values('"+name+"','"+password+"','"+mobno+"','"+dob+"','"+gender+"','"+Address+"','"+city+"')");
    stmt.executeUpdate(qr);
%>
<font color="red" size="5"> Record insert successfully..</font><br>
<%

    }catch (Exception e){
        out.println(e);
    }
%>

</body>
</html>
