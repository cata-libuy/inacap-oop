package bancoapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leica
 */
public class Titular {
    String nombre, apellidos;
    int edad;
    
    Titular()
    {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }
    
    Titular(String nombre, String apellidos, int edad)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void printDatos()
    {
       System.out.println("Nombre: " + this.nombre + "\n Apellidos: " + this.apellidos + "\n edad: " + this.edad);
    }    
}

