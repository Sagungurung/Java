/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sagun
 */
public class EvenOddServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        int sum=0;
        for (int i = 1 ; i <= 100; i++) {
            sum+=i;
        }
        PrintWriter pw=res.getWriter();
        pw.print("<hr/>The sum of first 100 numbers is: "+sum);
        
        pw.print("<br/>Following is generated by the Loop:</br>");
        for (int i = 2; i <=5; i++) {
            if (i%2==0) {
                pw.print(i+" is an Even number</br>");
            }else{
                pw.print(i+" is an Odd number</br>");
            }
        }
    }
    
}
