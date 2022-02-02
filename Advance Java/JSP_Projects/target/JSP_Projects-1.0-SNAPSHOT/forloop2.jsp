<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 01-02-2022
  Time: 03:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String col[]={"red","yellow","green","black","pink","orange","grey","purple","pink","lightgreen"};
    for(int i=0;i<10;i++)
    {
%>
<%--<font color="red" size="10"> Mahesh </font><br>--%>
<%--<font color="green" size="10"> Mahesh </font><br>--%>
<font color="<%= col[i] %>" size="12"> <%= +i %> <br></font>
<%
    }
%>
</body>
</html>
