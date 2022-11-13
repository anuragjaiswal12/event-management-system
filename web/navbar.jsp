<%-- 
    Document   : navbar.jsp
    Created on : 10 Nov, 2022, 2:18:40 PM
    Author     : Anura
--%>

<%@page import="database.db_operation"%>
<html>
    <head>
        <style>
            nav{
                background-color: rgba(0,0,0,0.4);
            }
            .nav-item{
                text-align: center;
                font-family: 'Poppins',sans-serif;
                font-weight: 800;
                font-size: 0.8rem;
                padding: 0 0.3rem;
            } 
            .navbar-brand{
                border-radius: 1rem;
                font-size: 0.6rem;
            }
            .nav-link{
                margin:0;
                border-radius: 1rem;
            }
            .nav-link i{
                padding: 1rem;
            }
            #navbarSupportedContent{
                justify-content: right;
            }
            .right{
                margin-left: auto;
            }
            .heading{
                text-align: center;
                font-family: 'Poppins',sans-serif;
                font-weight: 800;
                font-size: 1.5rem;
                color: white;
                padding-top: 0.5rem;
            }
            img {
                padding:0;
                box-sizing: border-box;
                border-radius: 50%;
                min-width:  60px;
                min-height: 60px;
            }
        </style>
    </head>
    <body>
        <%
            if(session.getAttribute("user")!=null){
        %>
        <div class="bg-danger text-center heading" style="background-color: rgba(0,0,0,0.4) !important;">Event Management System</div>
        
        <nav class="navbar navbar-expand-lg navbar-light" style="padding: 0">       
            <div class="container-fluid">
              <a class="navbar-brand" href="index.jsp" style="color:white;">
                  <img src='images/profile/<%out.print(session.getAttribute("pic"));%>' class="user_pic" height="7rem" width="7rem" />
                  <%out.print(session.getAttribute("user_name").toString());%>
              </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link" href="index.jsp" style="color:white;"><i class="fa-solid fa-house-chimney"></i>Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color:white;" href="view_events.jsp"><i class="fa-solid fa-martini-glass-citrus"></i>View Events</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" style="color:white;" href="add_event.jsp"><i class="fa-solid fa-champagne-glasses"></i>Add Event</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color:white;" href="update_profile.jsp"><i class="fa-solid fa-address-card"></i>Update Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color:white;" href="change_pwd.jsp"><i class="fa-solid fa-key"></i>Change Password</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color:white;" href="logout.jsp"><i class="fa-solid fa-right-from-bracket"></i>Logout</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <%}%>
    </body>
</html>
