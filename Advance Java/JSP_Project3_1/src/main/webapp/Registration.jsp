<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-02-2022
  Time: 09:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration form</title>
</head>
<body>
<form action="Registration_proccess.jsp" method="post">
    <h1>Registration Form </h1>
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
            <td>Mobile No:-</td>
            <td><input type="number" name="mobno"></td>
        </tr>
        <tr>
            <td> DOB </td>
            <td><input type="date" name="dob"/></td>
        </tr>
        <tr>
            <td> Gender </td>
            <td> <input type="radio" name="gender" value="Male"/> Male </td>
            <td> <input type="radio" name="gender" value="Female"/> Female </td>
        </tr>

        <tr>
            <td>Address:-</td>
            <td><input type="text" name="Address"></td>
        </tr>
        <tr>
            <td> City </td>
            <td> <select name="city">
                <option> Select </option>
                <option> Nagpur </option>
                <option> Pune </option>
                <option> Nashik</option>
            </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" ></td>
        </tr>
    </table>
</form>
</body>
</html>
