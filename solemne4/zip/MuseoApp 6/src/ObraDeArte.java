import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package museoapp;

/**
 *
 * @author cata.orellana
 */
public class ObraDeArte {
    private int idObra, idAutor, idTipo;
    public String titulo, fechaCreacion, fechaLlegada, fechaColocacion;
    public boolean estado;
    public Exposicion exposicion;
    public Autor autor;
    Scanner sc = new Scanner(System.in);
    
    ObraDeArte()
    {
        this.idObra = 0;
        this.titulo = "";
        this.fechaCreacion = "0000-00-00";
        this.fechaLlegada = "0000-00-00";
        this.fechaColocacion = "0000-00-00";
        this.estado = false;
        this.autor = new Autor();
        this.exposicion = new Exposicion();
    }

        ObraDeArte(
                int idObra,
                int idAutor,
                int idTipo,
                String titulo,
                String fechaCreacion,
                String fechaLlegada,
                String fechaColocacion,
                boolean estado
                )
    {
        this.idObra = idObra;
        this.idAutor = idAutor;
        this.idTipo = idTipo;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.fechaLlegada = fechaLlegada;
        this.fechaColocacion = fechaColocacion;
        this.estado = estado;
        this.exposicion = new Exposicion();
        this.autor = new Autor();
    }
    
    public void editarDatos()
    {
        System.out.println("Ingresar datos de la obra. Dejar en blanco si no sequieren modificar");
        try {
            System.out.println("titulo: ");
            String titulo = sc.nextLine();
            this.titulo = titulo.length() > 0 ? titulo : this.titulo;
            
            System.out.println("fecha creación: ");
            String fechaCreacion = sc.nextLine();
            this.fechaCreacion = fechaCreacion.length() > 0 ? fechaCreacion : this.fechaCreacion;
            
            System.out.println("fecha llegada: ");
            String fechaLlegada = sc.nextLine();
            this.fechaLlegada = fechaLlegada.length() > 0 ? fechaLlegada : this.fechaLlegada;
            
            System.out.println("fecha colocación: ");
            String fechaColocacion = sc.nextLine();
            this.fechaColocacion = fechaColocacion.length() > 0 ? fechaColocacion : this.fechaColocacion;        
            
            System.out.println("¿activa? (s/n): ");
            String activa = sc.nextLine();
            this.estado = activa.toLowerCase() == "s" ? true : false; 
            
        } 
        catch(Exception ex) {
         System.out.println(ex.getMessage());
        }        
        
    }
    
    public void leerDatos()
    {
        System.out.println("Ingresar datos de la obra");
        try {
            System.out.println("id obra: ");
            this.idObra = sc.nextInt();
            System.out.println("id autor: (0 para obra anónima)");
            this.idAutor = sc.nextInt();
            System.out.println("id tipo: (0 para obra anónima)");
            this.idTipo = sc.nextInt();            
            sc.nextLine();
            System.out.println("titulo: ");
            this.titulo = sc.nextLine();
            System.out.println("fecha creación: ");
            this.fechaCreacion = sc.nextLine();
            System.out.println("fecha llegada: ");
            this.fechaLlegada = sc.nextLine();
            System.out.println("fecha colocación: ");
            this.fechaColocacion = sc.nextLine();
            System.out.println("¿activa? (s/n): ");
            String activa = sc.nextLine();
            this.estado = activa.toLowerCase() == "s" ? true : false; 
            
        } 
        catch(Exception ex) {
         System.out.println(ex.getMessage());
        }
    }
    
    public void desplegarDatos()
    {
        System.out.println("id Obra: " + this.idObra);
        System.out.println("autor: " + this.autor.getName());
        System.out.println("id tipo: " + this.idTipo);
        System.out.println("titulo: " + this.titulo);
        System.out.println("fecha de creación: " + this.fechaCreacion);
        System.out.println("fecha de llegada: " + this.fechaLlegada);
        System.out.println("fecha de colocación: " + this.fechaColocacion);
        String activa = this.estado ? "Sí" : "No";
        System.out.println("activa: " + activa);
    }
    
    public int getIdObra() {
        return this.idObra;
    }
    
    public void darDeBaja() {
        this.estado = false;
    }
    
    public void setExposicion(Exposicion exposicion) 
    {
        this.exposicion = exposicion;
    }
    
    public void setAutor(Autor autor) 
    {
        this.autor = autor;
    }
    
}
