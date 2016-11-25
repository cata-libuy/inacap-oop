import java.util.Scanner;

public class A3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int inicio   = sc.nextInt();
		int termino  = sc.nextInt();
		
		int iniTmp   = inicio;
		int finTmp   = termino;
      
      if(iniTmp > finTmp)
      {
         int temp = iniTmp;
         iniTmp = finTmp;
         finTmp = temp;
      }
		
		if(iniTmp % 2 == 1) iniTmp++;
		if(finTmp % 2 == 1) finTmp--;
		
		for(int i=iniTmp; i<=finTmp; i=i+2)
		{
         System.out.print(i);
         
      	if(i<finTmp)
            System.out.print(" ");
      }
		
		System.out.println();		
	}
}