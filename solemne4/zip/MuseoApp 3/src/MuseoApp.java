import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    ArrayList<Galeria> listaGalerias = new ArrayList<Galeria>();
    ArrayList<Exposicion> listaExposiciones= new ArrayList<Exposicion>();
    boolean continuar = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
            MuseoApp app = new MuseoApp();
            while (app.continuar) {
                try {
                    app.desplegarMenu();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println("Hasta pronto");
    }



  public void desplegarMenu() throws IOException
  {
    System.out.println("\n ********** MUSEO APP ************ \n Elija una opcion de menu");
    System.out.println("\n PERSONAL \n (P1) Ver Todos | (P2) Crear | (P3) Editar | (P4) Eliminar | (P5) Buscar usuario | (P6) Autenticar usuario");
    // System.out.println("\n MUSEO \n (M1) Ver Todos | (M2) Crear | (M3) Editar | (M4) Eliminar | (M5) Registrar ingreso de persona | (M6) Registrar salida de persona");
    
    System.out.println( "\n GALERÍAS DEL MUSEO \n (G1) Ver Todas | (G2) Crear | (G3) Editar | (G4) Eliminar ");
    System.out.println( "\n EXPOSICION \n (E1) Ver  Todas| (E2) Crear | (E3) Editar | (E4) Eliminar | (E5) Asignar galería  ");
    System.out.println( "\n OBRA DE ARTE \n (O1) Ver Todas | (O2) Crear | (O3) Editar | (O4) Eliminar | (O5) Dar obra de baja");
    System.out.println("\n (T) CARGAR DATOS DE PRUEBA -------> RECOMENDADO!!!");
    System.out.println("\n (X) Salir ");
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
        
    // Galería
    case "G1": verGalerias(); 
        break;
    case "G2": crearGaleria(); 
        break;
    case "G3": editarGaleria(); 
        break;
    case "G4": eliminarGaleria(); 
        break;
    case "G5": System.out.println("Menu no implementado"); 
        break;
        
    // Exposicion
    case "E1": verExposiciones();
        break;
    case "E2": crearExposicion();
        break;
    case "E3": editarExposicion();
        break;
    case "E4": eliminarExposicion();
        break;
    case "E5": agregarExposicionAGaleria();
        break;
    
      
     // Obra de arte
    case "O1": verObras();
      break;
    case "O2": crearObra();
      break;
    case "O3": editarObra();
      break;
    case "O4": eliminarObra();
      break;
    case "O5": darObraDeBaja();
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
          String pausa = sc.nextLine();
      }
      
  }
  
  public void ingresarPersonal() {
      Personal nuevoPersonal = new Personal();
      nuevoPersonal.leerDatos();
      listaPersonal.add(nuevoPersonal);
      System.out.println("personal ingresado");
      String pausa = sc.nextLine();
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
            String pausa = sc.nextLine();
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró personal con ese id");
          String pausa = sc.nextLine();
      }
  }
  
  
  // Administración de Galerías
  public void crearGaleria()
  {
      Galeria nuevaGaleria = new Galeria();
      nuevaGaleria.leerDatos();
      listaGalerias.add(nuevaGaleria);
      System.out.println("Galería agregada");
      String pausa = sc.nextLine();
  }
  
  public void verGalerias()
  {
      System.out.println("Galerías:");
      for(Galeria galeria : listaGalerias) {
          galeria.desplegarDatos();
          System.out.println(" ");
      }
      String pausa = sc.nextLine();
  }
  
  public void editarGaleria() throws IOException {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para editar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Galeria galeria : listaGalerias) {
          if (galeria.getIdentificador() == id) {
            System.out.println("Se encontraron los siguientes datos");
            galeria.desplegarDatos();
            System.out.println("Ingrese nuevos datos");
            galeria.editarDatos();
            System.out.println("Datos modificados");
            encontrado = true;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró obra con ese id");
      }
      String pausa = sc.nextLine();
  }
  
      public void eliminarGaleria()
    {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para eliminar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(int i = 0; i < listaGalerias.size(); i++) {
          Galeria galeria = listaGalerias.get(i);
          if (galeria.getIdentificador() == id) {
              listaGalerias.remove(i);
              encontrado = true;
              System.out.println("Galeria eliminada");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró galería con ese id");
      }
      String pausa = sc.nextLine(); 
    }
      
      
  // Administración de exposiciones
      
    public void verExposiciones()
    {
      System.out.println("Exposiciones:");
      for(Exposicion expo : listaExposiciones) {
          expo.desplegarDatos();
          System.out.println(" ");
      }
      String pausa = sc.nextLine();
    }
      
   public void crearExposicion()
    {
      Exposicion nuevaExposicion = new Exposicion();
      nuevaExposicion.leerDatos();
      listaExposiciones.add(nuevaExposicion);
      System.out.println("Exposicion agregada");
      String pausa = sc.nextLine();
    }
   
    public void editarExposicion() {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para editar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Exposicion expo : listaExposiciones) {
          if (expo.getIdentificador() == id) {
            System.out.println("Se encontraron los siguientes datos");
            expo.desplegarDatos();
            System.out.println("Ingrese nuevos datos");
            expo.editarDatos();
            System.out.println("Datos modificados");
            encontrado = true;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró exposicion con ese id");
      }
      String pausa = sc.nextLine();
    }
    
    
    public void eliminarExposicion()
    {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para eliminar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(int i = 0; i < listaExposiciones.size(); i++) {
          Exposicion expo = listaExposiciones.get(i);
          if (expo.getIdentificador() == id) {
              listaExposiciones.remove(i);
              encontrado = true;
              System.out.println("Exposición eliminada");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró exposición con ese id");
      }
      String pausa = sc.nextLine();
    }
    
    public void agregarExposicionAGaleria()
    {
       int idGaleria = -1;
       int idExposicion = -1;
       boolean galeriaEncontrada = false;
       boolean exposicionEncontrada = false;
       try {
          System.out.println("Ingrese el identificador de la Galeria que quiere usar para la exposición:");
          idGaleria = sc.nextInt();
          System.out.println("Ingrese el identificador de la Exposición que va asignar a la galería:");
          idExposicion = sc.nextInt();         
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      Galeria galeriaAUsar = new Galeria();
      Exposicion exposicionAUsar = new Exposicion();
      for(int i = 0; i < listaGalerias.size(); i++) {
          Galeria galeria = listaGalerias.get(i);
          if (galeria.getIdentificador() == idGaleria) {              
              galeriaEncontrada = true;
              galeriaAUsar = galeria;
              break;
          }
      }
      for(int i = 0; i < listaExposiciones.size(); i++) {
          Exposicion expo = listaExposiciones.get(i);
          if (expo.getIdentificador() == idExposicion) {
              exposicionEncontrada = true;
              exposicionAUsar = expo;
              break;
          }
      }
      if (galeriaEncontrada && exposicionEncontrada) {
          galeriaAUsar.agregarExposicion(exposicionAUsar);
          exposicionAUsar.setGaleria(galeriaAUsar);
          System.out.println("Exposición agregada a galería");
      } else if (!galeriaEncontrada) {
          System.out.println("No se encontró galeria con ese identificador");
      } else if (!exposicionEncontrada) {
          System.out.println("No se encontró exposición con ese identificador");
      }
      String pausa = sc.nextLine();
    }
  
  // Administración de Obras
   
   public void verObras()
  {
      System.out.println("Obras:");
      for(ObraDeArte obra : listaObras) {
          obra.desplegarDatos();
          System.out.println(" ");
      }
      String pausa = sc.nextLine();
  }
  
  public void crearObra()
  {
      ObraDeArte nuevaObra = new ObraDeArte();
      nuevaObra.leerDatos();
      listaObras.add(nuevaObra);
      System.out.println("obra agregada");
      String pausa = sc.nextLine();
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
          System.out.println("No se encontró obra con ese id");
      }
      String pausa = sc.nextLine();
  }
    
    public void eliminarObra()
    {
      int id = -1;
      boolean encontrado = false;
      try {
          System.out.println("Ingrese id para eliminar:");
          id = sc.nextInt();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(int i = 0; i < listaObras.size(); i++) {
          ObraDeArte obra = listaObras.get(i);
          if (obra.getIdObra() == id) {
              listaObras.remove(i);
              encontrado = true;
              System.out.println("Obra eliminada");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró obra con ese id");
      }
      String pausa = sc.nextLine();
    }
    
    public void darObraDeBaja() 
    {
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
            obra.darDeBaja();
            System.out.println("Datos modificados");
            encontrado = true;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró obra con ese id");
      }
      String pausa = sc.nextLine();
    }
    
  
  // Datos de prueba
  
  public void cargarDatosDePrueba()
  {
      ObraDeArte nuevaObra1 = new ObraDeArte(1, 1, 1, "Obra de prueba", "0000-00-00", "0000-00-00", "0000-00-00", true);
      ObraDeArte nuevaObra2 = new ObraDeArte(2, 1, 1, "Obra de prueba2", "0000-00-00", "0000-00-00", "0000-00-00", true);
      Personal pepitoGuardia = new Personal("Pepito", "1-9", "pepitoguardia@gmail.com", "Arbolito verde 123", "123123", "pepito", 123, "1", "Guardia", "2016-10-01", "");
      Galeria galeriaNorte = new Galeria(1, "Galeria Norte", "Ala norte, segundo piso", "" );
      Exposicion nuevaExpo = new Exposicion(1, "Las florecillas de primavera", "2016-10-01", "2016-11-02");
      listaObras.add(nuevaObra1);
      listaObras.add(nuevaObra2);
      listaPersonal.add(pepitoGuardia);
      listaGalerias.add(galeriaNorte);
      listaExposiciones.add(nuevaExpo);
      System.out.println("Datos de prueba agregados");
      String pausa = sc.nextLine();
  }
}
