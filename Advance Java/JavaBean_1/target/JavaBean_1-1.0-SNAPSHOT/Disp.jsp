<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-02-2022
  Time: 04:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="user" class="com.example.javabean_1.UserBean"></jsp:useBean>
    <jsp:setProperty name="user" property="*"></jsp:setProperty>

    <h1> Welcome user <jsp:getProperty name="user" property="uname"/> </h1>
</body>
</html>
