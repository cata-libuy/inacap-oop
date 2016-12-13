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
public class ApiProducto {
    Connection con;
    Statement s;
    String url;
    ResultSet results;
    
    ApiProducto()
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
    
    public String[][] getProductos()
    {
        con = null;
        results = null;
        String matrizProductos[][];
        try 
        {
            // Conectarse
            con = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");            
            // Leer valores            
            s = con.createStatement();
            results = s.executeQuery("select * from producto");
            int rowCount = 0;
            if (results.last()) {
              rowCount = results.getRow();
              results.beforeFirst(); 
            }
            matrizProductos = new String[rowCount][6];
            int rowIndex = 0;
            while(results.next()) {
                matrizProductos[rowIndex][0] = results.getString("idProducto");
                matrizProductos[rowIndex][1] = results.getString("nombre");
                matrizProductos[rowIndex][2] = results.getString("marca");
                matrizProductos[rowIndex][3] = results.getString("modelo");
                matrizProductos[rowIndex][4] = results.getString("precio");
                matrizProductos[rowIndex][5] = results.getString("fechaVencimiento");
                rowIndex++;
            }
            results.close();
            con.close();
            return matrizProductos;
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
            matrizProductos = new String[6][0];
            return matrizProductos;
        }
    }
    
    public void createProducto(String idProducto, String nombre, String marca, String modelo, String precio, String fechaVencimiento)
    {
        con = null;
        try {
            // Conectarse
            con = DriverManager.getConnection(url);
            Statement s = con.createStatement();
            System.out.println("Creando producto con query"); 
            String querySql="insert into producto values(" 
                    +"'"+idProducto+"',"
                    +"'"+nombre+"',"
                    +"'"+marca+"',"
                    +"'"+modelo+"',"
                    +precio+","
                    +"'"+fechaVencimiento+"');";                    
            // String querySql= String.format(formatoQuery,idProducto, nombre, marca, precio, fechaVencimiento);
            System.out.println(querySql);
            s.executeUpdate(querySql);
            System.out.println("Registro guardado"); 
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
        }
    }
    
    public boolean isIdProductoFree(String idProducto) {
        con = null;
        results = null;
        try {
            // Conectarse
            con = DriverManager.getConnection(url);            
            s = con.createStatement();
            results = s.executeQuery("SELECT * FROM `producto` WHERE idProducto = "+ idProducto);
            int prodCount = 0;
            while(results.next()) {
                prodCount++;
            }
            if (prodCount == 0) {
                return true;
            }            
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
        }
        return false;
    }
    
        public String[] getProductoById(String idProducto) {
        con = null;
        results = null;
        String productData[] = new String[6];
        try {
            // Conectarse
            con = DriverManager.getConnection(url);            
            s = con.createStatement();
            results = s.executeQuery("SELECT * FROM `producto` WHERE idProducto = "+ idProducto);
            while(results.next()) {
                productData[0] = results.getString("idProducto");
                productData[1] = results.getString("nombre");
                productData[2] = results.getString("marca");
                productData[3] = results.getString("modelo");
                productData[4] = results.getString("precio");
                productData[5] = results.getString("fechaVencimiento");
            }            
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
        }
        return productData;
    }
        
    public boolean updateProducto(String idProducto, String nombre, String marca, String modelo, String precio, String fechaVencimiento)
    {
        boolean updated = false;
        try {
            con = DriverManager.getConnection(url);
            String querySql="UPDATE `producto` SET "
                    +"nombre = '"+nombre+"',"
                    +"marca = '"+marca+"',"
                    +"modelo = '"+modelo+"',"
                    +"precio = "+precio+","
                    +"fechaVencimiento = '"+fechaVencimiento+"' "
                    +"where idProducto ='"+idProducto+"'"; 
            PreparedStatement pstm = con.prepareStatement(querySql);
            int rowCount =pstm.executeUpdate();
            if (rowCount>0) {
                System.out.println ("Datos han sido actualizados");
                updated = true;
            } else {
                System.out.println ("Los datos no han sido actualizados");
                updated = false;
            }
                 
            pstm.close(); 
            con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
            updated = false;
        }
        return updated;
    }
    
    
    public boolean deleteProducto(String idProducto)
    {
      boolean updated = false;
        try {
            con = DriverManager.getConnection(url);
            String querySql="DELETE FROM `producto` "
                    +"where idProducto ='"+idProducto+"'"; 
            PreparedStatement pstm = con.prepareStatement(querySql);
            int rowCount =pstm.executeUpdate();
            if (rowCount>0) {
                System.out.println ("Datos han sido actualizados");
                updated = true;
            } else {
                System.out.println ("Los datos no han sido actualizados");
                updated = false;
            }
                 
            pstm.close(); 
            con.close(); 
            
        } catch (SQLException ex) {
            System.out.println("Sql exception: " + ex.getMessage());
            updated = false;
        }
        return updated;  
    }
    
}
