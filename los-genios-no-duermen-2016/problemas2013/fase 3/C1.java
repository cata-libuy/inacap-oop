import java.util.Scanner;

public class C1
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);		
   	
   	// 1.- Leer las dimensiones de la matriz a procesar.
      int numFilas = sc.nextInt();
      int numCols  = sc.nextInt();
   	
      int numCeros = 0;
   	
   	// 2.- Contabilizar la cantidad de ceros en la matriz.
      for(int f=1; f <= numFilas; f++)
         for(int c=1; c <= numCols; c++)
         {
            int dato = sc.nextInt();
         	
            if(dato == 0) numCeros++;
         }
   		
   	// 3.- Imprimir la cantidad de ceros encontrados.
      System.out.println(numCeros);
   }
}