<%-- 
    Document   : process
    Created on : Feb 19, 2020, 11:04:47 AM
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
        <jsp:useBean id="teacher" class="DTO.Teacher" scope="session"/>
        <jsp:setProperty name="teacher" property="firstName"
        value='<%= request.getParameter("FirstName")%>'/>
        <jsp:setProperty name="teacher" property="lastName"
        value='<%=request.getParameter("LastName")%>'/>
        <jsp:setProperty name="teacher" property="address"
        value='<%=request.getParameter("Address")%>'/>
        <jsp:setProperty name="teacher" property="phone"
        value='<%=request.getParameter("Phone")%>'/>

        <h3>Finished storing in the session</h3>
        <br/>
        <a href="TeacherServlet">Click Here</a> to invoke the session
    </body>
</html>
