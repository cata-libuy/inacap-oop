import java.io.*;
// Escribir un programa que calcule los números primos comprendidos entre 3 y 100.
// Los números primos tienen la siguiente característica: un número primo es solamente divisible por sí
// mismo y por la unidad, por tanto, un número primo no puede ser par excepto el 2. Para saber si un
// número impar es primo, dividimos dicho número por todos los números impares comprendidos entre 3 y
// la mitad de dicho número. Por ejemplo, para saber si 13 es un número primo basta dividirlo por 3, y 5.
// Para saber si 25 es número primo se divide entre 3, 5, 7, 9, y 11. Si el resto de la división (operación
// módulo %) es cero, el número no es primo. 
public class PrimosApp
{
	public static void main(String a[])
	{
		int i, j;
		try
		{
			for (i = 3; i <= 100; i+=2) {
				boolean esPrimo = true;
				// System.out.println("----Probando " + i + "------");
				// Dividimos por impares entre 3 y la mitad del numero
				for (j = 3; j < i/2; j+=2) {
					// System.out.println(i + "%" + j + " = " + i%j);
					if (i%j == 0) {
						esPrimo = false;
						// System.out.println(i + " no es primo");
						break;
					}
				}
				if (esPrimo)
					System.out.println (i + " es primo");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}