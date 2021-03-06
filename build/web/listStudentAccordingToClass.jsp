
<%@page import="java.util.List"%>
<%@page import="com.info.bean.*,com.info.dao.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Students</title>
    </head>
    <body>
        <% String grade=request.getParameter("grade"); %>
        <h1 style="text-align: center">Class <%= grade %></h1>
        <form>
            <%@page import="com.info.dao.*,com.info.bean.*,java.util.*"%>  
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
            <hr>
             
          
            <%
                List<studentBean> list = addStudentDao.getRecordsByGrade(grade);
                request.setAttribute("list", list);
            %> 
            
            <table border="1" width="90%" style="text-align: center;margin-left: 30px;font-size:20px">  
                <tr><th>Id</th><th>Student Name</th><th>Father Name</th><th>Mother Name</th>  
                    <th>Address</th><th>Grade</th><th>DOB</th> <th>Gender</th>
                    <th>Blood Group</th><th>Contact Number</th><th>Nationality</th><th>Religion</th>
                    <th>Email</th><th>Ethnicity</th></tr>
                        <c:forEach items="${list}" var="u"> 
                     
                    <tr><td>${u.getId()}</td><td>${u.getStudentname()}</td><td>${u.getFathername()}</td> 
                        <td>${u.getMothername()}</td><td>${u.getAddress()}</td>
                        <td>${u.getGrade()}</td><td>${u.getDob()}</td> 
                        <td>${u.getGender()}</td><td>${u.getBloodgroup()}</td>
                        <td>${u.getContactnumber()}</td><td>${u.getNationality()}</td>
                        <td>${u.getReligion()}</td><td>${u.getEmail()}</td><td>${u.getEthnicity()}</td></tr>
                    </tr>
                    </c:forEach>  
            </table>   

        </form>
       
    </body>
</html>
