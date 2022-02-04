<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>


<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Welcome to login page

<%--taking input values--%>
<m:set var="num1" value="34"></m:set>

<%--print something in output--%>
<m:out value="${num1}"></m:out>

<%--if condition--%>
<m:if test="${num1>30}">
    <h1>number 1 is greater </h1>
</m:if>

<%--for each loop to print name 1 to 5--%>
<m:forEach var="i" begin="1" end="5">
    <h2>mahesh</h2>
</m:forEach>

<%--for each loop to print numbers 1 to 5--%>
<m:forEach var="j"  begin="1" end="5">
    <m:out value="${j}"> </m:out>
</m:forEach>

<h2>Addition of two no:-</h2>
<m:set var="n1" value="2"></m:set>
<m:set var="n2" value="3"></m:set>

<m:out value=" Add values:-${n1+n2}"></m:out>

<h2>Subtraction of two no:-</h2>
<m:set var="n1" value="2"></m:set>
<m:set var="n2" value="3"></m:set>

<m:out value=" sub values:-${n1-n2}"></m:out>

<m:choose>
    <m:when test="${num1>30}">
        <h2> num1 is greater than 30</h2>
    </m:when>
    <m:otherwise>
        <h2> num1 ps not greater than 30</h2>
    </m:otherwise>
</m:choose>
<h1> try catch example are </h1>
<m:catch var="exception">
    <%
        int c=2/0;
    %>
</m:catch>
<m:out value="${exception}"></m:out>
</body>
</html>