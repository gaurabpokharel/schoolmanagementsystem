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
public class addStudent extends HttpServlet {

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

            studentBean es = new studentBean();

            es.setStudentname(studentname);
            es.setFathername(fathername);
            es.setMothername(mothername);
            es.setAddress(address);
            es.setGrade(grade);
            es.setDob(dob);
            es.setGender(gender);
            es.setBloodgroup(bloodgroup);
            es.setContactnumber(contactnumber);
            es.setNationality(nationality);
            es.setReligion(religion);
            es.setEmail(email);
            es.setEthnicity(ethnicity);

            int status = addStudentDao.save(es);
            if (status > 0) {
    
                RequestDispatcher rd = request.getRequestDispatcher("adminDashboard.jsp");
                rd.forward(request, response);
            } else {
                out.println("Record cannot be saved!! ");
                RequestDispatcher rd = request.getRequestDispatcher("newStudentForm.jsp");
                rd.include(request, response);

            }

            out.close();

        }
    }

}
