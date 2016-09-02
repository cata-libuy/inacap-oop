// 8. Cree un programa en Java que represente una estrategia para dar solución a siguiente problema:
// 
// Una empresa ha decidido bonificar a sus empleados entregando un bono según las cargas familiares que tenga.
// 
// Esta bonificación se calculará con respecto al sueldo del empleado y de acuerdo a la siguiente tabla:
// 
// Nº de Cargas
// % de bonificación
// 0 -> 0
// 1 -> 3
// 2 -> 5
// 3 -> 9
// 4 y más ->12
// 
// Se desea que el algoritmo muestre como salida:
// Sueldo inicial.
// Monto de bonificación.
// Sueldo final.

import java.io.*;

public class E8BonificacionApp
{
	public static void main(String args[])
	{
		double bonoPorcentaje, bonoMonto, sueldoFinal;
		int sueldoInicial, cargas;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
		try
		{
			// Ingreso de datos
			System.out.println("Ingrese sueldo inicial del trabajador");
			sueldoInicial = Integer.parseInt(teclado.readLine().trim());
			System.out.println("Ingrese número de cargas");
			cargas = Integer.parseInt(teclado.readLine().trim());
			
			// Determinación de porcentaje de bonificación que corresponde
			switch(cargas){
				case 0:
					bonoPorcentaje = 0.0;
					break;
				case 1:
					bonoPorcentaje = 0.03;
					break;
				case 2:
					bonoPorcentaje = 0.05;
					break;
				case 3:
					bonoPorcentaje = 0.09;
					break;
				default:
					bonoPorcentaje = 0.12;
					break;
			}
			
			// Asignación de bono
			sueldoFinal = sueldoInicial + sueldoInicial * bonoPorcentaje;
			
			// Entrega de resultados
			System.out.println("Sueldo inicial. $ " + sueldoInicial );
			System.out.println("Monto de bonificación. $ " + (sueldoFinal - sueldoInicial) );
			System.out.println("Sueldo final. $ " + sueldoFinal );
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
} 