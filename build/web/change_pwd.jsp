<%-- 
    Document   : change_pwd
    Created on : 8 Nov, 2022, 1:17:20 AM
    Author     : Anura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <%
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
        %>
        <%@include file="navbar.jsp" %>
        <section id="main">
            <div class="d-flex justify-content-center align-items-center" style="height: 72vh">
                <form method="post" action="Update_password">
                    <div class="card" style="width: 40vw;">
                        <div class="card-header alert alert-primary">
                            <h2>Update Password</h2>
                        </div>
                        <div class="card-body">
                            <label for="old_pwd" class="form-label">Old Password</label>
                            <input type="password" class="form-control" name="old_pwd" required>
                            <label for="new_pwd" class="form-label">New Password</label>
                            <input type="password" class="form-control" name="new_pwd" required>
                            <label for="c_pwd" class="form-label">Confirm Password</label>
                            <input type="password" class="form-control" name="c_pwd" required>
                        </div>
                        <div class="card-footer">
                                <input type="submit" name="update" value="Update Password" class="btn btn-outline-dark">
                        </div>
                    </div
                </form>
            </div>
        </section>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    </body>
</html>
