/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo;
import classes.*;
import java.util.*;


/**
 *
 * @author Leica
 */
public class GestionPersonas {
    ArrayList<Persona> listaPersona = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    
    public static void main(String a [])
    {
        // LLenar lista persona
        String respuesta = "S";
        Persona objetoPersona;
        GestionPersonas objetoApp = new GestionPersonas();
        while(respuesta.equals("S")){
            objetoPersona = new Persona();
            objetoPersona.leerDatos();
            System.out.println("Desea continuar [S/N]");
            respuesta = objetoApp.entrada.nextLine().toUpperCase();
            objetoApp.listaPersona.add(objetoPersona);
        }
        
        for(Persona p :objetoApp.listaPersona)
        {
            p.desplegarDatos();
        }
        System.out.println("hasta pronto");
    }
    
}
