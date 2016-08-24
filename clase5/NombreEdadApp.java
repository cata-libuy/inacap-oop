import java.io.*;

public class NombreEdadApp
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Mi nombre es: Catalina Sof\u00eda Orellana Libuy y mi edad es:36.");
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}