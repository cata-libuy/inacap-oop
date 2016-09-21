// Enunciado: Debe desarrollar el código en lenguaje Java la aplicación CursoApp que debe permitir ingresar las 5 notas por cada alumno en escala 1.0 a 7.0 correspondientes a las evaluaciones durante el semestre. El curso está conformado por 20 alumnos.
// La aplicación CursoApp debe: 
// Implementar la Clase CursoApp con un  menú con las siguientes opciones:
// 1.- Ingresar Nota Alumnos
// 2.- Buscar de Alumnos ingresando su Numero de Lista.
// 3.- Desplegar Notas de Alumnos y Promedio
// Salir
// La clase CursoApp debe tener los siguientes métodos
//           
// 	int menu() 
// 	void llenarArreglosAlumnos()
// void buscarDatosAlumnos(int numeroLista)
// 	void desplegarDatosAlumnos() 

import java.io.*;

public class CursoApp
{		
		public double[][] notas = new double[20][5];
		static int numeroLista;
		static CursoApp programa = new CursoApp(); 
		
		public static void main(String args[])
		{
			boolean continuar = true;
			while(continuar) {
				int opcionMenu;
				opcionMenu = programa.menu();
				switch(opcionMenu){
					case 1: programa.llenarArreglosAlumnos();
						break;
					case 2: 
						numeroLista = programa.pedirInt("Ingrese número de lista a buscar");
						programa.buscarDatosAlumnos(numeroLista);
						break;
					case 3: programa.desplegarDatosAlumnos();
						break;
					case 4:
						continuar = false;
						break;
					default:
						System.out.println("Ingrese una opción válida");
				}
			}
			System.out.println("Hasta pronto.");
		}
		
		
		int menu() //despliega menu
		{
			System.out.println("\nMENU DEL PROGRAMA:\n 1 --> Ingresar Nota Alumnos\n 2 --> Buscar de Alumnos ingresando su Numero de Lista.\n 3 --> Desplegar Notas de Alumnos y Promedio\n 4 --> Salir");
			return programa.pedirInt("Por favor ingrese una opción: ");
		}
		
		void llenarArreglosAlumnos() //pide e ingresa datos de un alumno
		{
			do {
				numeroLista = programa.pedirInt("Ingrese numero de lista entre 1 y 20");
			} while (numeroLista < 1 || numeroLista > 20);
			double notasAlumno[] = {0.0, 0.0, 0.0, 0.0, 0.0};
			double nota;
			for(int i = 0; i < notasAlumno.length; i++) {
				do {
						nota = programa.pedirDouble("Ingrese nota " + (i+1));
						if(nota < 0.0 || nota > 7.0)
							System.out.println("Ingrese nota válida entre 0.0 y 7.0");
						else 
							notas[numeroLista-1][i] = nota;
				} while (nota < 0.0 || nota > 7.0);
			}
			System.out.println("Notas guardadas");
		}
		
		void buscarDatosAlumnos(int numeroLista) // recibe un id de alumno y despliega sus datos
		{
			double sumaNotas = 0.0;
			for(int i = 0; i < notas.length; i++) {
				if(numeroLista-1 == i) {
					System.out.println("Notas alumno " + numeroLista);
					for (int j = 0; j < 5; j++) {
						System.out.println("Nota " + j + ": " + notas[numeroLista-1][j]);
						sumaNotas = sumaNotas + notas[numeroLista-1][j];
					}
					System.out.println("Promedio: " + (sumaNotas / 5));
				}
			}
		}
		
		void desplegarDatosAlumnos()
		{
			for(int i = 0; i < notas.length; i++) {
				programa.buscarDatosAlumnos(i+1);
				System.out.println("-------------");
			}
		}
		
		// Auxiliares
		int pedirInt(String mensaje) //Recibe un mensaje para desplegar y devuelve un entero ingresado por usuario
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
		double pedirDouble(String mensaje) //Recibe un mensaje para desplegar y devuelve un double ingresado por usuario
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
}

