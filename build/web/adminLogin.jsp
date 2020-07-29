<%-- 
    Document   : adminLogin
    Created on : 28-Jul-2020, 18:51:24
    Author     : gaura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
    </head>
    <body>
        <form action="adminLogin" method="post">
            Username:::<input type="text" name="username"><br><br>
            Password:::<input type="password" name="password"><br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
