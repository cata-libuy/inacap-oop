import java.util.Scanner;

public class C2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		int numMatrices = sc.nextInt();
		
		// 1.- Leer tantas matrices desde el teclado como sea necesario.
		while(numMatrices > 0)
		{		
			// 2.- Leer las dimensiones de la matriz a procesar.
			int numFilas = sc.nextInt();
			int numCols  = sc.nextInt();
			
			int[][] matDatos = new int[numFilas][numCols];		
			
			// 3.- Leer los datos de las matrices, fila a fila, y almacenarlos en la matriz.
			for(int fil=0; fil < numFilas; fil++)
				for(int col=0; col < numCols; col++)
				{
					matDatos[fil][col] = sc.nextInt();
				}
				
			// 4.- Imprimir la matriz transpuesta de la original en pantalla.
			for(int col=0; col < numCols; col++)
			{
            for(int fil=0; fil < numFilas; fil++)
				{
					System.out.print( matDatos[fil][col] + " " );
				}
				System.out.println();
			}
			System.out.println();
			
			numMatrices--;
		}
	}
}