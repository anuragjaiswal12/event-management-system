/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import database.db_operation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anura
 */
public class Update_password extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session=request.getSession();
            if(session.getAttribute("user")==null)
                response.sendRedirect("user_login.jsp");
            String user=session.getAttribute("user").toString();
            String old_pwd=request.getParameter("old_pwd");
            String new_pwd=request.getParameter("new_pwd");
            String c_pwd=request.getParameter("c_pwd");
            db_operation db=new db_operation();
            if(c_pwd.equals(new_pwd)){
                if(db.check_old_pwd(user, old_pwd)){
                    if(db.update_pwd(user, new_pwd)){
                        out.print("<script>alert('Password updated successfully!');window.location='index.jsp';</script>");
                    }
                    else{
                        out.print("<script>alert('Unknown error occured!');window.location='index.jsp';</script>");
                    }
                }
                else{
                    out.print("<script>alert('Incorrect old Password!');window.location='change_pwd.jsp';</script>");
                }
            }
            else{
                out.print("<script>alert('New password and confirm password should be same!');window.location='change_pwd.jsp';</script>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
