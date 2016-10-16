import java.io.*;
public class Vivero{
	private int numeroPlantas;
	private Planta plantas[];
	
	public Vivero (int numeroPlantas){
		this.numeroPlantas=numeroPlantas;
		this.plantas=new Planta[numeroPlantas];
	}
	
	public boolean setPlanta(Planta objeto, int num){
		boolean respuesta;
		if(num<numeroPlantas){
			plantas[(num-1)]=objeto;
			respuesta=true;
		}else
			respuesta=false;
		return respuesta;
	}
}