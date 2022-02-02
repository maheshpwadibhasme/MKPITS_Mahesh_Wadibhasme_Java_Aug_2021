<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- <%
    int a=2,b=3;
    int c=a+b;
    
%>
<%="result ="+c%>
--%>
<%
    int m=12,n=3;
%>
<%
    if(m>n)
    {
%>
<font color="red" size="10"> m is geater</font>
<%
    }
    else{
%>
<font color="red" size="10"> n is geater</font>
<%
    }
%>
</body>
</html>