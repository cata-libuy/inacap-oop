import java.io.*;
public class Planta{
	private int idPlanta;
	private String nombre;
	private String origen;
	private int precio;
	
	public Planta (){
		this.idPlanta=0;
		this.nombre="";
		this.origen="";
		this.precio=0;
	}
	public Planta (int idPlanta, String nombre, String origen, int precio){
		this.idPlanta=idPlanta;
		this.nombre=nombre;
		this.origen=nombre;
		this.precio=precio;
	}
	public String getDatos(){
		String respuesta="";
		try{
			respuesta="Id Planta: "+this.idPlanta+", Nombre: "+this.nombre+", Origen: "+this.origen+", Precio: $"+this.precio;
		}catch(Exception ex){
			System.out.println("Error: "+ex.getMessage());
		}
		return respuesta;
	}
}