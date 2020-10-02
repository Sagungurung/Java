/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;
import DTO.GetSetCalculation;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
/**
 *
 * @author Sagun
 */
public class CalculationServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        HttpSession session=request.getSession(false);
        GetSetCalculation cf=(GetSetCalculation) session.getAttribute("calculation");
        
        int num1=cf.getnumber1();
        int num2=cf.getnumber2();
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        out.println("The multiplication of given numbers is :"+(num1*num2));
        out.println("<br/>The addition of given numbers is :"+ (num1+num2));
        out.println("<br/>The subtraction of given numbers is :" + (num1-num2));
        out.println("<br/>The division of given numbers is :"+ (num1/num2));     
        
        out.println("<br/>The factorial of "+num1+" is : "+fact(num1));
        out.println("<br/>The factorial of "+num2+" is : "+fact(num2));
          
    }
    public int fact(int num){
        if (num==1){
            return 1;
        }else{
            return num*fact(num-1);
        }
    }
    
}
