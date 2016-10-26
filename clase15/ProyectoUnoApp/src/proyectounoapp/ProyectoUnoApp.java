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
public class ProyectoUnoApp {
    
    ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    int opcionMenu;
    boolean continuar = true;
    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoUnoApp app = new ProyectoUnoApp();
        while(app.continuar) {
            app.menu();
        }
        System.out.println("Hasta pronto");
    }
    
    public void menu() {
        System.out.println("OPCIONES MENU \n 1) Ingresar Mascota \n 2) Desplegar Mascotas \n 3) Salir");
        opcionMenu = sc.nextInt();
        switch(opcionMenu) {
            case 1: ingresarMascota();
                break;
            case 2: desplegarMascotas();
                break;
            case 3: continuar = false;
                break;
            default:
               continuar = false;
        }
    }
    
    public void ingresarMascota() {
        Mascota nuevaMascota = new Mascota();
        nuevaMascota.leerDatos();
        mascotas.add(nuevaMascota);
    }
    
    public void desplegarMascotas() {
        for(Mascota mascota : mascotas) {
            mascota.desplegarDatos();
        }
    }
    
}
