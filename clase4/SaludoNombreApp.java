import java.io.*;

public class SaludoNombreApp
{
	public static void main(String args[])
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String nombre = "";
		try
		{
			System.out.print("Ingrese su nombre ");
			nombre = teclado.readLine();
			System.out.println( "Hola, " + nombre);
		}
		catch (Exception ex)
		{
			System.out.println("Error:" + ex.getMessage());			
		}
	}
}