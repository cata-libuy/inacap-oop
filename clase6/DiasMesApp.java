import java.io.*;

public class DiasMesApp
{
	public static void main(String[] args)
	{
		int mes, agno;
		int numDias = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			System.out.println("Ingrese un mes: ");
			mes = Integer.parseInt(teclado.readLine().trim());
			System.out.println("Ingrese un año: ");
			agno = Integer.parseInt(teclado.readLine().trim());
			// Calculo número de días
			switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 12:
					numDias = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					numDias = 30;
					break;
				case 2:
					if((agno%4 == 0) && !(agno%100 == 0) || (agno%400 == 0))
						numDias = 29;
					else
						numDias = 28;
					break;
				default:
					System.out.println("Este mes no existe");
					break;				
			};
			if (numDias > 0)
				System.out.println("El mes tiene " + numDias + " dias");
		}
		
		catch( Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}