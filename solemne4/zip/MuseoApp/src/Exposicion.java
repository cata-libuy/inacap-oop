// package museoapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laura
 */
public class Exposicion {
   public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   private int identificador;
   public String fechaInicio;
   public String fechaTermino;
   public String nombreGaleria;
   
   
   public int getIdentificador() {
        return identificador;
    }

   public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

   public void Exposicion()
    {
        this.identificador=0;
        this.fechaInicio="";
        this.fechaTermino="";
        this.nombreGaleria="";
    }    
    
    public void Exposicion(int identificador, String fechaInicio, String fechaTermino, String nombreGaleria)
    {
        this.identificador=identificador;
        this.fechaInicio=fechaInicio;
        this.fechaTermino=fechaTermino;
        this.nombreGaleria=nombreGaleria;
    }
    
    public void menu()
    {
        int opcion=0;
        do
        {
            try
        {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1.- Crear Exposicion.");
            System.out.println("2.- Modificar Exposicion.");
            System.out.println("3.- Desplegar datos Exposicion. ");
            System.out.println("4.- Eliminar Exposicion.");
            System.out.println("5.- Salir");
            opcion=Integer.parseInt(br.readLine());
            
            switch(opcion)
            {
                case 1: crearExposicion(); break;
                case 2: modificarExposicion(); break;
                case 3: desplegarDatos(); break;
                case 4: eliminarExposicion(); break;
                case 5: System.out.println("Hasta pronto."); break;
            }
        }
        catch(Exception ex)
        {
                    System.out.println("Error: "+ex.getMessage());
        }
        } while(opcion!=5);
    }
     
    public void crearExposicion()
    {
        try
        {
            System.out.println("Ingrese los siguientes datos de Exposicion: ");
            System.out.println("Ingrese Identificador numerico de Exposicion: ");
            identificador=Integer.parseInt(br.readLine());
            System.out.println("Ingrese Fecha de Inicio de Exposicion(DD-MM-AAAA): ");
            fechaInicio=br.readLine();
            System.out.println("Ingrese Fecha de Termino de Exposicion(DD-MM-AAAA): ");
            fechaTermino=br.readLine();
            System.out.println("Ingrese Nombre de Galeria donde se realiza Exposicion: ");
            nombreGaleria=br.readLine();
        }
        catch (Exception ex)
        {
                 System.out.println("Error: "+ex.getMessage());   
        }
    }
    
    private void modificarExposicion()
    {
        String confirmar="";
        try
        {
            System.out.println("Ha seleccionado Modificar Exposicion, desea continuar[S/N]?");
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
            System.out.println("Los datos de Exposicion son: ");
            System.out.println("Identificador: "+identificador);
            System.out.println("Fecha de Inicio: "+fechaInicio);
            System.out.println("Fecha de Termino: "+fechaTermino);
            System.out.println("Galeria en donde se Expone: "+nombreGaleria);
            System.out.println("------------------------------------------------");
        }
        catch (Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    private void eliminarExposicion()
    {
        
    }
            
}