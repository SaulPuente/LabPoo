/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saulp
 */
public class DBConexion {
    Connection conectar = null;
    
    String user = "root";//postgres";
    String password = "ForTheWin109";//"ONEpiece109";
    String db = "dbjavamysql";
    String ip = "localhost";
    String puerto = "3306";//5432";
    
    String myurl = "jdbc:mysql://"+ip+":"+puerto+"/"+db; 
    
    public Connection connect(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String myDriver = "com.mysql.jdbc.Driver";
            Class.forName(myDriver);
            conectar = DriverManager.getConnection(myurl,user,password);
      
            Statement stmt = conectar.createStatement();
            String sql; 
            sql = "CREATE TABLE IF NOT EXISTS users (id int unsigned auto_increment not null,  username varchar(32) not null,   pass varchar(32) not null,   is_admin boolean,  primary key (id),   unique(username))";
            
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE IF NOT EXISTS libros (id int unsigned auto_increment not null, isbn varchar(32) not null, titulo varchar(32) not null, precio float, primary key (id) )";

            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE IF NOT EXISTS ventas (id int unsigned auto_increment not null, total float, fecha datetime default now(), primary key (id))";

            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE IF NOT EXISTS ventas_libros (id int unsigned auto_increment not null, venta_id int  NOT NULL, libro_id int  NOT NULL, cantidad int, subtotal float, primary key (id))";

            stmt.executeUpdate(sql);
            stmt.close();
            
            //JOptionPane.showMessageDialog(null,"Se conectó correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se conectó a la base de datos, error: " + e.toString());
        }
        
