import java.io.*;

public class EjemploExponente
{
	public static void main(String args[])
	{
		int exponente, signo;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escribe un exponente");
		try {
			exponente = Integer.parseInt(teclado.readLine());
			signo = (exponente>0 ? 1 : -1 );
			System.out.println("El signo del resultado es " + signo);
			
		}
		catch(Exception ex) 
		{
			System.out.print(ex.getMessage());
		}	
		
	}
}