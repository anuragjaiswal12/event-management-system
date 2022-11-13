<%-- 
    Document   : view_events
    Created on : 7 Nov, 2022, 12:42:45 AM
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
        <title>View Event</title>
    </head>
    <body>
        <%
            String user="";
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            else
                user=session.getAttribute("user").toString();
        %>
        <%@include file="navbar.jsp" %>
        <% 
            
            db_operation db=new db_operation();
            ResultSet events=db.view_user_event(user);
            if(events.isBeforeFirst()){
                %>
                <div  style="margin: 1rem;">
                    <table class="table table-hover">
                        <thead>
                        <tr class="table-dark">
                            <th scope="col">Event Name</th>
                            <th scope="col">Category</th>
                            <th scope="col">Place</th>
                            <th scope="col">Date</th>
                            <th scope="col">Time</th>
                            <th scope="col">Update</th>
                            <th scope="col">Delete</th>
                        </tr>
                        </thead>
                        <tbody>
                            <%
                            while(events.next()){
                            %>

                                <tr class='table-dark opacity-75'>
                                    <td><% out.print(events.getString(2)); %></td>
                                    <td><% out.print(events.getString(4)); %></td>
                                    <td><% out.print(events.getString(5)); %></td>
                                    <td><% out.print(events.getString(10)); %></td>
                                    <td><% out.print(events.getString(11)); %></td>
                                    <td>
                                        <form action="update_events.jsp" method="post">
                                            <input type="hidden" name='id' value='<% out.print(events.getInt(1)); %>'/>
                                            <input type="submit" name='update' value="Update" class='btn btn-outline-primary'/>
                                        </form>
                                    </td>
                                    <td>
                                        <form action="Delete_events" method="post">
                                            <input type="hidden" name='id' value='<% out.print(events.getInt(1)); %>'/>
                                            <input type="submit" name='delete' value="Cancel" class='btn btn-outline-primary'/>
                                        </form>
                                    </td>
                                </tr>
                          <% } %>
                        </tbody>
                    </table>
                </div>
          <% } %>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    </body>
</html>
