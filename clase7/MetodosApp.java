import java.io.*;
public class MetodosApp
{
	public int arreglo[] = new int[10]; // atributo de la clase arreglo global.
	
	public static void main(String[] args)
	{
		MetodosApp objeto = new MetodosApp();
		try {
			objeto.llenarArreglo();
			objeto.desplegarDatosArreglo();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void llenarArreglo()
	{
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		int i = 0, valor = 0;
		try
		{
			for (i = 0; i< arreglo.length; i++) {
				System.out.println("Ingrese Valor " + (i + 1) + ": ");
				valor = Integer.parseInt(teclado.readLine());
				arreglo[i] = valor;
			}
		} catch (Exception ex) {}
	}
	
	public void desplegarDatosArreglo() {
		System.out.println("Valor " + (i + 1) + ": " + arreglo[i]);
	}
}