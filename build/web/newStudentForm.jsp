<%-- 
    Document   : newStudentForm
    Created on : 28-Jul-2020, 20:15:46
    Author     : gaura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="addStudent" method="post">
        <h1>Add new Student</h1>
        Student name:<input type="text" name="studentname"><br><br>
        Father name:<input type="text" name="fathername"><br><br>
        Mother name:<input type="text" name="mothername"><br><br>
        Current Address:<input type="text" name="address"><br><br>
        Class:<input type="text" name="class"><br><br>
        DOB:<input type="text" name="dob"><br><br>
        Gender:<input type="text" name="gender"><br><br>
        Blood Group:<input type="text" name="bloodgroup"><br><br>
        Contact Number:<input type="text" name="contactnumber"><br><br>
        Nationality:<input type="text" name="nationality"><br><br>
        Religion:<input type="text" name="religion"><br><br>
        Email:<input type="text" name="email"><br><br>
        Ethnicity:<input type="text" name="ethnicity"><br><br>
        <input type="submit" value="Add Student">
        </form>
    </body>
</html>
