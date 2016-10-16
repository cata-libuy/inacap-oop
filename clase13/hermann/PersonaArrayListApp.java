import java.io.*;
import java.util.*;
public class PersonaArrayListApp{
	public static void main(String a[]){
		ArrayList<Persona> lista = new ArrayList<Persona>();
		boolean continua=true;
		Scanner sc=new Scanner(System.in);
		Persona p;
		String respuesta="";
		while(continua){
			System.out.print("Ingrese Datos Persona");
			p=new Persona();
			p.leerDatos();
			lista.add(p);
			System.out.print("Desea Continuar [S/N]: ");
			respuesta=sc.next();
			continua=respuesta.toUpperCase().equals("S");
		}
		for(Persona pOtro:lista){
			pOtro.desplegarDatos();
		}
	}
}