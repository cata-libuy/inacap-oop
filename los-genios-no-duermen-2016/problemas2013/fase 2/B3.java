import java.util.Scanner;

public class B3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		// 1.- Ingreso de la palabra a buscar
		String palabraABuscar = sc.nextLine();		
		
		// 2.- Búsqueda de la palabra dentro de cada frase leída.
		while(true)
		{
			String frase = sc.nextLine();
         frase = frase.trim();
         
			if(frase.equals("FIN")) System.exit(0);
		
			if(frase.indexOf(" " + palabraABuscar) == frase.length() - palabraABuscar.length() - 1)
            System.out.println(frase);
            
         if(frase.indexOf(palabraABuscar + " ") == 0)
            System.out.println(frase);
            
         if(frase.indexOf(" " + palabraABuscar + " ") >0 )
				System.out.println(frase);
		}		
	}
}