        return conectar;
    }
    
    /**
     *
     * @param ISBN
     * @param Titulo
     * @param Precio
     * @param query
     */
    public void insert(String ISBN, String Titulo, String Precio){
        Statement st;
        String query = "INSERT INTO libros (isbn, titulo, precio) "+"VALUES ('" + ISBN + "', '" + Titulo + "'," + Precio +")";
        try {
            st = conectar.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        }

      // note that i'm leaving "date_created" out of this insert statement
    }
    
    public void delete(String id) throws SQLException{
        
        //String queryS = "SELECT id FROM libros WHERE (isbn = '" + ISBN + "')";
        try
        {
          
//          PreparedStatement ps = conectar.prepareStatement(queryS);
//          int id = 0;
//
//          ResultSet rs = ps.executeQuery();
//          if ( rs.next() )
//          {
//            id = (rs.getInt("id"));
//          }
//          rs.close();
//          ps.close();
          
          String queryD = "DELETE FROM libros WHERE id = ?";
          PreparedStatement preparedStmt = conectar.prepareStatement(queryD);
          preparedStmt.setString(1, id);

          preparedStmt.execute();

        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
        
    }
    
    public ResultSet findBook(String id) throws SQLException{
        String queryS = "SELECT * FROM libros WHERE (id = '" + id + "')";
        try
        {
            PreparedStatement ps;
            ps = conectar.prepareStatement(queryS);

            ResultSet rs = ps.executeQuery();
            return rs;
        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
    }
    public void edit(String id, String isbn, String titulo, String precio) throws SQLException{
        try
        {
            String queryE = "update libros set isbn = ?, titulo = ?, precio = ? where id = ?";
            PreparedStatement preparedStmt = conectar.prepareStatement(queryE);
            preparedStmt.setString(1, isbn);
            preparedStmt.setString(2, titulo);
            preparedStmt.setString(3, precio);
            preparedStmt.setString(4, id);

            preparedStmt.executeUpdate();

        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
    }
    
    public ResultSet loadBooks(){
         try {
            String query = "SELECT * FROM libros";
            
            Statement st = conectar.createStatement();
      
      // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            return rs;
         }
         catch (SQLException e) {
             System.err.println("Got an exception! ");
             System.err.println(e.getMessage());
         }
        return null;
    }
    public void sell(DefaultTableModel modelo2){
        try {
            double total = 0;
            for(int i=0; i<modelo2.getRowCount(); ++i){
                total += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
            }
            
            String query = "INSERT INTO ventas (total) VALUES(" + total + ")";
            
            try (Statement stmt = conectar.createStatement()) {
                int affectedRows = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                if (affectedRows == 0) {
                    throw new SQLException("No se pudo registrar la venta.");
                }
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int venta_id = generatedKeys.getInt(1);
                        generatedKeys.close();
                        
                        double subtotal;
                        String queryS;
                        String queryI;
                        String ISBN;
                        String Titulo;
                        String Precio;
                        String cantidad;
                        Statement st;
                        
                        for(int i=0; i<modelo2.getRowCount(); ++i){
                            subtotal = Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
                            
                            ISBN = modelo2.getValueAt(i, 0).toString();
                            Titulo = modelo2.getValueAt(i, 1).toString();
                            Precio = modelo2.getValueAt(i, 3).toString();
                            cantidad = modelo2.getValueAt(i, 2).toString();
                            
                            queryS = "SELECT id FROM libros WHERE (isbn = '" + ISBN + "')";
                            int libro_id = 0;
                            try
                            {

                              PreparedStatement ps = conectar.prepareStatement(queryS);

                              ResultSet rs = ps.executeQuery();
                              if ( rs.next() )
                              {
                                libro_id = (rs.getInt("id"));
                              }
                              
                              rs.close();
                              ps.close();

                              queryI = "INSERT INTO ventas_libros (venta_id, libro_id, cantidad, subtotal) VALUES(" + venta_id + ", " + libro_id + ", " + cantidad + ", " + subtotal + ")";
                              
                              try {
                                    st = conectar.createStatement();
                                    st.executeUpdate(queryI);
                                } catch (SQLException ex) {
                                    Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            catch (SQLException se)
                            {
                              // log exception;
                              throw se;
                            }
                        }
                        
                    }
                    else {
                        throw new SQLException("No se pudo obtener el ID de la venta.");
                    }
                }
            }
         }
         catch (SQLException e) {
             System.err.println("Got an exception! ");
             System.err.println(e.getMessage());
         }
    }
    
    public void createUser(String username, String password, boolean isAdmin){
        Statement st;
        String query = "INSERT INTO users (username, pass, is_admin) "+"VALUES ('" + username + "', '" + password + "'," + isAdmin +")";
        try {
            st = conectar.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String searchPassword(String username) throws SQLException{
        String queryS = "SELECT pass FROM users WHERE (username = '" + username + "')";
        try
        {
          
          PreparedStatement ps = conectar.prepareStatement(queryS);
          String pass;

          ResultSet rs = ps.executeQuery();
          if ( rs.next() )
          {
            pass = (rs.getString("pass"));
          } else {
            throw new SQLException("El usuario no existe.");
          }
          rs.close();
          ps.close();
          
          return pass;
        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
    }
    
    public void deleteUser(String username) throws SQLException{
        String queryS = "SELECT id FROM users WHERE (username = '" + username + "')";
        try
        {
          
          PreparedStatement ps = conectar.prepareStatement(queryS);
          int id = 0;

          ResultSet rs = ps.executeQuery();
          if ( rs.next() )
          {
            id = (rs.getInt("id"));
          } else {
            throw new SQLException("El usuario no existe.");
          }
          rs.close();
          ps.close();
          
          String queryD = "DELETE FROM users WHERE id = ?";
          PreparedStatement preparedStmt = conectar.prepareStatement(queryD);
          preparedStmt.setInt(1, id);

          preparedStmt.execute();

        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
    }
    
    public boolean isAdmin(String username) throws SQLException{
        String queryS = "SELECT is_admin FROM users WHERE (username = '" + username + "')";
        try
        {
          
          PreparedStatement ps = conectar.prepareStatement(queryS);
          boolean is_admin;

          ResultSet rs = ps.executeQuery();
          if ( rs.next() )
          {
            is_admin = (rs.getBoolean("is_admin"));
          } else {
            throw new SQLException("El usuario no existe.");
          }
          rs.close();
          ps.close();
          
          
          return is_admin;
        }
        catch (SQLException se)
        {
          // log exception;
          throw se;
        }
    }
    
}
