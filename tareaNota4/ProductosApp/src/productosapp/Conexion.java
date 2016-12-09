/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosapp;
import java.sql.*;

/**
 *
 * @author cata.orellana
 */
public class Conexion {
    Connection con;
    Statement s;
    String url;
    ResultSet results;
    
    Conexion()
    {
        // Inicializa Driver (máquina virtual de java busca en tiempo real la clase        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");
            url = "jdbc:mysql://localhost/javacon1?"
                + "user=javacon1&password=123123";

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
    public ResultSet getProductos()
    {
        con = null;
        results = null;
        try 
        {
            // Conectarse
            con = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");            
            // Leer valores
            
            s = con.createStatement();
            results = s.executeQuery("select * from producto");
            results.close();
            con.close();
            return results;
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
            return results;
        }
    }
    
}
