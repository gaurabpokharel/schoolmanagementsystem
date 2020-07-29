package com.info.servlet;

import java.util.*;
import com.info.dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class adminLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String username = request.getParameter("username");
            String password = request.getParameter("password");
           
                    
            

            if (adminDao.validate(username, password)) {
            
                 RequestDispatcher rd = request.getRequestDispatcher("adminDashboard.jsp");
                rd.forward(request, response);
           
            }
            else {
                out.print("Invalid Login Credentials.");
                RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
                rd.include(request, response);
            }

            out.close();
        }
    }
}