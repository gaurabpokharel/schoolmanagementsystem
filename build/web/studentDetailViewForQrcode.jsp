<%-- 
    Document   : studentDetailViewForQrcode.jsp
    Created on : 29-Jul-2020, 13:34:09
    Author     : gaura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Detail</title>
    </head>
    <body>
       <form action="qrCode" method="post"> 

            <%@page import="com.info.dao.*,com.info.bean.*"%>  

            <%
                String id = request.getParameter("id");
                studentBean u = addStudentDao.getRecordById(Integer.parseInt(id));
            %>
            ID:<input type="text" name="id" value="<%= u.getId() %>"<br><br>
             Student name:<input type="text" name="studentname" value="<%=u.getStudentname()%>"/><br><br>
        Father name:<input type="text" name="fathername" value="<%=u.getFathername()%>"/><br><br>
        Mother name:<input type="text" name="mothername" value="<%=u.getMothername()%>"/><br><br>
        Current Address:<input type="text" name="address" value="<%=u.getAddress()%>"/><br><br>
        Class:<input type="text" name="class" value="<%=u.getGrade()%>"/><br><br>
        DOB:<input type="text" name="dob" value="<%=u.getDob()%>"/><br><br>
        Gender:<input type="text" name="gender" value="<%=u.getGender()%>"/><br><br>
        Blood Group:<input type="text" name="bloodgroup" value="<%=u.getBloodgroup()%>"/><br><br>
        Contact Number:<input type="text" name="contactnumber" value="<%=u.getContactnumber()%>"/><br><br>
        Nationality:<input type="text" name="nationality" value="<%=u.getNationality()%>"/><br><br>
        Religion:<input type="text" name="religion" value="<%=u.getReligion()%>"/><br><br>
        Email:<input type="text" name="email" value="<%=u.getEmail()%>"/><br><br>
        Ethnicity:<input type="text" name="ethnicity" value="<%=u.getEthnicity()%>"/><br><br>
        <input type="submit" value="Generate QR Code">
           
       </form>
    </body>
</html>
