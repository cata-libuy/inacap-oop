import java.util.Scanner;

public class B1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numColumnas = sc.nextInt();
		
		// 1.- Imprimir el lado superior del cuadrado.
		for(int f=1; f <= numColumnas; f++) System.out.print("*");
		System.out.println();
		
		// 2.- Imprimir sólo los lados del cuadrado, dejando el interior vacío.
		for(int f=2; f < numColumnas; f++)
		{
			for(int c=1; c <= numColumnas; c++)
			{
				if(c==1 | c==numColumnas)
					System.out.print("*");
				else
					System.out.print(" ");			
			}
         
         System.out.println();
		}
		
		// 3.- Imprimir el lado inferior del cuadrado.
		for(int f=1; f <= numColumnas; f++) System.out.print("*");
		System.out.println();
	}
}