// Enunciado: Se necesita leer desde el teclado  un conjunto de datos (sueldo Base, Numero de horas extras trabajadas, Numero de Cargas Familiares, Monto total Descuentos  de un grupo de 40 Trabajadores. 
// Se debe considerar que el sueldo a pagar = Sueldo Base+(horas extras trabajadas x 10.000) + (Numero de Cargas Familiares *8000) - Monto total Descuentos  
// Realizar un algoritmo para calcular la Sueldo Medio y la calificación más baja de todo el grupo, 
// debe usar métodos: para la Lectura de datos desde el Teclado, Ingreso de datos de los 40 trabajadores,
// y para calcular el sueldo medio y el sueldo  más bajo y para desplegar los resultado solicitados.  
// Los métodos antes mencionados debe ser invocados desde un objeto dentro del main en la secuencia establecida al inicio del enunciado.
import java.io.*;

public class SueldoApp
{
	public static void main(String args[])
	{	
		// Declarar variables
		int sueldoBase, horasExtraTrabajadas, cargasFamiliares, montoTotalDesc, menorSueldo, index, sumaProd;
		double sueldoMedio;
		int sueldos[];
		sueldos = new int[40]; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!para probar, recordar cambiar a 40!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		try
		{		
				SueldoApp programa = new SueldoApp();
				// Repetir proceso para cada trabajador
				for (index = 0; index < sueldos.length; index++) {
					// Pedir Datos
					sueldoBase = programa.pedirNumero("Ingrese sueldo base: ");
					horasExtraTrabajadas = programa.pedirNumero("Ingrese horas extra trabajadas: ");
					cargasFamiliares = programa.pedirNumero("Ingrese cantidad de cargas familiares: ");
					montoTotalDesc = programa.pedirNumero("Ingrese monto total de descuentos: ");
		
					// Calcular sueldo y guardar
					sueldoBase = programa.calcularSueldo(sueldoBase, horasExtraTrabajadas, cargasFamiliares, montoTotalDesc);
					sueldos[index] = sueldoBase;
				}
				
				// Calcular promedio
				sumaProd = 0;
				for(index = 0; index < sueldos.length; index++) {
					sumaProd = sumaProd + sueldos[index];
				}
				
				System.out.println("El promedio es " + sumaProd / 40);
				
				// Calular Menor
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	// Sub procesos
	
	// -- Pedir un Numero
	static int pedirNumero(String mensaje)
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int numero;
		try 
		{
			System.out.println(mensaje);
			numero = Integer.parseInt(teclado.readLine().trim());
			return numero;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return -1;
		}
	}
	
		// -- Calcular sueldo
	static int calcularSueldo(int sueldoBase, int horasExtraTrabajadas, int cargasFamiliares, int montoTotalDesc)
	{
		int sueldo = 0;
		try 
		{
			// Sueldo Base+(horas extras trabajadas x 10.000) + (Numero de Cargas Familiares *8000) - Monto total Descuentos
			sueldo = sueldoBase + (horasExtraTrabajadas * 10000 + cargasFamiliares * 8000) - montoTotalDesc;
			return sueldo;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return -1;
		}
	}
}
