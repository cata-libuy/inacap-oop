import java.util.Scanner;
import java.util.Arrays;

public class D2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		while(true)
		{
			// 1.- Leer el grupo de cartas actual.	
         char carta1 = sc.next().charAt(0);
         if( carta1 == '0' )	System.exit(0);   // 2.- Si la línea leída es "0", terminar el programa.
                  
         char carta2 = sc.next().charAt(0);
         char carta3 = sc.next().charAt(0);
         char carta4 = sc.next().charAt(0);
         char carta5 = sc.next().charAt(0);         

			
			
			// 3.- Colocar las cartas dentro de un arreglo de 5 celdas y ordenar los datos con Arrays.sort()
         int[] arrCartas = new int[5];
         
         arrCartas[0] = getValorCarta(carta1);
         arrCartas[1] = getValorCarta(carta2);
         arrCartas[2] = getValorCarta(carta3);
         arrCartas[3] = getValorCarta(carta4);
         arrCartas[4] = getValorCarta(carta5);
         
         Arrays.sort(arrCartas);
         
         // 4.- Imprimir las cartas ordenadas por consola.
         System.out.print  ( getNumeroCarta(arrCartas[0]) + " " );
         System.out.print  ( getNumeroCarta(arrCartas[1]) + " " );
         System.out.print  ( getNumeroCarta(arrCartas[2]) + " " );
         System.out.print  ( getNumeroCarta(arrCartas[3]) + " " );
         System.out.println( getNumeroCarta(arrCartas[4]) );
      }
   }
         
	
	private static int getValorCarta(char carta)
	{
		switch(carta)
		{
			case 'A': return 1;
			case '1': return 2;
			case '2': return 3;
			case '3': return 4;
			case '4': return 5;
			case '5': return 6;
			case '6': return 7;
			case '7': return 8;
			case '8': return 9;
			case '9': return 10;
			case 'J': return 11;
			case 'Q': return 12;
			case 'K': return 13;	
         default: return 0;	
		}	
	}
   
	private static char getNumeroCarta(int carta)
	{
		switch(carta)
		{
			case 1: return 'A';
			case 2: return '1';
			case 3: return '2';
			case 4: return '3';
			case 5: return '4';
			case 6: return '5';
			case 7: return '6';
			case 8: return '7';
			case 9: return '8';
			case 10: return '9';
			case 11: return 'J';
			case 12: return 'Q';
			case 13: return 'K';		
         default: return ' ';
		}	
	}
}