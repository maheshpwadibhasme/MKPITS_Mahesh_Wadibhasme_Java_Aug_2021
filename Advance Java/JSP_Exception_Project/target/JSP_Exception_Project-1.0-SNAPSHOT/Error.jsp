<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 03-02-2022
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Error page</h1>

    <%=exception.getLocalizedMessage()%>
</body>
</html>
