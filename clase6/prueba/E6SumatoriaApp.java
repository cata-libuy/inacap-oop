// 6. Crear un programa en Java  que calcule el palor aproximado de e (2.7183...), 
// este valor se puede calcular aproximadamente con la siguiente sumatoria:
// sumatoria de (a sub n = 1 / n!) desde n = 0 hasta n 

import java.io.*;

public class E6SumatoriaApp
{
	public static void main(String args[])
	{
		int n, i, j;
		double e, divisor;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
		try
		{
			System.out.println("Ingresa un valor para n");
			n = Integer.parseInt(teclado.readLine().trim());
			e = 0;
			for (i = 0; i <= n; i++) {
				// divisor
				divisor = 1; //para n sub cero
				if (i > 0) {
					// System.out.println("factorial de " + i);
				 for (j = i; j >= 1; j--) {
					 // System.out.println( divisor + " = " + divisor + "*" + j);
					 divisor = divisor * j;
				 }
				 // System.out.println("Salí de loop con factorial = " + divisor);
				}
				// e
				e = e + (1 / divisor);
			}
			System.out.println("Para n = " + n + ", e = " + e);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
} 