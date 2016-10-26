/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounoapp;
import java.util.*;

/**
 *
 * @author Leica
 */
public class Mascota {
    public int idMascota;
    public String nombreMascota;
    private String rutDueno;
    private String nombreDueno;
    public String especieMascota;
    
    Mascota(){
        this.idMascota = 0;
        this.nombreMascota = "";
        this.rutDueno = "";
        this.nombreDueno = "";
        this.especieMascota = "";        
    }
    
    Mascota(int idMascota, String nombreMascota, String rutDueno, String nombreDueno, String especieMascota) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.rutDueno = rutDueno;
        this.nombreDueno = nombreDueno;
        this.especieMascota = especieMascota;        
    }
    
    public void setRut(String rut) {
        this.rutDueno = rut;
    }
    
    public String getNombreDueno() {
    return this.nombreDueno;
    }
    
    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("id Mascota: ");
            this.idMascota = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Nombre Mascota: ");
            this.nombreMascota = sc.nextLine();
            
            System.out.println("Rut dueño: ");
            this.rutDueno = sc.nextLine();
            
            System.out.println("Nombre dueño: ");
            this.nombreDueno = sc.nextLine();
            
            System.out.println("Especie: ");
            this.especieMascota = sc.nextLine();
            
        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }        
    }
    
    public void desplegarDatos() {
        System.out.println("id mascota: " + this.idMascota + "\n nombre mascota: " + this.nombreMascota + "\n rut dueño: " + this.rutDueno + "\n nombre dueño: " + this.nombreDueno);
    }
    
    
    
}
