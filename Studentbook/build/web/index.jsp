<%-- 
    Document   : newjsp
    Created on : Feb 17, 2020, 11:55:05 AM
    Author     : Sagun
--%>

<%@page import="java.io.*,java.util.* " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
    int i=0;
    
    int getSum(int a,int b){
            return a+b;
        }
    %>
    <% 
    int a=4; int b=5; 
    i=getSum(a,b);
    %>
        <div>Hello from the Customer Servlet</div>
        <div>Sum of <%= a%> and <%= b%> = <%= i%></div>
        <%--<%= a%>--%>
    </body>
</html>