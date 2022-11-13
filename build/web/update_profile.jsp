<%-- 
    Document   : update_profile
    Created on : 8 Nov, 2022, 9:57:10 AM
    Author     : Anura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Profile</title>
        <style>
            body {
                background: #403d58;
                justify-content: center;
                aligin-items: center;
            }
            .container-img {
                width: 38vw;
                height: auto;
                display: flex;
                gap:20px;
                overflow-x: scroll;
                overflow-y: hidden;
            }
            img {
                padding: 10px 0;
                box-sizing: border-box;
                border-radius: 50%;
                min-width:  60px;
                min-height: 60px;
                object-fit: cover;
            }
        </style>
    </head>
    <body>
        <%
            if (session.getAttribute("user") == null) {
                response.sendRedirect("user_login.jsp");
            }
            db_operation db=new db_operation();
            String name=db.get_org_name(session.getAttribute("user").toString());
        %>
        <%@include file="navbar.jsp" %>
        <section id="main">
            <div class="d-flex justify-content-center" style="height: 90vh;margin-top: 1rem;">
                <form method="post" action="Update_pro">
                    <div class="card" style="width: 40vw;">
                        <div class="card-header alert alert-primary">
                            <h2>Update Profile</h2>
                        </div>
                        <div class="card-body">
                            <label for="email" class="form-label">E-Mail</label>
                            <input type="email" class="form-control" name="email" value="<%out.print(session.getAttribute("user"));%>" disabled required>
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control" value="<%out.print(name);%>" name="name" required>
                            <div class="container-img" style="margin-top: 0.5rem">
                                <div class='img-container' id="img1">
                                    <img src="images/profile/img1.png" class="img-fluid">
                                </div>
                                <div class = "img-container" id="img2">
                                    <img class="img-fluid" src="images/profile/img2.png">
                                </div>
                                <div class='img-container' id="img3">
                                    <img src="images/profile/img3.png" class="img-fluid">
                                </div>
                                <div class = "img-container" id="img4">
                                    <img class="img-fluid" src="images/profile/img4.png">
                                </div>
                                <div class='img-container' id="img5">
                                    <img src="images/profile/img5.png" class="img-fluid">
                                </div>
                                <div class = "img-container" id="img6">
                                    <img class="img-fluid" src="images/profile/img6.png">
                                </div>
                                <div class='img-container' id="img7">
                                    <img src="images/profile/img7.png" class="img-fluid">
                                </div>
                                <div class = "img-container" id="img8">
                                    <img class="img-fluid" src="images/profile/img8.png">
                                </div>
                                <div class = "img-container" id="img9">
                                    <img class="img-fluid" src="images/profile/img9.png">
                                </div>
                            </div>
                        </div>
                        <div class="card-footer">
                            <input type="hidden" id="image" name="pic" value=""/>
                            <input type="submit" name="update" value="Update Profile" class="btn btn-outline-dark">
                        </div>
                    </div
                </form>
            </div>
        </section>
        <script>
            document.querySelector("#img1").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img1.png")  
            })
            document.querySelector("#img2").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img2.png")  
            })
            document.querySelector("#img3").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img3.png")  
            })
            document.querySelector("#img4").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img4.png")  
            })
            document.querySelector("#img5").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img5.png")  
            })
            document.querySelector("#img6").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img6.png")  
            })
            document.querySelector("#img7").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img7.png")  
            })
            document.querySelector("#img8").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img8.png")  
            })
            document.querySelector("#img9").addEventListener("click",function(){
                document.getElementById("image").setAttribute("value","img9.png")  
            })
        </script>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    </body>
</html>

