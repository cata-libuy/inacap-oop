/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosapp;

/**
 *
 * @author cata.orellana
 */
public class Test {
    boolean results;
    ApiProducto pruebaConexion;
    
    Test()
    {
        results = false;
        pruebaConexion = new ApiProducto();
    }
    
    public boolean readProductos()
    {
        try {
            pruebaConexion.getProductos();
            return true;
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
           return false;
        }      
        
    }
    
}
