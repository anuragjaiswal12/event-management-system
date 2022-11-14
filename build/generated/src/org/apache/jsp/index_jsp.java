package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.db_operation;
import java.sql.ResultSet;
import database.db_operation;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.html");
    _jspx_dependants.add("/bootstrap.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Event Management System</title>\n");
      out.write("        <style>\n");
      out.write("            .blur{\n");
      out.write("                background: rgba( 241, 22, 22, 0.1 ) !important;\n");
      out.write("                box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.8 );\n");
      out.write("                backdrop-filter: blur( 1.5px );\n");
      out.write("                -webkit-backdrop-filter: blur( 1.5px );\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 1px solid rgba( 255, 255, 255, 0.18 );\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user="";
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            else
                user=session.getAttribute("user").toString();
            db_operation db=new db_operation();
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            nav{\n");
      out.write("                background-color: rgba(0,0,0,0.4);\n");
      out.write("            }\n");
      out.write("            .nav-item{\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: 'Poppins',sans-serif;\n");
      out.write("                font-weight: 800;\n");
      out.write("                font-size: 0.8rem;\n");
      out.write("                padding: 0 0.3rem;\n");
      out.write("            } \n");
      out.write("            .navbar-brand{\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                font-size: 0.6rem;\n");
      out.write("            }\n");
      out.write("            .nav-link{\n");
      out.write("                margin:0;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("            }\n");
      out.write("            .nav-link i{\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("            #navbarSupportedContent{\n");
      out.write("                justify-content: right;\n");
      out.write("            }\n");
      out.write("            .right{\n");
      out.write("                margin-left: auto;\n");
      out.write("            }\n");
      out.write("            .heading{\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: 'Poppins',sans-serif;\n");
      out.write("                font-weight: 800;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("                color: white;\n");
      out.write("                padding-top: 0.5rem;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                padding:0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                min-width:  60px;\n");
      out.write("                min-height: 60px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(session.getAttribute("user")!=null){
        
      out.write("\n");
      out.write("        <div class=\"bg-danger text-center heading\" style=\"background-color: rgba(0,0,0,0.4) !important;\">Event Management System</div>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"padding: 0\">       \n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"index.jsp\" style=\"color:white;\">\n");
      out.write("                  <img src='images/profile/");
out.print(session.getAttribute("pic"));
      out.write("' class=\"user_pic\" height=\"7rem\" width=\"7rem\" />\n");
      out.write("                  ");
out.print(session.getAttribute("user_name").toString());
      out.write("\n");
      out.write("              </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"index.jsp\" style=\"color:white;\"><i class=\"fa-solid fa-house-chimney\"></i>Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color:white;\" href=\"view_events.jsp\"><i class=\"fa-solid fa-martini-glass-citrus\"></i>View Events</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" style=\"color:white;\" href=\"add_event.jsp\"><i class=\"fa-solid fa-champagne-glasses\"></i>Add Event</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color:white;\" href=\"update_profile.jsp\"><i class=\"fa-solid fa-address-card\"></i>Update Profile</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color:white;\" href=\"change_pwd.jsp\"><i class=\"fa-solid fa-key\"></i>Change Password</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color:white;\" href=\"logout.jsp\"><i class=\"fa-solid fa-right-from-bracket\"></i>Logout</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <section id=\"main\">\n");
      out.write("            ");

                ResultSet cancelled=db.event_det("cancelled",user);
                if(cancelled.isBeforeFirst()){
                    
      out.write("\n");
      out.write("                    <div class=\"d-flex justify-content-center\" style=\"margin-top: 2rem;\">\n");
      out.write("                        <div class=\"alert alert-danger\" style=\"width:50vw\">\n");
      out.write("                            Cancelled Events\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\" style=\"margin: 1rem;\">\n");
      out.write("                    ");

                        while(cancelled.next()){
                    
      out.write("\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                                <div class=\"card blur text-center\">\n");
      out.write("                                    <div class=\"card-header\" style=\"background-color: rgba(255,51,51,0.4);\">\n");
      out.write("                                        <h4 class=\"card-title\">");
 out.print(cancelled.getString(2)); 
      out.write("</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-text\">Event Time:");
 out.print(cancelled.getString(10)+" "+cancelled.getString(11)); 
      out.write("</h6>\n");
      out.write("                                        <h6 class=\"card-text\">Last Date:");
 out.print(cancelled.getString(12)); 
      out.write("</h6    >\n");
      out.write("                                        <h6 class='card-text'>Organized By:");
 out.print(db.get_org_name(cancelled.getString(14))); 
      out.write("</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                    ");
  
                        }
                    
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            ");

                ResultSet updated=db.event_det("updated",user);
                if(updated.isBeforeFirst()){
                    
      out.write("\n");
      out.write("                    <div class=\"d-flex justify-content-center\" style=\"margin-top: 2rem;\">\n");
      out.write("                        <div class=\"alert alert-danger\" style=\"width:50vw\">\n");
      out.write("                            Updated Events\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class='row' style=\"margin:1rem;\">\n");
      out.write("                        ");

                        while(updated.next()){
                        
      out.write("\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                                <div class=\"card blur text-center\">\n");
      out.write("                                    <div class=\"card-header\" style=\"background-color: rgba(255,51,51,0.4);\">\n");
      out.write("                                        <h4 class=\"card-title\">");
 out.print(updated.getString(2)); 
      out.write("</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-text\">Event Time:");
 out.print(updated.getString(10)+" "+updated.getString(11)); 
      out.write("</h6>\n");
      out.write("                                        <h6 class=\"card-text\">Last Date:");
 out.print(updated.getString(12)); 
      out.write("</h6    >\n");
      out.write("                                        <h6 class='card-text'>Organized By:");
 out.print(db.get_org_name(updated.getString(14))); 
      out.write("</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        ");

                        }

                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <div class=\"d-flex justify-content-center\" style=\"margin-top: 2rem;\">\n");
      out.write("                <div class=\"alert alert-primary\" style=\"width:50vw\">\n");
      out.write("                    Upcoming Events\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                ResultSet upcoming=db.event_det("upcoming",user);
                if(!upcoming.isBeforeFirst()){
                    
      out.write("\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\n");
      out.write("                        <div class=\"card\" style=\"border-left:rgb(0,0,255) solid 0.3rem;width: 50vw;\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h2 class=\"card-text\" style=\"color: rgb(0,0,0)\">No Upcoming Events</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");

                }
                else{
                
      out.write("\n");
      out.write("                    <div class=\"row\" style=\"margin: 1rem;\">\n");
      out.write("                    ");

                        while(upcoming.next()){
                    
      out.write("\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                                <div class=\"card blur text-center\" style=\"margin: 1rem;\">\n");
      out.write("                                    <div class=\"card-header\" style=\"background-color: rgba(255,51,51,0.4);\">\n");
      out.write("                                        <h4 class=\"card-title\">");
 out.print(upcoming.getString(2)); 
      out.write("</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-text\">Event Time:");
 out.print(upcoming.getString(10)+" "+upcoming.getString(11)); 
      out.write("</h6>\n");
      out.write("                                        <h6 class=\"card-text\">Last Date:");
 out.print(upcoming.getString(12)); 
      out.write("</h6    >\n");
      out.write("                                        <h6 class='card-text'>Organized By:");
 out.print(db.get_org_name(upcoming.getString(14))); 
      out.write("</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer\">\n");
      out.write("                                        <form  method=\"post\" action='register_event.jsp'>\n");
      out.write("                                            <input type=\"hidden\" name=\"id\" value='");
 out.print(upcoming.getInt(1));
      out.write("'/>\n");
      out.write("                                            <input type=\"submit\" value=\"More Details\" class=\"btn btn-outline-primary\"/>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                    ");
  
                        }
                    
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");

                }
            
      out.write("\n");
      out.write("            <div class=\"d-flex justify-content-center\" style=\"margin-top: 2rem;\">\n");
      out.write("                <div class=\"alert alert-secondary\" style=\"width:50vw\">\n");
      out.write("                    Past Events\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                ResultSet past=db.event_det("past",user);
                if(!past.isBeforeFirst()){
                    
      out.write("\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\n");
      out.write("                        <div class=\"card\" style=\"border-left:rgb(105,105,105) solid 0.3rem;width: 50vw;\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h2 class=\"card-text\" style=\"color: rgb(0,0,0)\">No Past Events</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");

                }
                else{
                
      out.write("\n");
      out.write("                    <div class=\"row\" style=\"margin: 1rem;\">\n");
      out.write("                    ");

                        while(past.next()){
                    
      out.write("\n");
      out.write("                            <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                                <div class=\"card blur text-center\">\n");
      out.write("                                    <div class=\"card-header\" style=\"background-color: rgba(255,51,51,0.4);\">\n");
      out.write("                                        <h4 class=\"card-title\">");
 out.print(past.getString(2)); 
      out.write("</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-text\">Event Time:");
 out.print(past.getString(10)+" "+past.getString(11)); 
      out.write("</h6>\n");
      out.write("                                        <h6 class=\"card-text\">Last Date:");
 out.print(past.getString(12)); 
      out.write("</h6    >\n");
      out.write("                                        <h6 class='card-text'>Organized By:");
 out.print(db.get_org_name(past.getString(14))); 
      out.write("</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                    ");
  
                        }
                    
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");

                }
            
      out.write("`\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<style>\n");
      out.write("    #footer-main{\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: 'Poppins',sans-serif;\n");
      out.write("        font-weight: 800;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    #footer-main{\n");
      out.write("        position: fixed;\n");
      out.write("        bottom: 0;\n");
      out.write("        min-width: 100vw;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        background-color: rgba(0,0,0,0.4);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .row{\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("    .copyright{\n");
      out.write("        padding: 1rem;\n");
      out.write("    }\n");
      out.write("    .social i{\n");
      out.write("        padding: 1rem;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"row\" id=\"footer-main\">\n");
      out.write("        <div class=\"col-md-6 copyright\">\n");
      out.write("            Copyright Â© 2022 Anurag J.\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 social\">\n");
      out.write("            <a href=\"https://github.com/anuragjaiswal12/\"><i class=\"fa-brands fa-github\" style=\"color: white;\"></i></a>\n");
      out.write("            <a href=\"https://www.linkedin.com/in/anuragjaiswal12/\"><i class=\"fa-brands fa-linkedin\" style=\"color: white;\"></i></a>\n");
      out.write("            <a href=\"https://wa.me/919016244131\"><i class=\"fa-brands fa-square-whatsapp\" style=\"color: white;\"></i></a>\n");
      out.write("            <a href=\"mailto:error.kr.404@gmail.com\"><i class=\"fa-solid fa-envelope\" style=\"color: white;\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;700&family=Poppins:wght@300;400;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/12e22e1f30.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
