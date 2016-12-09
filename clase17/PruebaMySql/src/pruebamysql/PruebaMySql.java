/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamysql;
import java.sql.*;

/**
 *
 * @author cata.orellana
 */
public class PruebaMySql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inicializa Driver (máquina virtual de java busca en tiempo real la clase        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");

        } catch (Exception e) {

            System.out.println(e.toString());
        }
        
        // Abrir conexión
        Connection con = null;
        try 
        {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost/javacon1?"
                + "user=javacon1&password=123123"                   
            );
            System.out.println("Conexion exitosa");
            
            Statement s = con.createStatement();
            // Crear una tabla
           // s.executeUpdate("create table fruta("
           //         + "nombre varchar(100)"                    
           //         + ");");
           // System.out.println("Tabla creada");
            // Insertar valores
           // s.executeUpdate("insert into fruta values('manzana')");
           // s.executeUpdate("insert into fruta values('pera')");
           // System.out.println("valores insertados");
            
            // Leer valores
            ResultSet results = null;
            s = con.createStatement();
            results = s.executeQuery("select * from fruta");
            
            while(results.next()) {
                String nombreFruta = results.getString("nombre");
                System.out.println(nombreFruta);
            }
            
            results.close();
            
            
            con.close();
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
        }
        
    }
    
}
