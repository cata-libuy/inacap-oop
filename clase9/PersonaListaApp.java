import java.io.*;
public class PersonaListaApp
{
	public static void main(String a[])
	{
		try
		{
			// Llamo a constructor vacío de persona
			Persona p1 = new Persona();
			// Llamo a constructor de persona con parámetros
			Persona p2 = new Persona("1-9", "Juan", "Pérez", 'M');
			Persona p3 = new Persona();
			p1.desplegarDatos();
			p2.desplegarDatos();
			p3.leerDatos();
			p3.desplegarDatos();
		} catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
}