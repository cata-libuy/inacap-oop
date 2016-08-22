// Genere una aplicación de Consola en lenguaje Java, que permita ingresar 3 notas en escala 1.0 a 7.0 cada una.
// Luego de Ingresada las notas debe desplegar por pantalla la suma de ellas y su promedio

// Ejemplo:
// Ingrese Nota 1: 4.9
// Ingrese Nota 2: 3.0
// Ingrese Nota 3: 5.0
// Resultados: Suma=>12
			// Promedio=>4.0
			
import java.io.*;

public class PromediaNotas
{
	public static void main(String args[])
	{
		// Declarar variables
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		int suma = 0;
		double promedio = 0.0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));		
		
		try
		{
			// Ingresar datos
			System.out.print("Ingrese Nota 1: ");
			nota1 = Double.valueOf(teclado.readLine().trim()).doubleValue();
			System.out.print("Ingrese Nota 2: ");
			nota2 = Double.valueOf(teclado.readLine().trim()).doubleValue(); 
			System.out.print("Ingrese Nota 3: ");
			nota3 = Double.valueOf(teclado.readLine().trim()).doubleValue(); 
			
			// Procesar
			suma = (int)(nota1 + nota2 + nota3);
			promedio = (nota1 + nota2 + nota3) / 3;
			
			// Entregar resultados
			System.out.println("Resultados: Suma=>" + suma);
			System.out.println("\t Promedio=>" + promedio);
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
} 