/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import java.sql.*;
import java.util.*;

/**
 *
 * @author cata.orellana
 */
public class Pan {
    int id;
    String nombre;
    int peso;
    String descripcion;
    Connection conn;
    Statement s;
    PreparedStatement pstm;
    ResultSet r;
    String url, protocolo, user, password;
    
    Pan()
    {
        this.id = 0;
        this.nombre = "";
        this.peso = 0;
        this.descripcion = "";
        this.protocolo = "jdbc:oracle:";
        this.url = "thin:@localhost:1521:xe";
        this.user = "dbd37";
        this.password = "123456";
    }
    
    Pan (int id, String nombre, int peso, String descripcion)
    {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
    }
    
    private boolean conectar()
    {
        try {
            conn = DriverManager.getConnection(protocolo+url, user, password);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean guardarPan()
    {
       if(conectar()) {
           try {
               pstm = conn.prepareStatement("insert into pan(id, nombre, peso, descripcion) values (?,?,?,?)");
               pstm.setString(1, String.valueOf(id));
               pstm.setString(2, nombre);
               pstm.setString(3, String.valueOf(peso));
               pstm.setString(4, descripcion);
               int rowCount = pstm.executeUpdate();
               if (rowCount > 0)
                   return true;
           } catch(SQLException ex) {
               System.out.println(ex.getMessage());               
           }
       }
       return false;
    }
    
    public Pan getPanById(String id)
    {
        if (conectar()) {
            try {
                String query = "select * from pan where id ="+String.valueOf(id);
                pstm = conn.prepareStatement(query);
                r = pstm.executeQuery(query);
                while(r.next()) {
                    
                }
                
           } catch(SQLException ex) {
               System.out.println(ex.getMessage());               
           }
        }
    }
    
    public boolean updatePan(int id)
    {
        if (conectar()) {
            try {
                
           } catch(SQLException ex) {
               System.out.println(ex.getMessage());               
           }
        }
    }
    
}
