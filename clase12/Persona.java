import java.io.*;

// clase componente
public class Persona
{
	// Atributos
	public String rut;
	public String nombre;
	public String apellidos;
	public char sexo;
	
	// Método constructor vacío
	public Persona()
	{
		// this es la clase:
		this.rut = "";
		this.nombre = "";
		this.apellidos = "";
		this.sexo = ' ';
	}
	
	// Método constructor con parámetros
	public Persona(String rut, String nombre, String apellidos, char sexo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}
	
	public void leerDatos()
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese Rut:");
			this.rut = teclado.readLine();
			System.out.println("Ingrese Nombre:");
			this.nombre = teclado.readLine();
			System.out.println("Ingrese Apellidos:");
			this.apellidos = teclado.readLine();
			System.out.println("Ingrese sexo F o M");
			this.sexo = (char)teclado.read();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void desplegarDatos()
	{
		System.out.println("Rut: " + this.rut);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
	}
}