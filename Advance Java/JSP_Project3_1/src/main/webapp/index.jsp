<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="Login_Process.jsp" method="post">
    <h1> Login </h1>
    <table>
        <tr>
            <td>UserName:-</td>
            <td><input type="text" name="Uname"></td>
        </tr>
        <tr>
            <td>Password:-</td>
            <td><input type="password" name="Upass"></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit"></td>
        </tr>
    </table><br>
    <a href="Registration.jsp">Create New Account</a>
</form>
</body>
</html>