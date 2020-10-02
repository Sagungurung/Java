<%-- 
    Document   : CalculationProcess
    Created on : Feb 20, 2020, 10:43:35 AM
    Author     : Sagun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="calculation" class="DTO.GetSetCalculation"
                     scope="session"/>
        <jsp:setProperty name="calculation" property="number1" 
            value='<%= Integer.parseInt(request.getParameter("number1"))%>'/>
        <jsp:setProperty name="calculation" property="number2"
        value='<%= Integer.parseInt(request.getParameter("number2"))%>' />
        <br/>
        
        <a href="CalculationServlet">Click Here</a>to invoke the inserted  data.
    </body>
</html>
