import java.util.*;
// Oimport museoapp.ObraDeArte;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package museoapp;


/**
 *
 * @author cata.orellana
 */
public class MuseoApp {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    ArrayList<ObraDeArte> listaObras = new ArrayList<ObraDeArte>();    
    boolean continuar = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
            MuseoApp app = new MuseoApp();
            while (app.continuar) {
              app.desplegarMenu();
            }
            System.out.println("Good bye");
    }



  public void desplegarMenu()
  {
    System.out.println("\n ********** MUSEO APP ************ \n Elija una opcion de menu");
    System.out.println("\n MUSEO \n (M1) Ver Todos | (M2) Crear | (M3) Editar | (M4) Eliminar | (M5) Registrar ingreso de persona | (M6) Registrar salida de persona");
    System.out.println( "\n EXPOSICION \n (E1) Ver  Todas| (E2) Crear | (E3) Editar | (E4) Eliminar  ");
    System.out.println( "\n OBRA DE ARTE \n (O1) Ver Todas | (O2) Crear | (O3) Editar | (O4) Eliminar | (O5) Modificar estado");
    System.out.println("\n CARGAR DATOS DE PRUEBA (T)");
    System.out.println("\n Salir (X)");
    String opcion = "";
    try {
      opcion = sc.nextLine().toUpperCase();
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
    case "O1": verObras();
      break;
    case "O2": crearObra();
      break;
    case "O3": System.out.println("Menu no implementado");
      break;
    case "O4": System.out.println("Menu no implementado");
      break;
    case "O5": System.out.println("Menu no implementado");
      break;
    case "O6": System.out.println("Menu no implementado");
      break;
      
    // Utilidades
    case "T": cargarDatosDePrueba();
      break;
    case "X": continuar = false;
        break;
    default:
        System.out.println("Ingrese opcion valida");
        desplegarMenu();
    }

  }
  
  public void crearObra()
  {
      ObraDeArte nuevaObra = new ObraDeArte();
      nuevaObra.leerDatos();
      listaObras.add(nuevaObra);
      System.out.println("obra agregada");
  }
  
  public void verObras()
  {
      System.out.println("Obras:");
      for(ObraDeArte obra : listaObras) {
          obra.desplegarDatos();
          System.out.println(" ");
      }
  }
  
  public void cargarDatosDePrueba()
  {
      ObraDeArte nuevaObra1 = new ObraDeArte(1, 1, 1, "Obra de prueba", "0000-00-00", "0000-00-00", "0000-00-00", true);
      ObraDeArte nuevaObra2 = new ObraDeArte(2, 1, 1, "Obra de prueba2", "0000-00-00", "0000-00-00", "0000-00-00", true);
      listaObras.add(nuevaObra1);
      listaObras.add(nuevaObra2);
      System.out.println("datos de prueba agregados");
  }
}
