import java.util.Scanner;

public class A4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String palabra = sc.nextLine();
		
		int posInicio = 0, posFinal = palabra.length()-1;

		while(posInicio < posFinal)
		{
			if(palabra.charAt(posInicio) != palabra.charAt(posFinal) )
			{
				System.out.println("NO ES PALINDROMO");
				System.exit(1);
			}
			
			posInicio++; posFinal--;
		}
		
		System.out.println("ES PALINDROMO");
	}
}