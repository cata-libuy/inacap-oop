/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MarcoAntonio
 */
public class Persona {
    public String nombre;
    public String rut;
    public String correo;
    public String Direccion;
    public String Tfno;
    private String User;
    private int Password;    
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
  
    
   public Persona() {
        this.nombre = "";
        this.rut = "";
        this.correo = "";
        this.Direccion = "";
        this.Tfno = "";
        this.User = "";
        this.Password = 0;
    }
    

    public Persona(String nombre, String rut, String correo, String Direccion, String Tfno, String User, int Password) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.Direccion = Direccion;
        this.Tfno = Tfno;
        this.User = User;
        this.Password = Password;
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTfno() {
        return Tfno;
    }

    public void setTfno(String Tfno) {
        this.Tfno = Tfno;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }
    
    
    
    public void leerDatos() throws IOException
    {
        System.out.println("\n----------Ingrese los siguientes datos----------\n"); 
        System.out.println("Ingrese su Nombre: ");
        this.nombre= br.readLine();
        System.out.println("Ingrese su Rut:");
        this.rut=br.readLine();
        System.out.println("Direccion:");
        this.Direccion=br.readLine();
        System.out.println("telefono");
        this.Tfno=br.readLine();
        System.out.println("Nombre de Usuario");
        this.User=br.readLine();
        System.out.println("Su Clave");
        this.Password=Integer.parseInt(br.readLine());
        System.out.println("su numero de personal");
    }
    
    
    public void desplegarDatos()
    {
        System.out.println("Datos Personales");
        System.out.println(
                "Nombre "+this.nombre +
                " Rut "+this.rut+
                " Dirección "+this.Direccion+
                " Telefono "+this.Tfno
        );
    }
    
}   


