<%-- 
    Document   : Calculation
    Created on : Feb 20, 2020, 10:16:40 AM
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
        <form action="CalculationProcess.jsp" method="get">
            <label>First number</label>
            <input type="numbers" name="number1"><br/><br/>
            
            <label>Second number</label>
            <input type="number" name="number2"><br/><br/>
            
            <input type="Submit" action="submit" name="submit"><br/>
            <input type="Button" name="cancel">Cancel
        </form>
    </body>
</html>
