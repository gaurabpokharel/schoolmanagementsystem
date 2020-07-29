package com.info.dao;

import com.info.bean.*;
import com.info.servlet.*;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class addStudentDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem?", "root", "");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return con;
    }

    public static int save(studentBean l) {
        int status = 0;
        try {
            Connection con = addStudentDao.getConnection();
            PreparedStatement st = con.prepareStatement("insert into student(studentname,fathername,mothername,address,class,dob,gender,bloodgroup,contactnumber,nationality,religion,email,ethnicity) values(?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            st.setString(1, l.getStudentname());
            st.setString(2, l.getFathername());
            st.setString(3, l.getMothername());
            st.setString(4, l.getAddress());
            st.setString(5, l.getGrade());
            st.setString(6, l.getDob());
            st.setString(7, l.getGender());
            st.setString(8, l.getBloodgroup());
            st.setString(9, l.getContactnumber());
            st.setString(10, l.getNationality());
            st.setString(11, l.getReligion());
            st.setString(12, l.getEmail());
            st.setString(13, l.getEthnicity());

            status = st.executeUpdate();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static List<studentBean> getAllStudentRecords() {
        List<studentBean> list = new ArrayList<studentBean>();

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                studentBean u = new studentBean();
                
                u.setId(rs.getInt("id"));
                u.setStudentname(rs.getString("studentname"));
                u.setFathername(rs.getString("fathername"));
                u.setMothername(rs.getString("mothername"));
                u.setAddress(rs.getString("address"));
                u.setGrade(rs.getString("grade"));
                u.setDob(rs.getString("dob"));
                u.setGender(rs.getString("gender"));
                u.setBloodgroup(rs.getString("bloodgroup"));
                u.setContactnumber(rs.getString("contactnumber"));
                u.setNationality(rs.getString("nationality"));
                u.setReligion(rs.getString("religion"));
                u.setEmail(rs.getString("email"));
                u.setEthnicity(rs.getString("ethnicity"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
     public static List<studentBean> getRecordsByGrade(String grade) {
        List<studentBean> list = new ArrayList<studentBean>();

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from student where grade=?");
            ps.setString(1, grade);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                studentBean u = new studentBean();
                
                u.setId(rs.getInt("id"));
                u.setStudentname(rs.getString("studentname"));
                u.setFathername(rs.getString("fathername"));
                u.setMothername(rs.getString("mothername"));
                u.setAddress(rs.getString("address"));
                u.setGrade(rs.getString("grade"));
                u.setDob(rs.getString("dob"));
                u.setGender(rs.getString("gender"));
                u.setBloodgroup(rs.getString("bloodgroup"));
                u.setContactnumber(rs.getString("contactnumber"));
                u.setNationality(rs.getString("nationality"));
                u.setReligion(rs.getString("religion"));
                u.setEmail(rs.getString("email"));
                u.setEthnicity(rs.getString("ethnicity"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static studentBean getRecordById(int id) {
        studentBean u = null;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from student where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                u = new studentBean();
                u.setId(rs.getInt("id"));
                u.setStudentname(rs.getString("studentname"));
                u.setFathername(rs.getString("fathername"));
                u.setMothername(rs.getString("mothername"));
                u.setAddress(rs.getString("address"));
                u.setGrade(rs.getString("grade"));
                u.setDob(rs.getString("dob"));
                u.setGender(rs.getString("gender"));
                u.setBloodgroup(rs.getString("bloodgroup"));
                u.setContactnumber(rs.getString("contactnumber"));
                u.setNationality(rs.getString("nationality"));
                u.setReligion(rs.getString("religion"));
                u.setEmail(rs.getString("email"));
                u.setEthnicity(rs.getString("ethnicity"));
               
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
public static int update(int id , InputStream file1) {
        int status = 0;
        try {
            Connection con = addStudentDao.getConnection();

            PreparedStatement st = con.prepareStatement("UPDATE student set qrcode=? where id=?");
             if (file1 != null) {
                // fetches input stream of the upload file for the blob column
                st.setBlob(1, file1);
            }
            st.setInt(2, id);
            status = st.executeUpdate();

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    
}
