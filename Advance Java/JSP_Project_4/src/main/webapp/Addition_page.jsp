<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-02-2022
  Time: 02:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<html>
<head>
    <title>Result page</title>
</head>
<body>
<%
    String Number1=request.getParameter("num1");
    String Number2=request.getParameter("num2");
%>
<m:set var="Number1" value="${param.num1}"></m:set>
<m:set var="Number2" value="${param.num2}"></m:set>

<m:out value=" Add values:-${Number1+Number2}"></m:out>
</body>
</html>
