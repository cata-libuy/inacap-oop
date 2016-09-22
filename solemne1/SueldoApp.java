// Enunciado: Se necesita leer desde el teclado  un conjunto de datos (sueldo Base, Numero de horas extras trabajadas, Numero de Cargas Familiares, Monto total Descuentos  de un grupo de 40 Trabajadores. 
// Se debe considerar que el sueldo a pagar = Sueldo Base+(horas extras trabajadas x 10.000) + (Numero de Cargas Familiares *8000) - Monto total Descuentos  
// Realizar un algoritmo para calcular la Sueldo Medio y la calificación más baja de todo el grupo, 
// debe usar métodos: para la Lectura de datos desde el Teclado, Ingreso de datos de los 40 trabajadores,
// y para calcular el sueldo medio y el sueldo  más bajo y para desplegar los resultado solicitados.  
// Los métodos antes mencionados debe ser invocados desde un objeto dentro del main en la secuencia establecida al inicio del enunciado.
import java.io.*;

public class SueldoApp
{
	// Declarar variables
	int sueldoBase, horasExtraTrabajadas, cargasFamiliares, montoTotalDesc, menorSueldo, index, sumaProd;
	static double sueldoPromedio, sueldoMenor;
	int numeroTrabajadores = 2; // recordar cambiar a 40!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	int sueldos[] = new int[numeroTrabajadores];
	static SueldoApp sueldoApp = new SueldoApp();
	
	public static void main(String args[])
	{	
		
		try
		{		
				sueldoApp.ingresarDatosTrabajadores();
				sueldoPromedio = sueldoApp.calcularPromedio();
				sueldoMenor = sueldoApp.calcularMenor();
				sueldoApp.entregarResultado(sueldoPromedio, sueldoMenor);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	// Sub procesos
	
	// Ingresar datos
	void ingresarDatosTrabajadores()
	{
		for(index = 0; index < sueldos.length; index++) {
			// Pedir Datos
			System.out.println("Trabajador " + (index + 1));
			sueldoBase = sueldoApp.pedirNumero("Ingrese sueldo base: ");
			horasExtraTrabajadas = sueldoApp.pedirNumero("Ingrese horas extra trabajadas: ");
			cargasFamiliares = sueldoApp.pedirNumero("Ingrese cantidad de cargas familiares: ");
			montoTotalDesc = sueldoApp.pedirNumero("Ingrese monto total de descuentos: ");

			// Calcular sueldo y guardar
			int sueldoFinal = sueldoApp.calcularSueldo(sueldoBase, horasExtraTrabajadas, cargasFamiliares, montoTotalDesc);
			sueldos[index] = sueldoFinal;
		}
	}
	
	// Calcular Promedio
	double calcularPromedio() 
	{
			int sumaSueldos = 0;
			for (int i = 0; i < sueldos.length; i++)
				sumaSueldos = sumaSueldos + sueldos[i];
			return sumaSueldos/sueldos.length;
	}
	
	// Calcular menor
	double calcularMenor()
	{
		double menor = sueldos[0];
		for (int i = 0; i < sueldos.length; i++) {
			if (menor > sueldos[i])
				menor = sueldos[i];
		}
		return menor;
	}

	//  Entregar resultados
	void entregarResultado(double sueldoPromedio, double sueldoMenor)
	{
		System.out.println("El sueldo promedio es " + sueldoPromedio + " y el menor " + sueldoMenor);
	}
	
	// Pedir un Numero
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
