import java.io.*;

public class MesATexto
{
	public static void main(String args[])
	{
		int mes = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Ingresa un mes en número");
			mes = Integer.parseInt(teclado.readLine().trim());
			// System.out.println("Mes ingresado: " + mes);
			switch (mes) {
				case 1: System.out.print("Enero"); break;
				case 2: System.out.print("Febrero"); break;
				case 3: System.out.print("Marzo"); break;
				case 4: System.out.print("Abril"); break;
				case 5: System.out.print("Mayo"); break;
				case 6: System.out.print("Junio"); break;
				case 7: System.out.print("Julio"); break;
				case 8: System.out.print("Agosto"); break;
				case 9: System.out.print("Septiembre"); break;
				case 10: System.out.print("Octubre"); break;
				case 11: System.out.print("Noviembre"); break;
				case 12: System.out.print("Diciembre"); break;
				default: System.out.print("Ese mes no existe");
			}
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}