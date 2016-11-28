/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package museoapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    public ArrayList<Exposicion> listaExposiciones = new ArrayList<Exposicion>();

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
    
    public String getNombre() {
        return nombre;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    public void leerDatos()
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
    
    public void desplegarDatos()
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
    
    public void editarDatos() throws IOException
    {
        System.out.println("Ingrese Nombre de Galeria: ");
        this.nombre=br.readLine();
        System.out.println("Ingrese Ubicacion de Galeria (Ej: Ala Este): ");
        this.ubicacion=br.readLine();
        System.out.println("Ingrese Nombre de Museo a la que pertenece Galeria: ");
        System.out.println("Registro modificado exitosamente.");
    }
        
    public void agregarExposicion(Exposicion expo)
    {
        listaExposiciones.add(expo);
    }
    
    public void quitarExposicion(int expoId)
    {
        boolean encontrado = false;
        for(int i = 0; i < listaExposiciones.size(); i++) {
          Exposicion expo = listaExposiciones.get(i);
          if (expo.getIdentificador() == expoId) {
              listaExposiciones.remove(i);
              encontrado = true;
              System.out.println("Exposición eliminada");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró exposición con ese id");
      }
    }
    
  }
    

