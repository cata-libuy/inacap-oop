/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museoapp;

/**
 *
 * @author cata.orellana
 */
public class MuseoApp {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    boolean continuar = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
            MuseoApp app = new MuseoApp();
            while (app.continuar) {
              app.desplegarMenu();
            }
            System.out.println("Good bye");
    }
    
    public boolean quiereContinuar()
  {
    String respuesta;
    try {
      System.out.println("¿Cerrar la Aplicación? S/N");
      respuesta = sc.readLine().trim().toUpperCase();
      if (respuesta.equals("S"))
        return true;
      return false;
    } catch (Exception ex) {
      System.out.println("error: " + ex.getMessage());
      return false;
    }
  }


  public void desplegarMenu()
  {
    System.out.println("\n ********** MUSEO APP ************ \n Elija una opcion de menu");
    System.out.println("\n MUSEO \n (M1) Ver | (M2) Crear | (M3) Editar | (M4) Eliminar | (M5) Registrar ingreso de persona | (M6) Registrar salida de persona");
    System.out.println( "\n EXPOSICION \n (E1) Ver | (E2) Crear | (E3) Editar | (E4) Eliminar  ");
    System.out.println( "\n OBRA DE ARTE \n (O1) Ver | (O2) Crear | (O3) Editar | (O4) Eliminar | (O5) Modificar estado");
    String opcion = "";
    try {
      opcion = sc.readLine();
    } catch(Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }

    switch (opcion) {
    // Museo
    case "M1": System.out.println("Menu no implementado");
      break;
    case "M2": System.out.println("Menu no implementado");
      break;
    case "M3": System.out.println("Menu no implementado");
      break;
    case "M4": System.out.println("Menu no implementado");
      break;
    case "M5": System.out.println("Menu no implementado");
      break;
    case "M6": System.out.println("Menu no implementado");
      break;
      
     // Obra de arte
    case "O1": System.out.println("Menu no implementado");
      break;
    case "O2": System.out.println("Menu no implementado");
      break;
    case "O3": System.out.println("Menu no implementado");
      break;
    case "O4": System.out.println("Menu no implementado");
      break;
    case "O5": System.out.println("Menu no implementado");
      break;
    case "O6": System.out.println("Menu no implementado");
      break;  
    }
    
    
    System.out.println("Menu no implementado");

    continuar = !quiereContinuar();
  }
    
}
