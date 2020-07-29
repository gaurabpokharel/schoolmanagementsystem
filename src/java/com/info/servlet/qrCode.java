package com.info.servlet;

import java.util.*;
import com.info.bean.*;
import com.info.dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gaurab Pokharel
 */
public class qrCode extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String studentname = request.getParameter("studentname");
            String fathername = request.getParameter("fathername");
            String mothername = request.getParameter("mothername");
            String address = request.getParameter("address");
            String grade = request.getParameter("class");//Student Class is written as grade
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String bloodgroup = request.getParameter("bloodgroup");
            String contactnumber = request.getParameter("contactnumber");
            String nationality = request.getParameter("nationality");
            String religion = request.getParameter("religion");
            String email = request.getParameter("email");
            String ethnicity = request.getParameter("ethnicity");

            qrCodeGenerator obj = new qrCodeGenerator(studentname,fathername,mothername,address,grade,dob,gender,bloodgroup,contactnumber,nationality,religion,email,ethnicity);
            
            RequestDispatcher rd = request.getRequestDispatcher("uploadQRCode.jsp");
            rd.forward(request, response);
            
            out.close();

        }
    }

}
