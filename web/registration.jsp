<%-- 
    Document   : registration
    Created on : 31 Oct, 2022, 3:51:41 PM
    Author     : Anura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body >
        <section id="main">
            <div class="d-flex justify-content-center align-items-center " style="height: 100vh">
                <form method="post" action="Reg_Validation">
                    <div class="card" style="width: 40vw;">
                        <div class="card-header alert alert-primary">
                            <h2>Registration</h2>
                        </div>
                        <div class="card-body">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control" name="name" required>
                            <label for="email" class="form-label">E-Mail</label>
                            <div class="input-group">
                                <input type="email" class="form-control" name="email" required>
                                <span class="input-group-text">@xyz.com</span>    
                            </div>
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" name="pwd" required>
                        </div>
                        <div class="card-footer">
                            <input type="submit" name="reg" value="Registration" class="btn btn-outline-dark">
                            <span class="card-text">Already have an account?<a href="user_login.jsp">Login Now</a></span>
                        </div>
                    </div
                </form>
            </div>
        </section>
        <%@include file="bootstrap.html" %>
    </body>
</html>

