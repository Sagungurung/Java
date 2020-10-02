/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sagun
 */
public class StudentServlet extends HttpServlet {

    //two ways to overrise init:
//    @Override
//    public void init(){
//        
//    }
    Connection con = null;
    PreparedStatement pstmt = null;

    @Override
    public void init(ServletConfig config) {

        String driver = config.getInitParameter("driver");
        String dburl = config.getInitParameter("dburl");
        String dbUser = config.getInitParameter("dbUsername");
        String dbPass = config.getInitParameter("dbPassword");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("exception found" + ex);
        }

        try {
            con = DriverManager.getConnection(dburl, dbUser, dbPass);
            System.out.println("db connected");
        } catch (SQLException ex) {
            System.out.println("couldnt connect to DB");
        }

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("<div>Hello from Student Servlet!!!</div>");
        out.print("</body></html>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        try {
            String name = req.getParameter("name");
            String phone = req.getParameter("phone");
            String pass = req.getParameter("password");
            
            String insertQuery = "INSERT INTO studentrecord(firstName,lastName,address)VALUES"
                    + "(?,?,?)";
            
            pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, pass);
            
            int result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Exception  :"+ex);
        }
    }

    private void insertStudent(String name) {

    }
}
