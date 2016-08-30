// Escribir un programa en Java que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
import java.io.*;
public class DiaSemanaApp
{
	public static void main(String args[])
	{
		int dia = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String diaStr = "";
		try
		{
			System.out.println("Ingresa un día de la semana en número");
			dia = Integer.parseInt(teclado.readLine().trim());
			switch (dia) {
				case 1: diaStr = "Lunes"; break;
				case 2: diaStr = "Martes"; break;
				case 3: diaStr = "Miércoles"; break;
				case 4: diaStr = "Jueves"; break;
				case 5: diaStr = "Viernes"; break;
				case 6: diaStr = "Sábado"; break;
				case 7: diaStr = "Domingo"; break;
			}
			if (diaStr.length() > 0)
				System.out.print(diaStr);
			else
				System.out.print("Ese día de la semana no existe");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}