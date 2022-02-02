<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 01-02-2022
  Time: 01:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>odd numbers</title>
</head>
<body>
    <%
        int num=100;
        %>
    <font color="red" size="5">list of odd numbers from 1 to<%= +num%> is:-</font>
    <%
        for(int i=1;i<num;i++){
            if(i%2!=0){
    %>
    <font color="black" size="5"> <%= +i %></font>
    <%

        }
        else{
    %>
        <font color="red" size="5"> <%= ":"%></font>
    <%
        }
        }
    %>
</body>
</html>
