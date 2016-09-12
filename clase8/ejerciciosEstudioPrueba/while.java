// Ejemplo: Escribir un programa que imprima los primeros 10 primeros números enteros empezando por
// el cero, empleando la sentencia iterativa while. 
import java.io.*;

public class WhileApp
{
	public static void main(String args[])
	{
		try
		{
			int i = 0;
			while (i <= 10) {
				System.out.println(i);
				i++;
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}