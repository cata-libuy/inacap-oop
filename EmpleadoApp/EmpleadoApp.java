import java.io.*;
import java.util.*;

public class EmpleadoApp
{
	boolean continuar = true;
	Scanner sc = new Scanner(System.in);
	Empleado empleado;
	
	public static void main(String args[])
	{
		EmpleadoApp app = new EmpleadoApp();
		while(app.continuar) {
			app.menu();
		}
		System.out.println("Hasta pronto");
		
	}
	
	// menu
	public void menu()
	{
		try {
			System.out.println("\n MENU \n 1. Agregar empleado \n 2. Buscar datos \n 3. Listar datos \n 4. Eliminar \n 5. Salir");
			int opcion = sc.nextInt();
			switch(opcion) {
				case 1 : agregarEmpleado();
					break;
				case 2 : buscarDatos();
					break;
				case 3 : listarDatos();
					break;
				case 4 : eliminarEmpleado();
					break;
				case 5 : continuar = false;
					break;
				default: menu();
			}	
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void agregarEmpleado()
	{
		Empleado nuevoEmpleado = new Empleado();
		nuevoEmpleado.leerDatos();
		nuevoEmpleado.agregarDatos();
	}
	
	public void buscarDatos()
	{
		System.out.println("Ingrese rut para buscar");
		sc.nextLine();		
		try {			
			String rut = sc.nextLine();
			Empleado nuevoEmpleado = new Empleado();
			nuevoEmpleado.buscarDatos(rut);
			nuevoEmpleado.mostrarDatos();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void listarDatos()
	{
		Empleado nuevoEmpleado = new Empleado();
		nuevoEmpleado.listarDatos();
	}
	
	public void eliminarEmpleado()
	{
		boolean seguro = false;
		String respuesta = "";
		System.out.println("Ingrese rut para eliminar");	
		sc.nextLine();		
		try {
			String rut = sc.nextLine();			
			Empleado empleado = new Empleado();
			empleado.buscarDatos(rut);
			System.out.println("Se eliminar\u00e1 el siguiente usuario:");
			empleado.mostrarDatos();
			System.out.println("¿est\u00e1 seguro? S/N");
			respuesta = sc.nextLine();
			seguro = respuesta.toUpperCase().equals("S") ? true : false;
			if (seguro) {
				empleado.eliminarDatos(rut);
				System.out.println("Empleado eliminado");
			} else {
				System.out.println("No eliminado");
			}
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}	
}