import java.io.*;
import java.util.*;
public class PersonaArrayListApp{
	public static void main(String a[]){
		ArrayList<Persona> lista = new ArrayList<Persona>();
		boolean continua=true;
		Scanner sc=new Scanner(System.in);
		int x=0;
		String respuesta="";
		while(continua){
			System.out.print("Ingrese un n° entero");
			x=sc.nextInt();
			lista.add(x);
			System.out.print("Desea Continuar [S/N]: ");
			respuesta=sc.next();
			continua=respuesta.toUpperCase().equals("S");
		}
		for(int numero:lista){
			System.out.println(numero);
		}
	}
}