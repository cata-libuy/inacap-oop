public class A1
{
	public static void main(String[] args)
	{
		String frase = "BIENVENIDO AL CONCURSO DE PROGRAMACION 2013";
	
		for(int pos=0; pos < frase.length(); pos++)
		{
			for(int cantEspacios = 1; cantEspacios <= pos; cantEspacios++)
				System.out.print(" ");
				
			System.out.print( frase.charAt(pos) );
			
			if(pos < frase.length() - 1)
				System.out.println();
		}
	}
}