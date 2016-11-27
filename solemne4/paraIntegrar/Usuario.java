/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persoanduser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MarcoAntonio
 */
public class Usuario {
    public String nombre;
    public String rut;
    public String correo;
    public String cargo;
    private String FechaIngreso;
    public String Especialidad;
    private String FechaEgreso;
    public String Direccion;
    public String Tfno;
    private String User;
    private int Password;
    private int IdPersonal;
    public String nombreV;
    public String rutV;
    
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    
   public Usuario() {
        this.nombre = "";
        this.rut = "";
        this.correo = "";
        this.cargo = "";
        this.FechaIngreso = "";
        this.Especialidad = "";
        this.FechaEgreso = "";
        this.Direccion = "";
        this.Tfno = "";
        this.User = "";
        this.Password = 0;
        this.IdPersonal = 0;
        this.nombreV="";
        this.rutV="";
    }
    

    public Usuario(String nombre, String rut, String correo, String cargo, String FechaIngreso, String Especialidad, String FechaEgreso, String Direccion, String Tfno, String User, int Password, int IdPersonal, String nombreV, String rutV) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.cargo = cargo;
        this.FechaIngreso = FechaIngreso;
        this.Especialidad = Especialidad;
        this.FechaEgreso = FechaEgreso;
        this.Direccion = Direccion;
        this.Tfno = Tfno;
        this.User = User;
        this.Password = Password;
        this.IdPersonal = IdPersonal;
        this.nombreV = nombreV;
        this.rutV = rutV;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getFechaEgreso() {
        return FechaEgreso;
    }

    public void setFechaEgreso(String FechaEgreso) {
        this.FechaEgreso = FechaEgreso;
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

    public int getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(int IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getRutV() {
        return rutV;
    }

    public void setRutV(String rutV) {
        this.rutV = rutV;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }
    
    
    
    public void DatosPersonal2() throws IOException
    {
        System.out.println("\n----------Ingrese los siguientes datos----------\n"); 
        System.out.println("Ingrese su Nombre: ");
        this.nombre=br.readLine();
        System.out.println("Ingrese su Rut:");
        this.rut=br.readLine();
        System.out.println("Ingrese Su Cargo: ");
        this.cargo=br.readLine();
        System.out.println("Ingrese su Fecha de Ingreso: ");
        this.FechaIngreso=br.readLine();
        System.out.println("Ingrese su Especialidad:");
        this.Especialidad=br.readLine();
        System.out.println("Direccion:");
        this.Direccion=br.readLine();
        System.out.println("telefono");
        this.Tfno=br.readLine();
        System.out.println("Nombre de Usuario");
        this.User=br.readLine();
        System.out.println("Su Clave");
        this.Password=Integer.parseInt(br.readLine());
        System.out.println("su numero de personal");
        this.IdPersonal=Integer.parseInt(br.readLine());  
        /*System.out.println ("Entrada recibida por teclado es: \"" + null +"\"");*/
        
    }
    
    
    public void DatosVisitantes() throws IOException
    {
        
        System.out.println("Ingrese su Nombre: ");
        this.nombreV=br.readLine();
        System.out.println("Ingrese su Rut:");
        this.rutV=br.readLine();
        System.out.println("Ingrese su Correo: ");
        this.correo=br.readLine();
    }
    
    public void DesplegarDatosPersonal()
    {
        System.out.println("Su personal es el siguiente");
        System.out.println("Nombre "+this.nombre+" Rut "+this.rut+" Cargo "+this.cargo+" Ingreso "+this.FechaIngreso);
        System.out.println(" Especialidad "+this.Especialidad+" Dirección "+this.Direccion+" Telefono "+this.Tfno);
        System.out.println("");
    }
    
    public void DatosVisitas()
    {
        System.out.println("Nombre: "+this.nombreV+" Rut: "+this.rutV+" Correo: "+this.correo);
    }
}   


