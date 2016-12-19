/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viveroapp;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cata.orellana
 */
public class Conexion {
    Connection conn;
    PreparedStatement pstm;
    ResultSet r;
    String url, user, password;
    Statement s;
    
    Conexion()
    {
        url = "jdbc:oracle:thin:@localhost:1521:xe";
        user = "user";
        password = "password";
    }
    
    public boolean conectar()
    {        
        try {
            conn = DriverManager.getConnection(url, user, password);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void desconectar()
    {
       try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void ejecutarQuery(String query)
    {
       try {
            if (conectar()) {
                s = conn.createStatement();
                int rowCount = s.
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
