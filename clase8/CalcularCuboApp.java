// Leer un número desde el teclado con método leer número
// Al número obtenido calcularle el cubo y devolverlo
// 3 Entregar el resultado con otro método

import java.io.*;
public class CalcularCuboApp
{
	// Método public para correr programa
	public static void main(String args[])
	{
		CalcularCuboApp algo = new CalcularCuboApp();
		int numero;
		double resultado;
		try
		{
			numero = algo.leerNumero();
			resultado = algo.calcularCubo(numero);
			algo.entregarResultado(numero, resultado);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	// Método para leer
	public int leerNumero()
	{
		int numero;
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingresa un número");
			numero = Integer.parseInt(teclado.readLine().trim());
			return numero;	
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return 1;
		}
	}
	
	// Método para calcular el cubo
	public double calcularCubo(int numero)
	{
		return Math.pow(numero,3);
	}
	
	// Método void para escribir
		public void entregarResultado(int numero, double resultado)
	{
		System.out.println("El cubo de " + numero + " es " + resultado);
	}
}