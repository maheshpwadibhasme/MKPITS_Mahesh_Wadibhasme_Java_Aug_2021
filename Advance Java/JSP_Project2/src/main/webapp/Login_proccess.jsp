<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-02-2022
  Time: 09:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String  name=request.getParameter("Uname");
    String password=request.getParameter("Upass");

//    out.println(name);
//    out.println(password);
%>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase1","root","root");
%>

<%
    Statement stmt=con.createStatement();
    String qr=("Select Uname,Upass from User_login where Uname='"+name+"'and Upass='"+password+"'");
    ResultSet rs=stmt.executeQuery(qr);
    if(rs.next()){
%>
<font color="red" size="5">Login successfully..</font><br>
<%
        }
        else{
%>
<font color="red" size="5">Login Failed..</font><br>
<%
        }

    }catch (Exception e){
        out.println(e);
    }
%>

</body>
</html>
