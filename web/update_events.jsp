<%-- 
    Document   : update_events
    Created on : 7 Nov, 2022, 3:28:21 PM
    Author     : Anura
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.db_operation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Event</title>
    </head>
    <body>
        <%
            String user="";
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            else
                user=session.getAttribute("user").toString();
            int id=Integer.parseInt(request.getParameter("id"));
            db_operation db=new db_operation();
            ResultSet event=db.par_event_det(id);
            String min_reg_date=LocalDate.now().toString();
            String min_event_date=(LocalDate.now().plusDays(2)).toString();
            event.next();
        %>
        <%@include file="navbar.jsp" %>
        <section id='main'>
            <div class="d-flex justify-content-center align-items-center " style="margin-top: 1rem;">
                <form method="post" action="Update_event_val">
                    <div class="card" style="width: 50vw;">
                        <div class="card-header alert alert-primary" style="padding: 0.7rem !important">
                            <h5>Update Events</h5>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="name" class="form-label">Event Name</label>
                                    <input type="text" class="form-control" name="event_name" value="<%out.print(event.getString(2));%>" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="cate" class="form-label">Category</label>
                                    <select class="form-select" name="event_cate" disabled>
                                        <option value="Ram Navmi" <%if(event.getString(4).equals("Ram Navmi")) out.print("selected");%>>Ram Navmi</option>
                                        <option value="Shiv Ratri"<%if(event.getString(4).equals("Shiv Ratri")) out.print("selected");%>>Shiv Ratri</option>
                                        <option value="Holi" <%if(event.getString(4).equals("Holi")) out.print("selected");%>>Holi</option>
                                        <option value="Janmastmi" <%if(event.getString(4).equals("Janmastmi")) out.print("selected");%>>Janmastmi</option>
                                        <option value="Diwali" <%if(event.getString(4).equals("Diwali")) out.print("selected");%>>Diwali</option>
                                    </select>
                                </div>
                                <div class="col-md-4">
                                    <label for="food_avl" class="form-label">Food Availability</label>
                                    <select class="form-select" name="food_avl">
                                        <option value="Yes" <%if(event.getString(6).equals("Yes")) out.print("selected");%>>Yes</option>
                                        <option value="No" <%if(event.getString(6).equals("No")) out.print("selected");%>>No</option>
                                    </select>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="place" class="form-label">Place</label>
                                    <input type="text" class="form-control" name="event_place"value="<%out.print(event.getString(5));%>" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="ttl_pass" class="form-label">Total Pass</label>
                                    <input type="number" class="form-control" name="ttl_pass" value="<%out.print(event.getString(8));%>" required disabled>
                                </div>
                                <div class="col-md-4">
                                    <label for="fees" class="form-label">Fees</label>
                                    <input type="number" class="form-control" name="event_fees" value="<%out.print(event.getString(7));%>" disabled required>
                                </div>
                            </div>
                            <label for="desc" class="form-label">Description</label>
                            <input type="text" class="form-control" name="event_desc" value="<%out.print(event.getString(3));%>" required>
                            <div class="row">
                                <div class="col-md-4">
                                    <label for="date" class="form-label">Date</label>
                                    <input type="date" class="form-control" min='<% out.print(min_event_date); %>' value="<%out.print(event.getString(10));%>" name="event_date" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="time" class="form-label">Time</label>
                                    <input type="time" class="form-control" name="event_time" value="<%out.print(event.getTime(11));%>" required>
                                </div>
                                <div class="col-md-4">
                                    <label for="last_reg_date" class="form-label">Last Date</label>
                                    <input type="date" class="form-control" min='<% out.print(min_reg_date); %>' name="last_reg_date" value="<%out.print(event.getString(12));%>" disabled required>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer">
                            <input type="hidden" name='id' value="<%out.print(event.getInt(1));%>"/>
                            <input type="submit" name="update" value="Update Event" class="btn btn-outline-dark">
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
