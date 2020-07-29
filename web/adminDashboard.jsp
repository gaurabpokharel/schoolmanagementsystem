<%-- 
    Document   : adminDashboard
    Created on : 28-Jul-2020, 19:06:45
    Author     : gaura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
    </head>
    <body>
        <h1>Admin Dashboard</h1>
        <form>
            <button formaction="newStudentForm.jsp"> Add new Students</button>
            <button formaction="viewAllStudents.jsp">View All Students Record</button>
            <button formaction="selectStudentAccordingToClass.jsp">Select Student According To Class</button>
            <button formaction="generateidcard.jsp">Generate id card of all students</button>
        </form>
        
    </body>
</html>
