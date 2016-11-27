
// package museoapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laura
 */
public class Galeria {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int identificador=0;
    public String nombre="";
    public String ubicacion="";
    public String nombreMuseo="";

    /**
     *
     * @param args
     * @throws IOException
     */
       
    
    public Galeria()
    {
        this.identificador=0;
        this.nombre="";
        this.ubicacion="";
        this.nombreMuseo="";
    }
    
    public Galeria(int identificador, String nombre, String ubicacion, String nombreMuseo)
    {
        this.identificador=identificador;
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.nombreMuseo=nombreMuseo;
    }
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public void menu()
    {
        int opcion=0;
        do
        {
            try
        {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1.- Crear Galeria.");
            System.out.println("2.- Modificar Galeria.");
            System.out.println("3.- Desplegar datos Galeria. ");
            System.out.println("4.- Eliminar Galeria.");
            System.out.println("5.- Salir");
            opcion=Integer.parseInt(br.readLine());
            
            switch(opcion)
            {
                case 1: crearGaleria(); break;
                case 2: modificarGaleria(); break;
                case 3: desplegarDatos(); break;
                case 4: eliminarGaleria(); break;
                case 5: System.out.println("Hasta pronto."); break;
            }
        }
        catch(Exception ex)
        {
                    System.out.println("Error: "+ex.getMessage());
        }
        } while(opcion!=5);
    }
     
    public void crearGaleria()
    {
        try
        {
            System.out.println("Ingrese los siguientes datos de Galeria: ");
            System.out.println("Ingrese Identificador numerico de Galeria: ");
            identificador=Integer.parseInt(br.readLine());
            System.out.println("Ingrese Nombre de Galeria: ");
            nombre=br.readLine();
            System.out.println("Ingrese Ubicacion de Galeria (Ej: Ala Este): ");
            ubicacion=br.readLine();
            System.out.println("Ingrese Nombre de Museo a la que pertenece Galeria: ");
            nombreMuseo=br.readLine();
        }
        catch (Exception ex)
        {
                 System.out.println("Error: "+ex.getMessage());   
        }
    }
    
    private void modificarGaleria()
    {
        String confirmar="";
        try
        {
            System.out.println("Ha seleccionado Modificar Galeria, desea continuar[S/N]?");
            confirmar=br.readLine();
            if(confirmar=="S"||confirmar=="s")
            {
                
            }
            else
            {
                menu();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    private void desplegarDatos()
    {
        try
        {
            System.out.println("Los datos de Galeria son: ");
            System.out.println("Identificador: "+identificador);
            System.out.println("Nombre: "+nombre);
            System.out.println("Ubicacion: "+ubicacion);
            System.out.println("Museo al que pertenece: "+nombreMuseo);
            System.out.println("------------------------------------------------");
        }
        catch (Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    private void eliminarGaleria()
    {
        
    }
    
}
