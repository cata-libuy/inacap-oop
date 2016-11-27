package museoapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laura
 */
public class Nacionalidad {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Autor autor=new Autor();
    public String descripcion;
    public String pais;
    public int identificador;
    
    public static void main (String []a) throws IOException
    {
        
    }
    
    public void Nacionalidad()
    {
        this.identificador=0;
        this.descripcion="";
        this.pais="";
    }
    
    public void Nacionalidad(int identificador, String descripcion, String pais)
    {
        this.identificador=identificador;
        this.descripcion=descripcion;
        this.pais=pais;
    }
    
    public void menu()
    {
        int opcion=0;
        do
        {
            try
        {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1.- Crear Nacionalidad.");
            System.out.println("2.- Modificar Nacionalidad.");
            System.out.println("3.- Desplegar datos Nacionalidad. ");
            System.out.println("4.- Eliminar Nacionalidad.");
            System.out.println("5.- Salir");
            opcion=Integer.parseInt(br.readLine());
            
            switch(opcion)
            {
                case 1: crearNacionalidad(); break;
                case 2: modificarNacionalidad(); break;
                case 3: desplegarDatos(); break;
                case 4: eliminarNacionalidad(); break;
                case 5: System.out.println("Hasta pronto."); break;
            }
        }
        catch(Exception ex)
        {
                    System.out.println("Error: "+ex.getMessage());
        }
        } while(opcion!=5);
    }
    
    public void crearNacionalidad()
    {
        try
        {
            System.out.println("Ingrese los siguientes datos de Nacionalidad");
            System.out.println("Ingrese Identificador de Autor: ");
            identificador=Integer.parseInt(br.readLine());
            System.out.println("Ingrese Descripcion: ");
            descripcion=br.readLine();
            System.out.println("Ingrese Pais: ");
            pais=br.readLine();
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void modificarNacionalidad()
    {
        try
        {
            
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void eliminarNacionalidad()
    {
        try
        {
            
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void desplegarDatos()
    {
        try
        {
            System.out.println("Los Datos de Nacionalidad son: ");
            System.out.println("Identificador Autor: "+identificador);
            System.out.println("Descripcion: "+descripcion);
            System.out.println("Pais: "+pais);
            System.out.println("------------------------------------------------");
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
}