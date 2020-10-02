/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DTO.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sagun
 */
public class TeacherServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        HttpSession session=request.getSession();
        Teacher t=(Teacher) session.getAttribute("teacher");
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        out.println(t.getFirstName());
        out.println(t.getLastName());
        out.println(t.getAddress());
        out.println(t.getPhone());
        
        
    }
}
