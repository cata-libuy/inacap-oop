// Realizar un programa en Java que convierta una temperatura de grados Fahrenheit a Celsius si la formula de conversión es:
// F = 1.8 * C + 32

import java.io.*;

public class E4FahrenheitACelsiusApp
{
	public static void main(String args[])
	{
		double temperaturaF, temperaturaC;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Ingresa temperatura en grados Fahrenheit");
			temperaturaF = Double.valueOf(teclado.readLine().trim()).doubleValue();
			temperaturaC = (temperaturaF - 32) / 1.8;
			System.out.println("La temperatura en Celsius es: " + temperaturaC );
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
} 