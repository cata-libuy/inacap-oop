import java.io.*;

public class MesATexto2
{
	public static void main(String args[])
	{
		int mes = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String mesStr = ""; 
		try
		{
			System.out.println("Ingresa un mes en número");
			mes = Integer.parseInt(teclado.readLine().trim());
			// System.out.println("Mes ingresado: " + mes);
			switch (mes) {
				case 1: mesStr = "Enero"; break;
				case 2: mesStr = "Febrero"; break;
				case 3: mesStr = "Marzo"; break;
				case 4: mesStr = "Abril"; break;
				case 5: mesStr = "Mayo"; break;
				case 6: mesStr = "Junio"; break;
				case 7: mesStr = "Julio"; break;
				case 8: mesStr = "Agosto"; break;
				case 9: mesStr = "Septiembre"; break;
				case 10: mesStr = "Octubre"; break;
				case 11: mesStr = "Noviembre"; break;
				case 12: mesStr = "Diciembre"; break;
			}
			if (mesStr.length() > 0)
				System.out.print(mesStr);
			else
				System.out.print("Ese mes no existe");
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}