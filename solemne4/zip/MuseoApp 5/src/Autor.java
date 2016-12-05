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
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    Autor()
    {
        this.identificador=0;
        this.nombre="";
        this.fechaNacimiento="";
        this.fechaDefuncion="";
        this.pais="";
        this.descripcion="";
    }

    Autor(int identificador, String nombre, String fechaNacimiento, String fechaDefuncion, String pais, String descripcion)
    {
        this.identificador=identificador;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.fechaDefuncion=fechaDefuncion;
        this.pais=pais;
        this.descripcion=descripcion;
    }


    public void leerDatos()
    {
        try
        {            
            System.out.println("Ingrese Identificador Numero de Autor: ");
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
    
    public String getName()
    {
        return this.nombre;
    }
    
    public int getId()
    {
        return this.identificador;
    }

}
