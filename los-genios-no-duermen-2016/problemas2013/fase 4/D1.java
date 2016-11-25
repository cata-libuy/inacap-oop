import java.util.Scanner;

public class D1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		int numGruposASumar   = sc.nextInt();
				
		while(numGruposASumar > 0)
		{
         numGruposASumar--;
      
			// 1.- Leer la cantidad de matrices a sumar entre sí en este grupo.
			int numMatricesASumar = sc.nextInt();			
		
			// 2.- Leer las dimensiones de la matriz a procesar.
			int numFilas = sc.nextInt();
			int numCols  = sc.nextInt();
         
			int[][] matTotal = new int[numFilas][numCols];
		
			while(numMatricesASumar > 0)
			{						
            numMatricesASumar--;
            
				int[][] matDatos = new int[numFilas][numCols];		
				
				// 3.- Guardar los datos leídos desde el teclado en la matriz matDatos.
				for(int fil=0; fil < numFilas; fil++)
					for(int col=0; col < numCols; col++)
					{
						matDatos[fil][col] = sc.nextInt();
					}
					
				// 4.- Sumar los datos de la matriz de datos a la matriz total.
				for(int fil=0; fil < numFilas; fil++)
					for(int col=0; col < numCols; col++)
					{
						matTotal[fil][col] = matTotal[fil][col] + matDatos[fil][col];
					}
			}
			
			// 5.- Imprimir la matriz total en pantalla.
			for(int fil=0; fil < numFilas; fil++)
			{
				for(int col=0; col < numCols; col++)
				{
					System.out.print(matTotal[fil][col] + " ");
				}

				System.out.println();
			}

			System.out.println();			
		}
	}
}