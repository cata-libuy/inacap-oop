import java.io.*;
public class EjercicioUnoTres
{
	public static void main(String x[])
	{
		if (x.length==0)
			System.out.println("Error: Debe ingresar al menos un dato");
		else
		{
			int a=0;
			int suma=0;
			for (int i=0;i<x.length;i++)
				{
					a=Integer.parseInt(x[i]);
					suma=suma+a;
				}
			System.out.print("La suma total de los valores ingresados es: "+suma);
		}
	}
}