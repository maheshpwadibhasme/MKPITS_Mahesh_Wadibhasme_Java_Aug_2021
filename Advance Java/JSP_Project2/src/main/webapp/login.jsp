
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    String  name=request.getParameter("Sname");
    String password=request.getParameter("Spass");

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
    String qr=("insert into stud_login(Sname,Spass) values('"+name+"','"+password+"')");
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