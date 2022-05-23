/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;
import models.DBConexion;
import models.libro;
/**
 *
 * @author saulp
 */
@WebServlet(name = "inventario", urlPatterns = {"/inventario"})
public class inventario extends HttpServlet {
    Connection conn;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DBConexion conexion = new DBConexion();
            conn = conexion.connect();
            
            ResultSet rs = conexion.loadBooks();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Inventario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Inventario</h1>");
            
            int id;
            String isbn;
            String titulo;
            float precio;
            
            ArrayList<libro> ls = new ArrayList<libro>();
            
            out.println("<form method=\"post\" id=\"my_form\" action=\"inventario\"></form>");
            if (rs.next()) {

                out.println("<table BGCOLOR=\"#FFFFCC\" BORDER=0 CELLSPACING=2 CELLPADDING=6><tr><th>ID</th><th>ISBN</th><th>Título</th><th>Precio</th></tr>");

                do {
                    id = rs.getInt("id");
                    isbn = rs.getString("isbn");
                    titulo = rs.getString("titulo");
                    precio = rs.getFloat("precio");
                    ls.add(new libro(id, isbn, titulo, precio));
                } while (rs.next());
                
                for (libro l: ls){
                    out.println("<tr>");
                    out.println(new StringBuilder("<td>").append(l.getId()).append(" </td>").toString());
                    out.println(new StringBuilder("<td>").append(l.getIsbn()).append(" </td>").toString());
                    out.println(new StringBuilder("<td>").append(l.getTitulo()).append(" </td>").toString());
                    out.println(new StringBuilder("<td>").append(l.getPrecio()).append(" </td>").toString());
                    out.println("<td><button type = \"submit\" formaction = \"editar\" form=\"my_form\" name=\"act\" value=\""+l.getId()+"\">Editar</button></td>");
                    out.println("<td><button type = \"submit\" formaction = \"eliminar\" form=\"my_form\" name=\"act\" value=\""+l.getId()+"\">Eliminar</button></td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            }
            
            out.println("<h2>Registrar nuevo libro</h2>");
            out.println("<form action=\"insertar\" method=\"post\" id=\"insert\" >");
            out.println("<label for=\"isbn\">ISBN: </label><br>");
            out.println("<input type=\"text\" id=\"isbn\" name=\"isbn\" value=\"\"><br>");
            out.println("<label for=\"titulo\">Título: </label><br>");
            out.println("<input type=\"text\" id=\"titulo\" name=\"titulo\" value=\"\"><br>");
            out.println("<label for=\"precio\">Precio: </label><br>");
            out.println("<input type=\"text\" id=\"precio\" name=\"precio\" value=\"\"><br><br>");
            out.println("<button type = \"submit\" formaction = \"insertar\" form=\"insert\" name=\"act\" value=\"\">Enviar</button>");
            out.println("</form>");
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
            Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
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
