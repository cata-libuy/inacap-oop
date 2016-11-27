
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cata.orellana
 */
public class Personal extends Persona 
{
    private String idTrabajador;
    public String cargo;
    private String fechaIngreso;
    private String fechaEgreso;
    private boolean loggedIn;
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public Personal()
    {
        super();
        this.idTrabajador = "";
        this.cargo = "";
        this.fechaIngreso = "";
        this.fechaEgreso = "";
        this.loggedIn = false;
    }
    
    public Personal(String nombre, String rut, String correo, String Direccion, String Tfno, String User, int Password, String idTrabajador, String cargo, String fechaIngreso, String fechaEgreso)
    {
        super(nombre, rut, correo, Direccion, Tfno, User, Password);
        this.idTrabajador = idTrabajador;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.loggedIn = false;
    }
    
    public void desplegarDatos()
    {
        super.desplegarDatos();
        System.out.println(
                "idTrabajador "+this.idTrabajador +
                " cargo "+this.cargo+
                " Fecha ingreso "+this.fechaIngreso+
                " Fecha egreso "+this.fechaEgreso
        );
        System.out.println("");
        
    }
    
    public void leerDatos()
    {
        try {
            super.leerDatos();
            System.out.println("Ingrese id del trabajador: ");
            this.idTrabajador=br.readLine();
            System.out.println("Ingrese cargo: ");
            this.cargo=br.readLine();
            System.out.println("Fecha de ingreso: ");
            this.fechaIngreso=br.readLine();
            this.fechaEgreso=br.readLine();
        } catch (Exception ex) {
         System.out.println(ex.getMessage());    
        }    
    }
    
    public void editarDatos()
    {
        try {
            super.leerDatos();
            System.out.println("cargo: ");
            this.cargo= br.readLine();
            System.out.println("Fecha de ingreso: ");
            this.fechaIngreso=br.readLine();
            System.out.println("Fecha de egreso: ");
            this.fechaEgreso=br.readLine();
        } catch (Exception ex) {
         System.out.println(ex.getMessage());    
        }    
    }
    
    public String getIdTrabajador()
    {
        return this.idTrabajador;
    }
    
    public String getRut() {
        return super.getRut();
    }
    
    public boolean validatePassword(int password)
    {
        int userPassword = super.getPassword();
        return userPassword == password;
    }
            
    public boolean logIn(int password)
    {
        if (validatePassword(password)) {
            this.loggedIn = true;
            return true;
        }
        
        return false;
    }
    
    public void logOut() {
        this.loggedIn = false;
    }
    
    
}
