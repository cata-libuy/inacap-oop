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
public class PersoAndUser {
/*CLASE PERSONAL*/
    
public String cargo;
private String FechaIngreso;
public String Especialidad;
private String FechaEgreso;
public String Direccion;
public String Tfno;
private String User;
private int Password;
private int IdPersonal;
public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
        
    }

    public PersoAndUser() {
        this.cargo = "";
        this.FechaIngreso = "";
        this.Especialidad = "";
        this.FechaEgreso = "";
        this.Direccion = "";
        this.Tfno = "";
        this.User = "";
        this.Password = 0;
        this.IdPersonal = 0;
    }
    
    

    public PersoAndUser(String cargo, String FechaIngreso, String Especialidad, String FechaEgreso, String Direccion, String Tfno, String User, int Password, int IdPersonal) {
        this.cargo = cargo;
        this.FechaIngreso = FechaIngreso;
        this.Especialidad = Especialidad;
        this.FechaEgreso = FechaEgreso;
        this.Direccion = Direccion;
        this.Tfno = Tfno;
        this.User = User;
        this.Password = Password;
        this.IdPersonal = IdPersonal;
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
    
    public void DatosPersonal() throws IOException
    {
        System.out.println("----------Ingrese los siguientes datos----------"); 
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
        
        
    }
}

