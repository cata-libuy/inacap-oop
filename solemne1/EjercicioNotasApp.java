// Desarrolle el código Java de una aplicación, que permita ingresar las 3 notas en escala de 1.0 a 7.0 de 20 alumnos,
// Usando métodos se solicita desarrollar método de ingreso de datos,  método de despliegue
// todos los de datos (Notas y promedio) y método de búsqueda y despliegue de notas
// y promedio previo ingreso de el número de lista de curso del alumno.
// Para para que funcione lo anterior deben generar un método menú con las opciones 
// 1.- Ingresar Notas Alumnos
// 2.- Buscar y desplegar Notas Alumnos por su numero de lista
// 3.- Desplegar todas las Notas 
// 4.- Salir
// */

import java.io.*;
public class EjercicioNotasApp
{

	// - Main - //
	public static void main(String args[])
	{
		EjercicioNotasApp programa = new EjercicioNotasApp();
		// - Atributos - //
		boolean continuarPrograma = true;
		int opcionMenu, numLista;
		double notas[][], nota1, nota2, nota3;
		notas = new double[20][3];
		
		try
		{
			while(continuarPrograma) {
				// Despliega Menu
				opcionMenu = programa.despliegaMenu();
				switch(opcionMenu) {
					case 1: //programa.ingresarNotasAlumno();
						// No supe cómo acceder a la matriz de notas desde un método :(
						numLista = -1;
						while (numLista < 0 || numLista > 19) {
							numLista = programa.pideInt("Ingrese número de lista entre 0 y 19");
						}
						nota1 = programa.pideDouble("Ingrese la primera nota para el alumno " + numLista);
						nota2 = programa.pideDouble("Ingrese la segunda nota para el alumno " + numLista);
						nota3 = programa.pideDouble("Ingrese la tercera nota para el alumno " + numLista);
						notas[numLista][0] = nota1;
						notas[numLista][1] = nota2;
						notas[numLista][2] = nota3;
						System.out.println("Notas guardadas");
						break;
					case 2: // programa.buscarNotasAlumno();
						numLista = programa.pideInt("Ingrese numero de lista del alumno");
						nota1 = notas[numLista][0];
						nota2 = notas[numLista][1];
						nota3 = notas[numLista][2];
						programa.desplegarNotasAlumno(numLista, nota1, nota2, nota3);
						break;
					case 3: // programa.desplegarTodasLasNotas();
						for (int i = 0; i < notas.length; i++) {
							nota1 = notas[i][0];
							nota2 = notas[i][1];
							nota3 = notas[i][2];
							programa.desplegarNotasAlumno(i, nota1, nota2, nota3);
						}
						break;
					case 4:
						continuarPrograma = false;
						break;
					default:
						opcionMenu = programa.despliegaMenu();
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	// - Metodos - //
	
	// Pide int: recibe un mensaje para entregar al usuario y devuelve lo ingresado por usuario como integer
	public int pideInt(String mensaje)
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println(mensaje);
			return Integer.parseInt(teclado.readLine().trim());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return -1;
		}
	}
	
	// Pide double: recibe un mensaje para entregar al usuario y devuelve lo ingresado por usuario como double
	public double pideDouble(String mensaje)
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println(mensaje);
			return Double.valueOf(teclado.readLine().trim()).doubleValue();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return -1.0;
		}
	}
	
	// Guardar notas alumno: pide un numero de lista y notas al usuario y las guarda en la posición correspondiente en el arreglo de notas
	public void ingresarNotasAlumno()
	{
		System.out.println("ingresarNotasAlumno no implementado");
	}
	
	// Desplegar datos alumno: pide un numero de lista y muestra las notas de un alumno por pantalla
	public void desplegarNotasAlumno(int numLista, double nota1, double nota2, double nota3)
	{
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Alumno " + numLista + " | " + "nota 1: " + nota1 + ", nota2: " + nota2 + ", nota 3: " + nota3 + " | Promedio: " + ( nota1 + nota2 + nota3 )/3 );
	}
	
	// Desplegar todas las notas: muestra todas las notas de todos los alumnos por pantalla
	public void desplegarTodasLasNotas()
	{
		System.out.println("desplegarTodasLasNotas no implementado");
	}
	
	// Despliega menu: Muestra opciones de menu al usuario y devuelve opcion elegida
	public int despliegaMenu()
	{
		System.out.println("\nMENU DEL PROGRAMA:\n 1 --> Ingresar notas alumno\n 2 --> Buscar notas de un alumno\n 3 --> Desplegar todas las notas\n 4 --> Salir");
		return pideInt("Por favor ingrese una opción numerica");
	}
	
}