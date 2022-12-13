<%-- 
    Document   : index
    Created on : 2 Nov, 2022, 11:55:56 AM
    Author     : Anura
--%>

<%@page import="database.db_operation"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event Management System</title>
        <style>
            .blur{
                background: rgba( 241, 22, 22, 0.1 ) !important;
                box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.8 );
                backdrop-filter: blur( 1.5px );
                -webkit-backdrop-filter: blur( 1.5px );
                border-radius: 10px;
                border: 1px solid rgba( 255, 255, 255, 0.18 );
            }
        </style>
    </head>
    <body>
        <%
            String user="";
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            else
                user=session.getAttribute("user").toString();
            db_operation db=new db_operation();
        %>
        
        <%@include file="navbar.jsp" %>
        <section id="main">
            <%
                ResultSet cancelled=db.event_det("cancelled",user);
                if(cancelled.isBeforeFirst()){
                    %>
                    <div class="d-flex justify-content-center" style="margin-top: 2rem;">
                        <div class="alert alert-danger" style="width:50vw">
                            Canceled Events
                        </div>
                    </div>
                    <div class="row" style="margin: 1rem;">
                    <%
                        while(cancelled.next()){
                    %>
                            <div class="col-md-4 col-sm-6">
                                <div class="card blur text-center" style="margin: 1rem;">
                                    <div class="card-header" style="background-color: rgba(255,51,51,0.4);">
                                        <h4 class="card-title"><% out.print(cancelled.getString(2)); %></h4>
                                    </div>
                                    <div class="card-body">
                                        <h6 class="card-text">Event Time:<% out.print(cancelled.getString(10)+" "+cancelled.getString(11)); %></h6>
                                        <h6 class="card-text">Last Date:<% out.print(cancelled.getString(12)); %></h6    >
                                        <h6 class='card-text'>Organized By:<% out.print(db.get_org_name(cancelled.getString(14))); %></h6>
                                    </div>
                                </div>
                            </div>
                    <%  
                        }
                    %>
                    </div>
            <%
                }
            %>
            <%
                ResultSet updated=db.event_det("updated",user);
                if(updated.isBeforeFirst()){
                    %>
                    <div class="d-flex justify-content-center" style="margin-top: 2rem;">
                        <div class="alert alert-danger" style="width:50vw">
                            Updated Events
                        </div>
                    </div>
                    <div class='row' style="margin:1rem;">
                        <%
                        while(updated.next()){
                        %>
                            <div class="col-md-4 col-sm-6">
                                <div class="card blur text-center" style="margin: 1rem;">
                                    <div class="card-header" style="background-color: rgba(255,51,51,0.4);">
                                        <h4 class="card-title"><% out.print(updated.getString(2)); %></h4>
                                    </div>
                                    <div class="card-body">
                                        <h6 class="card-text">Event Time:<% out.print(updated.getString(10)+" "+updated.getString(11)); %></h6>
                                        <h6 class="card-text">Last Date:<% out.print(updated.getString(12)); %></h6    >
                                        <h6 class='card-text'>Organized By:<% out.print(db.get_org_name(updated.getString(14))); %></h6>
                                    </div>
                                </div>
                            </div>
                        <%
                        }

                        %>
                    </div>
            <%
                }
            %>
            <div class="d-flex justify-content-center" style="margin-top: 2rem;">
                <div class="alert alert-primary" style="width:50vw">
                    Upcoming Events
                </div>
            </div>
            <%
                ResultSet upcoming=db.event_det("upcoming",user);
                if(!upcoming.isBeforeFirst()){
                    %>
                    <div class="d-flex justify-content-center">
                        <div class="card" style="border-left:rgb(0,0,255) solid 0.3rem;width: 50vw;">
                            <div class="card-body">
                                <h2 class="card-text" style="color: rgb(0,0,0)">No Upcoming Events</h2>
                            </div>
                        </div>
                    </div>
            <%
                }
                else{
                %>
                    <div class="row" style="margin: 1rem;">
                    <%
                        while(upcoming.next()){
                    %>
                            <div class="col-md-4 col-sm-6">
                                <div class="card blur text-center" style="margin: 1rem;">
                                    <div class="card-header" style="background-color: rgba(255,51,51,0.4);">
                                        <h4 class="card-title"><% out.print(upcoming.getString(2)); %></h4>
                                    </div>
                                    <div class="card-body">
                                        <h6 class="card-text">Event Time:<% out.print(upcoming.getString(10)+" "+upcoming.getString(11)); %></h6>
                                        <h6 class="card-text">Last Date:<% out.print(upcoming.getString(12)); %></h6    >
                                        <h6 class='card-text'>Organized By:<% out.print(db.get_org_name(upcoming.getString(14))); %></h6>
                                    </div>
                                    <div class="card-footer">
                                        <form  method="post" action='register_event.jsp'>
                                            <input type="hidden" name="id" value='<% out.print(upcoming.getInt(1));%>'/>
                                            <input type="submit" value="More Details" class="btn btn-outline-primary"/>
                                        </form>
                                    </div>
                                </div>
                            </div>
                    <%  
                        }
                    %>
                    </div>
                    <%
                }
            %>
            <div class="d-flex justify-content-center" style="margin-top: 2rem;">
                <div class="alert alert-secondary" style="width:50vw">
                    Past Events
                </div>
            </div>
            <%
                ResultSet past=db.event_det("past",user);
                if(!past.isBeforeFirst()){
                    %>
                    <div class="d-flex justify-content-center">
                        <div class="card" style="border-left:rgb(105,105,105) solid 0.3rem;width: 50vw;">
                            <div class="card-body">
                                <h2 class="card-text" style="color: rgb(0,0,0)">No Past Events</h2>
                            </div>
                        </div>
                    </div>
            <%
                }
                else{
                %>
                    <div class="row" style="margin: 1rem;">
                    <%
                        while(past.next()){
                    %>
                            <div class="col-md-4 col-sm-6">
                                <div class="card blur text-center" style="margin: 1rem;">
                                    <div class="card-header" style="background-color: rgba(255,51,51,0.4);">
                                        <h4 class="card-title"><% out.print(past.getString(2)); %></h4>
                                    </div>
                                    <div class="card-body">
                                        <h6 class="card-text">Event Time:<% out.print(past.getString(10)+" "+past.getString(11)); %></h6>
                                        <h6 class="card-text">Last Date:<% out.print(past.getString(12)); %></h6    >
                                        <h6 class='card-text'>Organized By:<% out.print(db.get_org_name(past.getString(14))); %></h6>
                                    </div>
                                </div>
                            </div>
                    <%  
                        }
                    %>
                    </div>
                    <%
                }
            %>`
        </section>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    </body>
</html>
