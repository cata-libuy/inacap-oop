import java.io.*;
public class EjercicioUnoDos
{
	public static void main(String x[])
	{
		if (x.length==0)
			System.out.println("Hola ratón con cola!");
		else
		{
			System.out.print("Hola, ");
			for(int i=0;i<x.length;i++)
				System.out.println(x[i]+" ");
			System.out.println(x.length);
			System.out.println("amigos");
		}
	}
}