<%-- 
    Document   : JSPDeclarationDemo
    Created on : Apr 1, 2020, 8:33:05 PM
    Author     : Sagun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
   import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String getGreeting(String name){
            Date d=new Date();
            return "Hello "+name+"! It's "+d+" and how are you doing today?";
        }
        %>
        <h3> This is a JSP Declaration demo. The JSP invokes the global method to produce the following  
</h3>  
<hr/>  
<h3> <%= getGreeting("James Bond") %>  
<hr/> 

    </body>
</html>
