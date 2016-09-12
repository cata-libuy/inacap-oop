
import java.io.*;

public class WhileApp
{
	public static void main(String args[])
	{
		try
		{
			// Ejemplo: Escribir un programa que imprima los primeros 10 primeros números enteros empezando por
			// el cero, empleando la sentencia iterativa while.
			
			// System.out.print("Primeros 10 números enteros");
			// int i = 0;
			// while (i <= 10) {
			// 	System.out.println(i);
			// 	i++;
			// }
			
// 			Ejemplo: escribir un programa que calcule el factorial de un número empleando la sentencia iterativa
// while
			System.out.println("Calculo factorial con while");
			int i, num, factorial;
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero para calcular su factorial");
			num = Integer.parseInt(teclado.readLine());
			while (num < 0) {
				System.out.println("Por favor ingrese un entero positivo");
				num = Integer.parseInt(teclado.readLine());
			}
			i = 1;
			factorial = 1;
			while(i <= num) {
				factorial = factorial * i;
				i++;
				System.out.println(factorial);
			}
			System.out.println("El factorial de " + num + " es " + factorial);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}