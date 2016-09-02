// 5. Escribir un programa en Java  para calcular la multiplicación de dos números por intermedio de sumas.
// 
// Ej.:
// 	2*7 = 14
// 	2+2+2+2+2+2+2 = 14

import java.io.*;

public class E5MultiplicacionComoSumaApp
{
	public static void main(String args[])
	{
		int num1, num2, num2AbsoluteValue, i;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String operacion; 
		try
		{
			System.out.println("Ingresa primer numero");
			num1 = Integer.parseInt(teclado.readLine().trim());
			System.out.println("Ingresa segundo numero");
			num2 = Integer.parseInt(teclado.readLine().trim());
			num2AbsoluteValue = (num2 > 0) ? num2 : num2 * -1;
			System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
			for (i = 0; i < num2AbsoluteValue; i++) {
				operacion = (i < num2AbsoluteValue-1) ? "+" : " = ";
				System.out.print(num1 + operacion);
			}
			System.out.print(num1*num2);
			System.out.println("");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
} 