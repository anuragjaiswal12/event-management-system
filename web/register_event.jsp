<%-- 
    Document   : register_event
    Created on : 6 Nov, 2022, 12:14:48 PM
    Author     : Anura
--%>

<%@page import="java.net.URL"%>
<%@page import="database.db_operation"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Event</title>
    </head>
    
        <%
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
        %>
        <%@include file="navbar.jsp" %>
        <%
            int id=Integer.parseInt(request.getParameter("id"));
            db_operation db=new db_operation();
            ResultSet rs=db.par_event_det(id);
            if(rs.next()){
                %>
                <div class='d-flex justify-content-center align-items-center' style="height: 110vh">
                    <div class="card text-center" style="width: 50vw">
                        <div class="card-header bg-opacity-25 bg-danger">
                            <h2><%out.print(rs.getString(2));%></h2>
                        </div>
                        <div class="card-body">
                            <h4 class="card-text">Event Category:<%out.print(rs.getString(4));%></h4>
                            <hr/>
                            <h4 class="card-text">Description:</h4>
                            <p class="card-text"><%out.print(rs.getString(3));%></p>
                            <hr/>
                            <h6 class="card-text">
                                <table class="table table-warning">
                                    <thead>
                                    <tr>
                                        <th scope="col">Food Available</th>
                                        <th scope="col">Event Date & Time</th>
                                        <th scope="col">Event Place</th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <tr>
                                        <td><%out.print(rs.getString(6));%></td>
                                        <td><%out.print(rs.getString(10)+" "+rs.getString(11));%></td>
                                        <td><%out.print(rs.getString(5));%></td>
                                      </tr>
                                    </tbody>
                                  </table>
                            </h6>
                            <h6 class="card-text">
                                <table class="table table-warning">
                                    <thead>
                                    <tr>
                                        <th scope="col">Event Fees</th>
                                        <th scope="col">Total Pass</th>
                                        <th scope="col">Available pass</th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <tr>
                                        <td><%out.print(rs.getString(7));%></td>
                                        <td><%out.print(rs.getString(8));%></td>
                                        <td><%out.print(rs.getString(9));%></td>
                                      </tr>
                                    </tbody>
                                  </table>
                            </h6>
                            <h6 class="card-text">
                                <table class="table table-warning table-center">
                                    <thead>
                                    <tr>
                                        <th scope="col">Last Registration Date</th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <tr>
                                        <td><%out.print(rs.getString(12));%></td>
                                      </tr>
                                    </tbody>
                                  </table>
                            </h6>
                            <h5 class='card-text'>Organized By:<%out.print(db.get_org_name(rs.getString(14)));%></h5>
                        </div>
                        <div class="card-footer">
                            <%
                                if(rs.getString(13).equals("cancelled")){
                            %>
                                <h6 class="card-text">Event has been cancelled.</h6>
                            <%
                                }
                                else if(!db.check_reg_event(id, session.getAttribute("user").toString())){
                            %>
                                    <h6 class="card-text">You already register for event.</h6>
                                <%
                            }
                                else if(rs.getInt(9)>0){
                                %>
                                    <form  method="post" action='Reg_event'>
                                        <input type="hidden" name="id" value='<% out.print(rs.getInt(1));%>'/>
                                        <input type="submit" value="Register Event" class="btn btn-outline-primary"/>
                                    </form>
                            <%
                            }
                            else{
                                %>
                                <h6 class="card-text">Sorry!All passes are sold out.</h6>
                            <%
                            }
                            %>
                        </div>
                    </div>
                </div>
        <%
            }
        %>
        <%@include file="footer.html" %>
        <%@include file="bootstrap.html" %>
    

