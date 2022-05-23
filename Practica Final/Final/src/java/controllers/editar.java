/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.DBConexion;

/**
 *
 * @author saulp
 */
@WebServlet(name = "editar", urlPatterns = {"/editar"})
public class editar extends HttpServlet {
    Connection conn;
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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DBConexion conexion = new DBConexion();
            conn = conexion.connect();
            
            ResultSet rs = conexion.findBook(request.getParameter("act"));
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Editar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(rs.next()){
                String isbn = rs.getString("isbn");
                String titulo = rs.getString("titulo");
                String precio = rs.getString("precio");
                out.println("<h1>Editar libro #" + request.getParameter("act") + "</h1>");
                out.println("<form action=\"procesar\" method=\"post\" id=\"my_form\" >");
                out.println("<label for=\"isbn\">ISBN: </label><br>");
                out.println("<input type=\"text\" id=\"isbn\" name=\"isbn\" value=\""+isbn+"\"><br>");
                out.println("<label for=\"titulo\">Título: </label><br>");
                out.println("<input type=\"text\" id=\"titulo\" name=\"titulo\" value=\""+titulo+"\"><br><br>");
                out.println("<label for=\"precio\">Precio: </label><br>");
                out.println("<input type=\"text\" id=\"precio\" name=\"precio\" value=\""+precio+"\"><br><br>");
                out.println("<button type = \"submit\" formaction = \"procesar\" form=\"my_form\" name=\"act\" value=\""+request.getParameter("act")+"\">Enviar</button>");
                out.println("</form>");
            } else{
                out.println("<h1>No se pudo editar el ibro</h1>");
                out.println("<meta http-equiv='refresh' content='3;URL=inventario'>");
            }
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
