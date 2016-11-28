
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cata.orellana
 */
public class Visita extends Persona {
    String fechaIngreso;
    String fechaSalida;
    Scanner sc = new Scanner(System.in);
    
    Visita()
    {
        super();
        this.fechaIngreso = "";
        this.fechaSalida = "";
    }
    
    Visita(String nombre, String rut, String correo, String Direccion, String Tfno, String User, int Password, String fechaIngreso )
    {
        super(nombre, rut, correo, Direccion, Tfno, User, Password);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = "";
    }
    
    public void registrarIngreso()
    {
        try {
            super.leerDatos();
            System.out.println("Fecha y hora de Ingreso (aaaa-mm-dd 00:00)");
            this.fechaIngreso = sc.nextLine();
        } 
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void registrarSalida()
    {
         try {
            System.out.println("Fecha y hora de Salida (aaaa-mm-dd 00:00)");
            this.fechaSalida = sc.nextLine();
        } 
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }       
    }
    
    public void desplegarDatos()
    {
        super.desplegarDatos();
        System.out.println("\n Ingreso: " + fechaIngreso + "\n Salida: " + fechaSalida);
    }
    
}
