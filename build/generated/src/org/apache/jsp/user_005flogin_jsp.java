package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"d-flex justify-content-center align-items-center \" style=\"height: 100vh\">\n");
      out.write("            <form method=\"post\" onsubmit=\"return validation()\" action=\"Login_Validation\">\n");
      out.write("                <div class=\"card\" style=\"width: 40vw;\">\n");
      out.write("                    <div class=\"card-header bg-info\">\n");
      out.write("                        <h2>Login</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <label for=\"email\" class=\"form-label\">E-Mail</label>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" required>\n");
      out.write("                            <span class=\"input-group-text\">@xyz.com</span>    \n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"empty_email\" style=\"display:none;\">Please Fill E-Mail!</span>\n");
      out.write("                        <span class=\"error_email\" style=\"display:none;\">Please Fill Valid E-Mail!</span>\n");
      out.write("                        <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"pwd\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <input type=\"submit\" name=\"login\" value=\"Login\" class=\"btn btn-outline-dark\">\n");
      out.write("                    </div>\n");
      out.write("                </div\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\" />\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function validation(){\n");
      out.write("                var email=document.querySelector(\"#email\");\n");
      out.write("                flag=true;\n");
      out.write("                if(email==null){\n");
      out.write("                    flag=false;\n");
      out.write("                    documnent.getElementByClassName(\"empty_email\").style.display=\"block\";\n");
      out.write("                }\n");
      out.write("                return flag;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
