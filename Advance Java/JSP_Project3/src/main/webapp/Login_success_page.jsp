<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07-02-2022
  Time: 08:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <%-- NavBar --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Verticle Menu Bar-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {font-family: "Lato", sans-serif;}

        .sidebar {
            height: 100%;
            width: 250px;
            position: fixed;
            z-index: 1;
            top: 80px;
            left: 0;
            background-color: #111;
            overflow-x: hidden;
            padding-top: 16px;
        }

        .sidebar a {
            padding: 10px 8px 10px 20px;
            text-decoration: none;
            font-size: 25px;
            color: #818181;
            display: block;
        }

        .sidebar a:hover {
            color: #f1f1f1;
        }
    </style>
</head>
<body>
<%
    String wname =(String) (session).getAttribute("name");
%>
<%--&lt;%&ndash;<font size="6">Welcome <%= " "+wname%></font>&ndash;%&gt;--%>
<%--<!-- As a heading -->--%>
<%--&lt;%&ndash;<nav class="navbar navbar-light bg-light">&ndash;%&gt;--%>
<%--&lt;%&ndash;    <div class="container-fluid"  style="text-align: center" >&ndash;%&gt;--%>
<%--&lt;%&ndash;        <span class="navbar-brand mb-0 h1" ><h1>Welcome <%= " "+wname%></h1></span>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;    &ndash;%&gt;--%>
<%--&lt;%&ndash;</nav>&ndash;%&gt;--%>
<%--<div class="p-3 mb-2 bg-dark text-white" style="text-align: center">--%>
<%--    <font size="6">Welcome <%= " "+wname%></font>--%>
<%--    --%>
<%--    --%>
<%--</div>--%>

<div class="p-3 mb-2 bg-dark text-white" style="text-align: center">
    <font size="6"> Welcome <%= " "+wname %> </font>

</div>


<!--Side icon nav bar-->
<div class="sidebar">
    <a href="#home"><i class="fa fa-fw fa-plus-square"></i> Add Record </a>
    <a href="#services"><i class="fa fa-fw fa-trash"></i> Delete Record </a>
    <a href="#clients"><i class="fa fa-fw fa-pencil-square"></i> Update Record </a>
    <a href="#contact"><i class="fa fa-fw fa-eye"></i> View Record </a>
    <a href="#contact"><i class="fa fa-fw fa-search"></i> Search Record </a>
</div>
</body>
</html>
