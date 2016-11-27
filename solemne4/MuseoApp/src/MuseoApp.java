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
    ArrayList<Personal> listaPersonal = new ArrayList<Personal>();
    boolean continuar = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
            MuseoApp app = new MuseoApp();
            while (app.continuar) {
              app.desplegarMenu();
            }
            System.out.println("Hasta pronto");
    }



  public void desplegarMenu()
  {
    System.out.println("\n ********** MUSEO APP ************ \n Elija una opcion de menu");
    System.out.println("\n PERSONAL \n (P1) Ver Todos | (P2) Crear | (P3) Editar | (P4) Eliminar | (P5) Buscar usuario | (P6) Autenticar usuario");
    // System.out.println("\n MUSEO \n (M1) Ver Todos | (M2) Crear | (M3) Editar | (M4) Eliminar | (M5) Registrar ingreso de persona | (M6) Registrar salida de persona");
    // System.out.println( "\n EXPOSICION \n (E1) Ver  Todas| (E2) Crear | (E3) Editar | (E4) Eliminar  ");
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
      
    // Personal
    case "P1": verPersonal();
      break;
    case "P2": ingresarPersonal();
        break;
    case "P3": editarPersonal();
        break;
      
     // Obra de arte
    case "O1": verObras();
      break;
    case "O2": crearObra();
      break;
    case "O3": editarObra();
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
  
  // Administración de Personal
  public void verPersonal() {
      System.out.println("Personal:");
      for(Personal personal : listaPersonal) {
          personal.desplegarDatos();
          System.out.println(" ");
      }
  }
  
  public void ingresarPersonal() {
      Personal nuevoPersonal = new Personal();
      nuevoPersonal.leerDatos();
      listaPersonal.add(nuevoPersonal);
      System.out.println("personal ingresado");
  }
  
  public void editarPersonal() {
      String idPersonal = "";
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id del trabajador para editar:");
          idPersonal = sc.nextLine();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Personal personal : listaPersonal) {
          if (personal.getIdTrabajador().equals(idPersonal)) {
            System.out.println("Se encontraron los siguientes datos");
            personal.desplegarDatos();
            System.out.println("Ingrese nuevos datos");
            personal.editarDatos();
            System.out.println("Datos modificados");
            encontrado = true;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró personal con ese id");
      }
  }
  
  // Administración de Obras
  
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
  
    public void editarObra() {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para editar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(ObraDeArte obra : listaObras) {
          if (obra.getIdObra() == id) {
            System.out.println("Se encontraron los siguientes datos");
            obra.desplegarDatos();
            System.out.println("Ingrese nuevos datos");
            obra.editarDatos();
            System.out.println("Datos modificados");
            encontrado = true;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró personal con ese id");
      }
  }
    
  
  // Datos de prueba
  
  public void cargarDatosDePrueba()
  {
      ObraDeArte nuevaObra1 = new ObraDeArte(1, 1, 1, "Obra de prueba", "0000-00-00", "0000-00-00", "0000-00-00", true);
      ObraDeArte nuevaObra2 = new ObraDeArte(2, 1, 1, "Obra de prueba2", "0000-00-00", "0000-00-00", "0000-00-00", true);
      Personal pepitoGuardia = new Personal("Pepito", "1-9", "pepitoguardia@gmail.com", "Arbolito verde 123", "123123", "pepito", 123, "1", "Guardia", "2016-10-01", "");
      listaObras.add(nuevaObra1);
      listaObras.add(nuevaObra2);
      listaPersonal.add(pepitoGuardia);
      System.out.println("datos de prueba agregados");
  }
}
