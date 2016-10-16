import java.io.*;
public class Arbol extends Planta{
	private double altura;
	private int edad;
	
	public Arbol (int idPlanta, String nombre, String origen, int precio){
		super(int idPlanta, String nombre, String origen, int precio);
	}
	public setEdad (int edad){
		this.edad=edad;
	}
	public setAltura (int altura){
		this.altura=altura;
	}
	public String getDatos(){
		String respuesta
		try{
			respuesta=super.getDatos();
			respuesta=respuesta+", Edad : "this.edad+", Altura: "+this.altura;
		}catch(Exception ex){
			System.out.println("Error: "+ex.getMessage());
		}
		return respuesta;
	}
}