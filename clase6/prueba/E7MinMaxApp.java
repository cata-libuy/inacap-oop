// 7. Cree un programa que permita ingresar 10 números enteros, luego muestre el mayor y menor número ingresado.


import java.io.*;

public class E7MinMaxApp
{
	public static void main(String args[])
	{
		int n, i, min, max;
		int listaNumeros[];
		listaNumeros = new int[10];
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
		try
		{
			// Llenar arreglo
			System.out.println("A continuación deberá ingresar 10 números...");
			for (i = 0; i < listaNumeros.length; i++) {
				System.out.println("Ingresa un número: ");
				listaNumeros[i] = Integer.parseInt(teclado.readLine().trim());
			}
			
			// Evaluar min
			// tomo arbitrariamente el primer número como el menor y lo evalúo con el que le sigue, quedándome con el menor en cada caso
			min = listaNumeros[0];
			for (i = 0; i < listaNumeros.length; i++) {
				if (min > listaNumeros[i])
					min = listaNumeros[i];
			}
			// Evaluar max
			max = listaNumeros[0];
			for (i = 0; i < listaNumeros.length; i++) {
				if (max < listaNumeros[i])
					max = listaNumeros[i];
			}
			// Entregar resultado
			System.out.println("El número mayor es " + max + " y el menor es " + min);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
} 