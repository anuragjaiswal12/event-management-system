package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/navbar.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
        
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<style>\n");
      out.write("    nav{\n");
      out.write("        background-color: rgba(0,0,0,0.4);\n");
      out.write("    }\n");
      out.write("    .nav-item{\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: 'Poppins',sans-serif;\n");
      out.write("        font-weight: 800;\n");
      out.write("        font-size: 0.8rem;\n");
      out.write("        padding: 0 0.5rem;\n");
      out.write("    } \n");
      out.write("    .navbar-brand{\n");
      out.write("        border-radius: 1rem;\n");
      out.write("    }\n");
      out.write("    .nav-link{\n");
      out.write("        margin:0;\n");
      out.write("        border-radius: 1rem;\n");
      out.write("    }\n");
      out.write("    .nav-link i{\n");
      out.write("        padding: 1rem;\n");
      out.write("    }\n");
      out.write("    #navbarSupportedContent{\n");
      out.write("        justify-content: right;\n");
      out.write("    }\n");
      out.write("    .right{\n");
      out.write("        margin-left: auto;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\" style=\"color:white;\">Event Management System</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.jsp\" style=\"color:white;\"><i class=\"fa-solid fa-house-chimney\"></i>Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" style=\"color:white;\" href=\"view_events.jsp\"><i class=\"fa-solid fa-martini-glass-citrus\"></i>View Events</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" style=\"color:white;\" href=\"add_event.jsp\"><i class=\"fa-solid fa-champagne-glasses\"></i>Add Event</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" style=\"color:white;\" href=\"#\"><i class=\"fa-solid fa-address-card\"></i>Update Profile</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" style=\"color:white;\" href=\"change_pwd.jsp\"><i class=\"fa-solid fa-key\"></i>Change Password</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" style=\"color:white;\" href=\"logout.jsp\"><i class=\"fa-solid fa-right-from-bracket\"></i>Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <section id=\"main\">\n");
      out.write("            <div class=\"d-flex justify-content-center align-items-center\" style=\"height: 80vh\">\n");
      out.write("                <form method=\"post\" action=\"Update_password\">\n");
      out.write("                    <div class=\"card\" style=\"width: 40vw;\">\n");
      out.write("                        <div class=\"card-header alert alert-primary\">\n");
      out.write("                            <h2>Update Password</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <label for=\"old_pwd\" class=\"form-label\">Old Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"old_pwd\" required>\n");
      out.write("                            <label for=\"new_pwd\" class=\"form-label\">New Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"new_pwd\" required>\n");
      out.write("                            <label for=\"c_pwd\" class=\"form-label\">Confirm Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"c_pwd\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                                <input type=\"submit\" name=\"update\" value=\"Update Password\" class=\"btn btn-outline-dark\">\n");
      out.write("                        </div>\n");
      out.write("                    </div\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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
