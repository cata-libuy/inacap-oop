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
    ArrayList<Visita> listaVisitas= new ArrayList<Visita>();
    ArrayList<Autor> listaAutores= new ArrayList<Autor>();
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
    System.out.println("\n PERSONAL \n (P1) Ver Todos | (P2) Crear | (P3) Editar | (P4) Eliminar | (P5) Buscar usuario | (P6) Autenticar usuario | (P7) Cerrar sesión usuario");
    // System.out.println("\n MUSEO \n (M1) Ver Todos | (M2) Crear | (M3) Editar | (M4) Eliminar | (M5) Registrar ingreso de persona | (M6) Registrar salida de persona");
    
    System.out.println( "\n GALERÍAS DEL MUSEO \n (G1) Ver Todas | (G2) Crear | (G3) Editar | (G4) Eliminar ");
    System.out.println( "\n EXPOSICION \n (E1) Ver  Todas| (E2) Crear | (E3) Editar | (E4) Eliminar | (E5) Asignar galería a exposición | (E6) Desvincular de galería ");
    System.out.println( "\n OBRA DE ARTE \n (O1) Ver Todas | (O2) Crear | (O3) Editar | (O4) Eliminar | (O5) Dar obra de baja | (O6) Asignar obra a exposicion | (O7) Sacar obra de expoiscion");
    System.out.println("\n VISITAS \n (V1) Ver Registro de visitas | (V2) Registrar ingreso | (V3) Registrar salida | (V4) Eliminar registro");
    System.out.println("\n AUTORES \n (A1) Ver Todos | (A2) Registrar autor | (A3) Eliminar autor | (A4) Asignar autor a obra");
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
    case "P6": loginPersonal();
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
    case "E6": quitarExposicionDeGaleria();
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
    case "O6": agregarObraAExposicion();
      break;
    case "O7": quitarObraDeExposicion();
      break;
      
      
    // Visitas    
    case "V1": verVisitas();
        break;
    case "V2": registrarIngreso();
        break;
    case "V3": registrarSalida();
        break;
    case "V4": eliminarRegistro();
        break;
      
    // Autores
    case "A1": verAutores();
        break;
    case "A2": crearAutor();
        break;
    case "A3": eliminarAutor();
        break;
    case "A4": asignarAutorAObra();
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
  
    public void loginPersonal()
  {
      String nombreUsuario="";
      boolean encontrado = false;
      try {
          System.out.println("Ingrese nombre de usuario:");
          nombreUsuario = sc.nextLine();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Personal personal : listaPersonal) {
          if (personal.getUser().equals(nombreUsuario)) {
              int password = 0;
              boolean success = false;
              System.out.println("Ingrese password");
              password = sc.nextInt();
              success = personal.logIn(password);
              if (success) {
                  System.out.println("Sesión iniciada");
              } else {
                  System.out.println("Password y usuario no corresponden");
              };
              encontrado = true;
              break;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró Personal solicitado");
      }
      String pausa = sc.nextLine();
  }
    
    public void logoutPersonal()
    {
        String nombreUsuario="";
      boolean encontrado = false;
      try {
          System.out.println("Ingrese nombre de usuario:");
          nombreUsuario = sc.nextLine();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Personal personal : listaPersonal) {
          if (personal.getUser().equals(nombreUsuario)) {
              personal.logOut();
              System.out.println("Sesión terminada");
              encontrado = true;
              break;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró Personal solicitado");
      }
      String pausa = sc.nextLine();
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
    
    public void quitarExposicionDeGaleria()
    {
       int idGaleria = -1;
       int idExposicion = -1;
       boolean galeriaEncontrada = false;
       boolean exposicionEncontrada = false;
       try {
          System.out.println("Ingrese el identificador de la Galeria:");
          idGaleria = sc.nextInt();
          System.out.println("Ingrese el identificador de la Exposición que va sacar de la galería:");
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

      if (galeriaEncontrada) {
            for(int i = 0; i < galeriaAUsar.listaExposiciones.size(); i++) {
                Exposicion expo = galeriaAUsar.listaExposiciones.get(i);
                if (expo.getIdentificador() == idExposicion) {
                    exposicionEncontrada = true;
                    galeriaAUsar.listaExposiciones.remove(i);
                    System.out.println("Exposición desvinculada de galería");
                    break;
                }
            }
            for (int i = 0; i < listaExposiciones.size(); i++) {
                Exposicion expo = listaExposiciones.get(i);
                if (expo.getIdentificador() == idExposicion) {
                    exposicionEncontrada = true;
                    Galeria nuevaGal = new Galeria();
                    expo.setGaleria(nuevaGal);
                    break;
                }
            }
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
    
    public void agregarObraAExposicion()
    {
       int idExposicion = -1;
       int idObra = -1;
       boolean obraEncontrada = false;
       boolean exposicionEncontrada = false;
       try {
          System.out.println("Ingrese el identificador de la Exposición que quiere usar para la obra:");
          idExposicion = sc.nextInt();
          System.out.println("Ingrese el identificador de la Obra que va asignar a la exposición:");
          idObra = sc.nextInt();         
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      ObraDeArte obraAUsar = new ObraDeArte();
      Exposicion exposicionAUsar = new Exposicion();
      for(int i = 0; i < listaObras.size(); i++) {
          ObraDeArte obra = listaObras.get(i);
          if (obra.getIdObra() == idObra) {              
              obraEncontrada = true;
              obraAUsar = obra;
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
      if (obraEncontrada && exposicionEncontrada) {
          exposicionAUsar.agregarObraDeArte(obraAUsar);
          obraAUsar.setExposicion(exposicionAUsar);
          System.out.println("Obra agregada a exposición");
      } else if (!obraEncontrada) {
          System.out.println("No se encontró obra con ese identificador");
      } else if (!exposicionEncontrada) {
          System.out.println("No se encontró exposición con ese identificador");
      }
      String pausa = sc.nextLine();
    }
    
       public void quitarObraDeExposicion()
    {
       int idExposicion = -1;
       int idObra = -1;
       boolean obraEncontrada = false;
       boolean exposicionEncontrada = false;
       try {
          System.out.println("Ingrese el identificador de la Exposición de la que va a remover la obra:");
          idExposicion = sc.nextInt();
          System.out.println("Ingrese el identificador de la Obra que va sacar de la exposicion:");
          idObra = sc.nextInt();         
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      
      Exposicion exposicionAUsar = new Exposicion();
      for(int i = 0; i < listaExposiciones.size(); i++) {
          Exposicion expo = listaExposiciones.get(i);
          if (expo.getIdentificador() == idExposicion) {              
              exposicionEncontrada = true;
              exposicionAUsar = expo;
              break;
          }
      }

      if (exposicionEncontrada) {
            for(int i = 0; i < exposicionAUsar.listaObras.size(); i++) {
                ObraDeArte obra = exposicionAUsar.listaObras.get(i);
                if (obra.getIdObra() == idObra) {
                    obraEncontrada = true;
                    exposicionAUsar.listaObras.remove(i);
                    System.out.println("Obra se ha retirado de exposición");
                    break;
                }
            }
            for (int i = 0; i < listaObras.size(); i++) {
                ObraDeArte obra = listaObras.get(i);
                if (obra.getIdObra() == idObra) {
                    Exposicion nuevaExpo = new Exposicion();
                    obra.setExposicion(nuevaExpo);
                    break;
                }
            }
      } else if (!exposicionEncontrada) {
          System.out.println("No se encontró exposición con ese identificador");
      } else if (!obraEncontrada) {
          System.out.println("No se encontró obra con ese identificador");
      }
      String pausa = sc.nextLine();
    }
  
    
    // Administración de visitas
    public void verVisitas()
    {
      System.out.println("Visitas:");
      for(Visita visita : listaVisitas) {
          visita.desplegarDatos();
          System.out.println(" ");
      }
      String pausa = sc.nextLine(); 
    }
    
    public void registrarIngreso()
    {
        Visita nuevaVisita = new Visita();
        nuevaVisita.registrarIngreso();
        listaVisitas.add(nuevaVisita);
        System.out.println("Visita registrada");
        String pausa = sc.nextLine(); 
    }
    
    public void registrarSalida()
    {
        String rut = "000";
        boolean encontrado = false;
      try {
          System.out.println("Ingrese rut de la visita:");
          rut = sc.nextLine();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
      for(Visita visita : listaVisitas) {
          if (visita.getRut().equals(rut)) {
            System.out.println("Visita encontrada");
            visita.registrarSalida();            
            System.out.println("Salida registrada");
            encontrado = true;
            break;
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró visita con ese rut");
      }
      String pausa = sc.nextLine();
    }
    
    public void eliminarRegistro()
    {
        String rut = "000";
        boolean encontrado = false;
      try {
          System.out.println("Ingrese rut de la visita:");
          rut = sc.nextLine();
      } 
      catch(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
      }
      
       for(int i = 0; i < listaVisitas.size(); i++) {
          Visita visita = listaVisitas.get(i);
          if (visita.getRut().equals(rut)) {
              listaVisitas.remove(i);
              encontrado = true;
              System.out.println("Registro eliminado");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró visita con ese rut");
      }
      String pausa = sc.nextLine();
        
    }
    
    // Administración de autores
    public void verAutores()
    {
        for(Autor autor: listaAutores){
            autor.desplegarDatos();
        }
    }
    
    public void crearAutor()
    {
        Autor nuevoAutor = new Autor();
        try{
            nuevoAutor.leerDatos();
            listaAutores.add(nuevoAutor);
        } catch (Exception ex)  {
            System.out.println (ex.getMessage());
        }
    }
    
    public void asignarAutorAObra()
    {
        int idObra = -1;
        int idAutor = -1;
        boolean obraEncontrada = false;
        boolean autorEncontrado = false;
        try {
           System.out.println("Ingrese el identificador dela obra:");
           idObra = sc.nextInt();
           System.out.println("Ingrese el identificador del autor:");
           idAutor = sc.nextInt();         
       } 
       catch(Exception ex) {
         System.out.println("Error: " + ex.getMessage());
       }
       for(ObraDeArte obra : listaObras) {
           if (obra.getIdObra() == idObra) {
               obraEncontrada = true;
               for (Autor autor : listaAutores) {
                   if (autor.getId() == idAutor) {
                       autorEncontrado = true;
                       obra.setAutor(autor);
                       System.out.println("Autor asignado");
                       break;
                   }
               }
               break;
           }
       }
       if (!obraEncontrada) {
           System.out.println("No se encontré obra con ese id");
       }
       if (!autorEncontrado) {
           System.out.println("No se encontró autor con ese id");
       }
       String pausa = sc.nextLine();
    }
    
    public void eliminarAutor()
    {
        int idAutor = -1;
        boolean autorEncontrado = false;
        try {
           System.out.println("Ingrese el identificador del autor:");
           idAutor = sc.nextInt();         
       } 
       catch(Exception ex) {
         System.out.println("Error: " + ex.getMessage());
       }
       for (Autor autor : listaAutores) {
            if (autor.getId() == idAutor) {
                autorEncontrado = true;
                listaAutores.remove(autor);
                System.out.println("Autor eliminado");
                break;
            }
        }
       if (!autorEncontrado) {
           System.out.println("No se encontró autor con ese id");
       }
       String pausa = sc.nextLine();
        
    }
    
    
    
  
  // Datos de prueba
  
  public void cargarDatosDePrueba()
  {
      ObraDeArte nuevaObra1 = new ObraDeArte(1, 1, 1, "Obra de prueba", "0000-00-00", "0000-00-00", "0000-00-00", true);
      ObraDeArte nuevaObra2 = new ObraDeArte(2, 1, 1, "Obra de prueba2", "0000-00-00", "0000-00-00", "0000-00-00", true);
      listaObras.add(nuevaObra1);
      listaObras.add(nuevaObra2);
      Personal pepitoGuardia = new Personal("Pepito", "1-9", "pepitoguardia@gmail.com", "Arbolito verde 123", "123123", "pepito", 123, "1", "Guardia", "2016-10-01", "");
      listaPersonal.add(pepitoGuardia);
      Galeria galeriaNorte = new Galeria(1, "Galeria Norte", "Ala norte, segundo piso", "" );
      listaGalerias.add(galeriaNorte);
      Exposicion nuevaExpo = new Exposicion(1, "Las florecillas de primavera", "2016-10-01", "2016-11-02");
      listaExposiciones.add(nuevaExpo);
      System.out.println("Datos de prueba agregados");
      Autor nuevoAutor = new Autor(1, "Juanito", "1985-02-01", "0000-00-00", "Chile", "Un buen pintor");
      listaAutores.add(nuevoAutor);
      String pausa = sc.nextLine();
  }
}
