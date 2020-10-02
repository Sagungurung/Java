/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sagun
 */
public class JSPDeclarationDfdemo extends HttpServlet{
    String getGreeting(String name){
        Date d=new Date();
        return "Hello"+name+"!It's"+d+"and how are you doing today?";
    }
    
    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    PrintWriter p= res.getWriter();
    p.println(getGreeting("James Bond"));
    }
}
