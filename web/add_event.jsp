<%-- 
    Document   : add_event
    Created on : 5 Nov, 2022, 11:12:10 PM
    Author     : Anura
--%>

<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Event</title>
    </head>
    <body>
        <%
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            String min_reg_date=LocalDate.now().toString();
            String min_event_date=(LocalDate.now().plusDays(2)).toString();
        %>
        <%@include file="navbar.jsp" %>
        <section id="main">
            <div class="d-flex justify-content-center align-items-center " style="margin-top: 1rem;">
                <form method="post" action="Add_event_val">
                    <div class="card" style="width: 50vw;">
                        <div class="card-header alert alert-primary" style="padding: 0.7rem !important">
                            <h5>Add Events</h5>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="name" class="form-label">Event Name</label>
                                    <input type="text" class="form-control" name="event_name" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="cate" class="form-label">Category</label>
                                    <select class="form-select" name="event_cate">
                                        <option value="Ram Navmi" selected>Ram Navmi</option>
                                        <option value="Shiv Ratri">Shiv Ratri</option>
                                        <option value="Holi">Holi</option>
                                        <option value="Janmastmi">Janmastmi</option>
                                        <option value="Diwali">Diwali</option>
                                    </select>
                                </div>
                                <div class="col-md-4">
                                    <label for="food_avl" class="form-label">Food Availability</label>
                                    <select class="form-select" name="food_avl">
                                        <option selected value="Yes">Yes</option>
                                        <option value="No">No</option>
                                    </select>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="place" class="form-label">Place</label>
                                    <input type="text" class="form-control" name="event_place" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="ttl_pass" class="form-label">Total Pass</label>
                                    <input type="number" class="form-control" name="ttl_pass" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="fees" class="form-label">Fees</label>
                                    <input type="number" class="form-control" name="event_fees" required>
                                </div>
                            </div>
                            <label for="desc" class="form-label">Description</label>
                            <input type="text" class="form-control" name="event_desc" required>
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="date" class="form-label">Date</label>
                                    <input type="date" class="form-control" min='<% out.print(min_event_date); %>' name="event_date" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="time" class="form-label">Time</label>
                                    <input type="time" class="form-control" name="event_time" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="last_reg_date" class="form-label">Last Date</label>
                                    <input type="date" class="form-control" min='<% out.print(min_reg_date); %>' name="last_reg_date" required>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer">
                            <input type="submit" name="add" value="Add Event" class="btn btn-outline-dark">
                            <span class="card-text">
                        </div>
                    </div
                </form>
            </div>
        </section>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    </body>
</html>
