/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.*;

/**
 *
 * @author Leica
 */
public class Persona 
{
    private String rut;
    private String nombre;
    private String apeMat;
    private String apePat;

    public String getApeMat() 
    {
        return apeMat;
    }

    public String getApePat() 
    {
        return apePat;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getRut() 
    {
        return rut;
    }

    public void setApeMat(String apeMat) 
    {
        this.apeMat = apeMat;
    }

    public void setApePat(String apePat) 
    {
        this.apePat = apePat;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setRut(String rut) 
    {
        this.rut = rut;
    }

    public Persona() 
    {
        this.rut = "";
        this.nombre = "";
        this.apeMat = "";
        this.apePat = "";   
    }

    public Persona(String rut, String nombre, String apeMat, String apePat) 
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apeMat = apeMat;
        this.apePat = apePat;
    }

    public void leerDatos()
    {
        Scanner entrada = new Scanner(System.in);
        try
        {
            System.out.println("Ingrese Datos de Persona\n"+
                               "------------------------\n");
                       
            System.out.println("Rut Persona\t\t:");
            this.rut = entrada.nextLine();

            System.out.println("Nombre Persona\t\t:");
            this.nombre = entrada.nextLine();

            System.out.println("Apellido Materno Persona\t\t:");
            this.apeMat = entrada.nextLine();

            System.out.println("Apellido Paterno Persona\t\t:");
            this.apePat = entrada.nextLine();            
        }    
        catch (Exception ex)
        {
            System.out.println("Error "+ ex.getMessage());
        }    
    }        
  
    public void desplegarDatos()
    {
        try
        {
            System.out.println("Datos de Persona\n"+
                               "------------------------\n");
           
            System.out.println("Rut\t\t:"+this.rut);        
            System.out.println("Nombre\t\t:"+this.nombre);          
            System.out.println("Apellido Materno\t\t:"+this.apeMat);           
            System.out.println("Apellido Paterno\t\t:"+this.apePat);
            
        }    
        catch (Exception ex)
        {
            System.out.println("Error "+ ex.getMessage());
        }       
    }        
    
            
}
