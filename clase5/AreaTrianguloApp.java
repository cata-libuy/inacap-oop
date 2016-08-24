// int i = Integer.valueof(entrada.ReadLine()).intValue();
// double d = Double.valueOf(entrada.readLine()).doubleValue();


import java.io.*;
import java.lang.*;

public class  AreaTrianguloApp
{
	public static void main(String args[])
	{
		// Variables
		double a = 0;
		double b = 0;
		double area = 0;
		double perimetro = 0;
		double hipotenusa = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		
		try
		{
			// Pedir datos
			System.out.println("Ingresa cateto 1: ");
			a = Double.valueOf(teclado.readLine()).doubleValue();
			System.out.println("Ingresa cateto 2: ");
			b = Double.valueOf(teclado.readLine()).doubleValue();
					
			// Procesar
			area = a * b / 2;
			hipotenusa = Math.sqrt(a*a + b*b);
			perimetro = a + b + hipotenusa;			
			
			// Devolver
			System.out.println("Para un tri\u00e1ngulo rect\u00e1ngulo con lados a = " + a + "; b = " + b + "; c = " + hipotenusa);
			System.out.println("El \u00e1rea es " + area + "\n y el per\u00edmetro es " + perimetro + ".");
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		
	}
}