/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Exposicion {
   public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   private int identificador;
   public String nombre;
   public String fechaInicio;
   public String fechaTermino;
   public Galeria galeria;
   public ArrayList<ObraDeArte> listaObras = new ArrayList<ObraDeArte>();
   
   
   public int getIdentificador() {
        return identificador;
    }

   public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

   Exposicion()
    {
        this.identificador=0;
        this.nombre = "";
        this.fechaInicio="";
        this.fechaTermino="";
        this.galeria = new Galeria();
    }    
    
    Exposicion(int identificador, String nombre, String fechaInicio, String fechaTermino)
    {
        this.identificador=identificador;
        this.nombre = nombre;
        this.fechaInicio=fechaInicio;
        this.fechaTermino=fechaTermino;
        this.galeria = new Galeria();
    }
    
    public void leerDatos()
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
//            System.out.println("Ingrese Nombre de Galeria donde se realiza Exposicion: ");
//            nombreGaleria=br.readLine();
        }
        catch (Exception ex)
        {
                 System.out.println("Error: "+ex.getMessage());   
        }
    }
    
    public void editarDatos()
    {
        try
        {
            System.out.println("Ingrese nombre de Exposicion: ");
            this.nombre = br.readLine();
            System.out.println("Ingrese Fecha de Inicio de Exposicion(DD-MM-AAAA): ");
            this.fechaInicio=br.readLine();
            System.out.println("Ingrese Fecha de Termino de Exposicion(DD-MM-AAAA): ");
            this.fechaTermino=br.readLine();
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
            System.out.println("Los datos de Exposicion son: ");
            System.out.println("Identificador: "+identificador);
            System.out.println("Fecha de Inicio: "+fechaInicio);
            System.out.println("Fecha de Termino: "+fechaTermino);
            System.out.println("Galeria en donde se Expone: " + galeria.getNombre() + " id galeria: " + galeria.getIdentificador());
            System.out.println("------------------------------------------------");
        }
        catch (Exception ex)
        {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void setGaleria(Galeria galeria) 
    {
        this.galeria = galeria;
    }
    
    public void agregarObraDeArte(ObraDeArte obra)
    {
        listaObras.add(obra);
    }
    
    public void quitarObraDeArte(int obraId)
    {
        boolean encontrado = false;
        for(int i = 0; i < listaObras.size(); i++) {
          ObraDeArte obra = listaObras.get(i);
          if (obra.getIdObra() == obraId) {
              listaObras.remove(i);
              encontrado = true;
              System.out.println("Obra de Arte eliminada");
          }
      }
      if (!encontrado) {
          System.out.println("No se encontró obra con ese id");
      }
    }
            
}