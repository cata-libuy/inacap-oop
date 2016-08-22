// Ingresar por teclado dos valores enteros: valor1, valor2 y luego mostrar por pantalla la suma de los valores ingresados;
// Ejemplo:
// Ingrese Valor 1: 4
// Ingrese Valor 2: 5
// Resultado: 4 + 5 = 9

import java.io.*;

public class SumaEnteros
{
	public static void main(String args[])
	{
		// Variables
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String valor1 = "";
		String valor2 = "";
		Integer resultado = 0;
		
		try
		{
			// Pedir Datos
			System.out.print("Ingrese Valor 1: ");
			valor1 = teclado.readLine();
			System.out.print("Ingrese Valor 2: ");
			valor2 = teclado.readLine();
					
			// Devolver resultado
			resultado = Integer.parseInt(valor1) + Integer.parseInt(valor2);
			System.out.print("Resultado: " + valor1 + " + " + valor2 + " = " + resultado );			
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}