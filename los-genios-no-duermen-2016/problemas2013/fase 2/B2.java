import java.util.Scanner;

public class B2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cantidadAGenerar = sc.nextInt();
		
		int fibA = 0, fibB = 1;
		
		while(cantidadAGenerar > 0)
		{
            if(fibA % 2 == 0)
			{
				System.out.print( fibA );
				cantidadAGenerar--;
				
				if(cantidadAGenerar > 0) System.out.print(" ");
			}
				
			int temp = fibB;
			fibB = fibA + fibB;
			fibA = temp;		
		}	
	}
}