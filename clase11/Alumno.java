import java.io.*;

public class Alumno
{
	public String rut;
	public String nombre;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public char sexo;
	public String carrera;
	public String edad;
	public float nota1, nota2, nota3;

	public Alumno()
	{
		//this es la clase:
		this.rut="";
		this.nombre="";
		this.apellidoPaterno="";
		this.apellidoMaterno="";
		this.sexo=' ';
		this.carrera="";
		this.edad="";
		this.nota1=0;
		this.nota2=0;
		this.nota3=0;
	}
	//metodo Constructor con parametros
	public Alumno(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, String carrera, String edad, float nota1, float nota2, float nota3)
	{
		this.rut=rut;
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.sexo=sexo;
		this.carrera=carrera;
		this.edad=edad;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}

	public void leerDatos()
	{
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Ingrese rut:");
			rut=teclado.readLine();
			System.out.println("Ingrese nombre:");
			nombre=teclado.readLine();
			System.out.println("Ingrese apellido Paterno:");
			apellidoPaterno=teclado.readLine();
			System.out.println("Ingrese apellido Materno:");
			apellidoMaterno=teclado.readLine();
			System.out.println("Ingrese sexo[F o M]:");
			sexo = (char)teclado.read();
			System.out.println("Ingrese carrera: \n");
			carrera=teclado.readLine();
			System.out.println("Ingrese edad: ");
			edad=teclado.readLine();
			System.out.println("Ingrese nota 1:");
			nota1=Float.parseFloat(teclado.readLine().trim());
			System.out.println("Ingrese nota 2:");
			nota2=Float.parseFloat(teclado.readLine().trim());
			System.out.println("Ingrese nota 3:");
			nota3=Float.parseFloat(teclado.readLine().trim());

			}catch(Exception ex){
				System.out.println("Error:"+ex.getMessage());
			}
	}

	public void desplegarDatos()
	{
		try
		{
			System.out.println("RUT"+rut);
			System.out.println("Nombre:"+nombre);
			System.out.println("Apellido Paterno:"+apellidoPaterno);
			System.out.println("Apellido Materno:"+apellidoMaterno);
			if(sexo=='f') System.out.println("sexo:Femenino");
			if(sexo=='m') System.out.println("sexo:Masculino");
			System.out.println("Carrera"+carrera);
			System.out.println("Edad"+edad);
			System.out.println("Nota 1"+nota1);
			System.out.println("Nota 2"+nota2);
			System.out.println("Nota 3"+nota3);

		}catch(Exception ex)
		{
			System.out.println("Error:"+ex.getMessage());
		}
	}

	public String obtenerRut()
	{
		return this.rut;
	}

}
