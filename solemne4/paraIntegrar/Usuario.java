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
public class Usuario extends PersoAndUser{
    public String nombre;
    public String rut;
    public String correo;
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Usuario() {
    
        super();
        this.nombre="";
        this.rut="";
        this.correo="";
    }

    public Usuario(String nombre, String rut, String correo, String cargo, String FechaIngreso, String Especialidad, String FechaEgreso, String Direccion, String Tfno, String User, int Password, int IdPersonal) {
        super(cargo, FechaIngreso, Especialidad, FechaEgreso, Direccion, Tfno, User, Password, IdPersonal);
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
    }

    
    
    public void llenarDatos() throws IOException
    {
        /*super.DatosPersonal();*/
        System.out.println("Ingrese su Nombre: ");
        this.nombre=br.readLine();
        System.out.println("Ingrese su Rut:");
        this.rut=br.readLine();
        System.out.println("Ingrese su Correo: ");
        this.correo=br.readLine();
    }
    
   public static void main(String[] args) throws IOException
   {
       Usuario niu = new Usuario();
       niu.llenarDatos();
   }
}


