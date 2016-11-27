/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persoanduser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;





/**
 *
 * @author MarcoAntonio
 */
public class PersoAndUser {
/*CLASE PERSONAL*/
    public ArrayList<Usuario> lista = new ArrayList<Usuario>();
    
    
    
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       PersoAndUser objeto = new PersoAndUser();
        objeto.Menu();
        
    }

   

   
    
    public void Menu()
    {
        int op=0;
        
        do {
            
                try
            {
                System.out.println("----------Selecciones una de las siguientes opciones----------");
                System.out.println("1.- Crear Personal");
                System.out.println("2.- Crear Visitante");
                System.out.println("3.- Mostrar Datos de Personal");
                System.out.println("4.- Mostrar Datos Visitantes");
                System.out.println("5.- Modicificar Personal");
                System.out.println("6.- Eliminar Personal");
                System.out.println("7.- Salir");

                op=Integer.parseInt(br.readLine());

                switch(op)
                {
                    case 1: DatosPersonal();
                        break;
                    case 2: DatosVisitantes();
                        break;
                    case 3: DesplegarDatosPersonal();
                        break;
                    case 4: DesplegarDatosVisitas();
                        break;
                    case 5: ModificarPersonal();
                        break;
                    case 6: EliminarPersonal();
                        break;
                    case 7: System.out.println("Gracias :3 ");
                        break;
                }
            }catch(Exception ex)
            {
                System.out.println("Error: "+ex.getMessage());
            }
            
        } while (op!=7);
        
        
        
    }
    public void DatosPersonal() throws IOException
    {
        Usuario user = new Usuario();
        user.DatosPersonal2();
        
        lista.add(user);
    }
    
    public void DatosVisitantes() throws IOException
    {
        Usuario visitas = new Usuario();
        visitas.DatosVisitantes();
        
        lista.add(visitas);
    }
    
    public void DesplegarDatosPersonal()
    {
        
    }
    
    public void DesplegarDatosVisitas()
    {
        
    }
    
    public void ModificarPersonal() throws IOException
    {
        System.out.println("Ingrese Nombre:");
         String nombre =br.readLine();
         boolean encontrado = false; /*--> ESTA FUNCION ES PARA QUE CORROBORE SI EL DATO INGRESADO EXISTE OH NO*/
         
         for (int i = 0; i < lista.size(); i++) {
             
             if (lista.get(i).nombre.equals(nombre)) {
                 
                 
                 
                 encontrado=true;
             }
        }
         if (encontrado==false) {
                 System.out.println("No encontrado"); /*--> POR SI LO QUE SE BUSQUA NO SE ENCUENTRA.*/
             }
    }
    
    public void EliminarPersonal()
    {
        
    }
    
}

/*public void modificarDatos()
    {
        
        PENSADO SI ES QUE UTILIZAMOS UN ARRAYLIST.
        Este metodo lo pense para poder modificar datos por intermedio del usuario
        
        System.out.println("Ingrese Nombre:");
         String <NOMBRE DE VARIABLE> =br.readLine();
         boolean encontrado = false; --> ESTA FUNCION ES PARA QUE CORROBORE SI EL DATO INGRESADO EXISTE OH NO
         
         for (int i = 0; i < lista.size(); i++) {
             
             if (lista.get(i).NOMBRE DE VARIABLE.equals(NOMBRE DE VARIABLE )) {
                 
                 System.out.println("Ingrese ");
                 lista.get(i).precio=br.readLine();
                 
                 encontrado=true;
             }
        }
         if (encontrado==false) {
                 System.out.println("No encontrado"); --> POR SI LO QUE SE BUSQUA NO SE ENCUENTRA.
             }
    }*/
