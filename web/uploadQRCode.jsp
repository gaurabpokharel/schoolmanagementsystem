<%-- 
    Document   : uploadQRCode
    Created on : 29-Jul-2020, 19:28:50
    Author     : gaura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload QRCode</title>
    </head>
    <body>
        <h1>Upload QRCode!</h1>
         <form action="qrCodeUpdate" method="post"  enctype = "multipart/form-data"> 
            <table>  
                <tr>
                    <td>
                        <% String id = request.getParameter("id"); %>
                        ID: <input type="text" name="id" value="<%= id %>">
                    </td>
                </tr>
                <tr><td>Insert QRCode:</td><td>  
                        <input type="file" name="qrcode"/></td></tr>

                <tr><td colspan="2"><input type="submit" value="Save"/></td></tr>  
            </table>  
        </form>  
    </body>
</html>
