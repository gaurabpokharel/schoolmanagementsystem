package com.info.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class adminDao {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem?", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static boolean validate(String username, String password) {
        boolean status = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem?", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from admin where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
        
    }
}