// 2.	Escribir un programa en Java que visualice en pantalla los números múltiplos de 5 comprendidos entre 1 y un número ingresado por teclado
import java.io.*;

public class MultiplosDeCincoApp
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
				if(i%5 == 0)
					System.out.println(i);
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}