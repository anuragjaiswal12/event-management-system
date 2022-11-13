<%-- 
    Document   : logout
    Created on : 2 Nov, 2022, 12:13:25 PM
    Author     : Anura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            session.removeAttribute("user");
            response.sendRedirect("user_login.jsp");
        %>
    </body>
</html>
