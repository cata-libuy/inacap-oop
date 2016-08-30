// Escribir un programa en Java que visualice en pantalla los números pares entre 1 y 25.
import java.io.*;

public class ParesApp
{
	public static void main(String[] args)
	{	
		int num2;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Escribe un número mayor a 0: ");
			num2 = Integer.parseInt(teclado.readLine().trim());
			int i;
			for (i=1; i<= num2; i++)
				if(i%2 == 0)
					System.out.println(i);
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}