// 1.- Desarrolle y traduzca a código Java, el algoritmo del siguiente enunciado.  Puntaje =20 puntos.
// Puntaje: 
// 20 puntos, código funcionando y lógica correcta según lo solicitado por el enunciado.
// Enunciado del algoritmo:

// Leer una cantidad de datos de personas, y obtener las estadísticas asociadas a ellos: porcentaje de hombres y mujeres, y promedio de edad de los ingresados.
// Proceso Ejercicio5
// Definir respuesta,sexo Como Caracter;
// Definir  cantidad, porcHombres, promEdad, edad, porcentaje como real;
// promEdad =0;
// cantidad = 0;

       // repetir 
			// Escribir "¿Existen personas para analizar? [S/N]";
			// leer respuesta;
			// Hasta Que respuesta="S" o respuesta = "N";
			
// mientras respuesta="S" hacer
	// cantidad = cantidad + 1;
	// Escribir "Ingrese su edad:";
	// leer edad;
	// promEdad = promEdad +edad;
	
	// repetir	
		// Escribir "Ingresar sexo [M/F]";
		// leer sexo;
		// Hasta Que respuesta="M" o respuesta = "F";
	
		// si sexo = "M" entonces
			// porcHombres = porcHombres + 1;
			// FinSi
			
		// repetir 
			// Escribir "Existen personas para analizar? [S/N]";
			// leer respuesta;
			// Hasta Que respuesta="S" o respuesta = "N";
			// FinMientras
	
// porcentaje = (porcHombres *100)/cantidad;

// Escribir "Total de personas evaluadas:",cantidad;
// Escribir "Edad promedio:", promEdad/cantidad;
// Escribir "Promedio de Hombres:", porcentaje,"%";
// Escribir "Promedio de Mujeres:",100-porcentaje,"%";
       // FinProceso

import java.io.*;

public class Ejercicio5
{
	public static void main(String args[])
	{
		String respuesta, sexo;
		int edad, cantidad;
		double porcHombres, promEdad, porcentaje;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		promEdad = 0.0;
		porcHombres = 0.0;
		cantidad = 0;
		respuesta = "no contestado";
		try
		{
			while( !respuesta.equals("S")) {
				System.out.println("¿Existen personas para analizar? [S/N]");
				respuesta = teclado.readLine();
				if(respuesta.equals("N"))
					break;
			};
			while (respuesta.equals("S")) {
				cantidad++;
				// Pedir edad
				System.out.println("Ingrese su edad: ");
				edad = Integer.parseInt(teclado.readLine());
				promEdad = promEdad + edad;
				// Pedir sexo
				do {
					System.out.println("Ingresar sexo [M/F]");
					sexo = teclado.readLine();
					if(sexo.equals("M"))
						break;
				} while (!sexo.equals( "F"));
				// Actualizar porcentaje
				if (sexo.equals("M"))
					porcHombres++;
				// Confirmar si continuamos encuestando
				System.out.println("¿Existen personas para analizar? [S/N]");
				respuesta = teclado.readLine();
					if(respuesta.equals("N"))
					break;
			};
			// Procesar datos y entregar resultados
			porcentaje = (porcHombres*100) / cantidad;
			System.out.println("Total de personas evaluadas:" + cantidad);
			System.out.println("Edad promedio:" +  promEdad/cantidad);
			System.out.println("Promedio de Hombres:" + porcentaje + "%");
			// System.out.println("Promedio de Mujeres:" + 100.00 - porcentaje + "%");
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}
