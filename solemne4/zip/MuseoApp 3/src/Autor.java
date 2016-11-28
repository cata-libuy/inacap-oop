/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author cata.orellana
 */
public class Autor {
    
private int identificador;
public String nombre;
public String fechaNacimiento;
public String fechaDefuncion;
public String descripcion;
public String pais;
public ArrayList<Autor> autor=new ArrayList<Autor>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public void Autor()
{
    this.identificador=0;
    this.nombre="";
    this.fechaNacimiento="";
    this.fechaDefuncion="";
    this.pais="";
    this.descripcion="";
}

public void Autor(int identificador, String nombre, String fechaNacimiento, String fechaDefuncion, String pais, String descripcion)
{
    this.identificador=identificador;
    this.nombre=nombre;
    this.fechaNacimiento=fechaNacimiento;
    this.fechaDefuncion=fechaDefuncion;
    this.pais=pais;
    this.descripcion=descripcion;
}

public void menu()
{
    int opcion=0;
    try
    {
        do
        {
        System.out.println("Ingrese una opcion:");
        System.out.println("1.- Crear Autor.");
        System.out.println("2.- Modificar Autor.");
        System.out.println("3.- Desplegar Autor.");
        System.out.println("4.- Eliminar Autor.");
        System.out.println("5.- Salir.");
        opcion=Integer.parseInt(br.readLine());
        
        switch(opcion)
        {
            case 1: arrayCrearAutor(); break;
            case 2: modificarAutor(); break;
            case 3: arrayDesplegarDatos(); break;
            case 4: eliminarAutor(); break;
            case 5: System.out.println("Hasta pronto. "); break;
        }
        }while(opcion!=5);
    }
    catch(Exception ex)
    {
        System.out.println("Error: "+ex.getMessage());
    }
}
    
public void arrayCrearAutor()
{
    Autor aut=new Autor();
        aut.crearAutor();
        autor.add(aut);
}

public void crearAutor()
{
    try
    {
        System.out.println("Ingrese los siguentes datos de Autor: ");
        System.out.println("Ingrese Identificado Numero de Autor: ");
        identificador=Integer.parseInt(br.readLine());
        System.out.println("Ingrese Nombre de Autor: ");
        nombre=br.readLine();
        System.out.println("Ingrese Fecha de Nacimiento de Autor: ");
        fechaNacimiento=br.readLine();
        System.out.println("Ingrese Fecha de Defuncion de Autor (Si no aplica, escriba 'vivo' : ");
        fechaDefuncion=br.readLine();
        System.out.println("Ingrese Pais de Autor: ");
        pais=br.readLine();
        System.out.println("Ingrese Descripcion: ");
        descripcion=br.readLine();
    }
    catch(Exception ex)
    {
        System.out.println("Error: "+ex.getMessage());
    }
}

public void modificarAutor()
{
     int ide;
        try
        {
            System.out.println("Ingrese Identificador Numerico: ");
            ide=Integer.parseInt(br.readLine());
            boolean encontrado=false;
            
            for(int i=0;i<autor.size();i++)
            {
                if(autor.get(i).identificador==ide)
                {
                    System.out.println("Ingrese Nombre de Autor: ");
                    nombre=br.readLine();
                    System.out.println("Ingrese Fecha de Nacimiento de Autor: ");
                    autor.get(i).fechaNacimiento=br.readLine();
                    System.out.println("Ingrese Fecha de Defuncion de Autor (Si no aplica, escriba 'vivo' : ");
                    autor.get(i).fechaDefuncion=br.readLine();
                    System.out.println("Ingrese Pais de Autor: ");
                    pais=br.readLine();
                    System.out.println("Ingrese Descripcion: ");
                    descripcion=br.readLine();
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
}

public void arrayDesplegarDatos()
{
    for(int i=0; i<autor.size();i++)
        {
            autor.get(i).desplegarDatos();
        }
}

public void desplegarDatos()
{
    try
    {
        System.out.println("Los datos de Autor son los siguientes: ");
        System.out.println("Identificado Autor:"+identificador );
        System.out.println("Nombre autor: "+nombre);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
        System.out.println("Fecha de Defuncion: "+fechaDefuncion);
        System.out.println("Pais: "+pais);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("----------------------------------------------");
    }
    catch(Exception ex)
    {
        System.out.println("Error: "+ex.getMessage());
    }
}

public void eliminarAutor()
{
        int ide;
        String resp="";
        try
        {
            System.out.println("Ingrese Identificador Numerico: ");
            ide=Integer.parseInt(br.readLine());
            boolean encontrado=false;
            
            for(int i=0;i<autor.size();i++)
            {
                if(autor.get(i).identificador==ide)
                {
                    autor.remove(i);
                    System.out.println("Registro eliminado exitosamente.");
                    
                }
                else
                    System.out.println("Registro no encontrado");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
    }

}
