/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sagun
 */
public class SetCookieDemo extends HttpServlet{
    
    //Create cookie
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response){
       Cookie cookie=new Cookie("user","Sag");
        response.addCookie(cookie);
    }
    
    //Delete cookie
//    @Override
//    public void doPost(HttpServletRequest request,HttpServletResponse response){
//        
//    }
   
}
