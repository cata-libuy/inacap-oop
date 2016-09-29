import java.io.*;

public class Alumno
{
	public String rut;
	public String nombre;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public String sexo;
	public String carrera;
	public String edad;
	public float nota1, nota2, nota3, suma, promedio;
	//Alumno alumnos[] = new Alumno[2];

	public Alumno()
	{
		//this es la clase:
		this.rut="";
		this.nombre="";
		this.apellidoPaterno="";
		this.apellidoMaterno="";
		this.sexo="";
		this.carrera="";
		this.edad="";
		this.nota1=0;
		this.nota2=0;
		this.nota3=0;
	}
	//metodo Constructor con parametros
	public Alumno(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo, String carrera, String edad, float nota1, float nota2, float nota3)
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

	public void leerDatos(int numAlumno)
	{
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("");
      System.out.println("!------ALUMNO " + (numAlumno + 1) + "------!");
			System.out.println("");
			System.out.println("Ingrese RUT:");
			this.rut=teclado.readLine();
			System.out.println("Ingrese Nombre:");
			this.nombre=teclado.readLine();
			System.out.println("Ingrese Apellido Paterno:");
			this.apellidoPaterno=teclado.readLine();
			System.out.println("Ingrese Apellido Materno:");
			this.apellidoMaterno=teclado.readLine();
			System.out.println("Ingrese Sexo[F o M]:");
			this.sexo = teclado.readLine().toUpperCase();
			System.out.println("Ingrese Carrera: ");
			this.carrera=teclado.readLine();
			System.out.println("Ingrese Edad: ");
			this.edad=teclado.readLine();
			System.out.println("Ingrese Nota 1:");
			this.nota1=Float.parseFloat(teclado.readLine().trim());
			System.out.println("Ingrese Nota 2:");
			this.nota2=Float.parseFloat(teclado.readLine().trim());
			System.out.println("Ingrese Nota 3:");
			this.nota3=Float.parseFloat(teclado.readLine().trim());
		}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}

	public void desplegarDatos()
	{
		try
		{
			System.out.println("");
			System.out.println("RUT: "+this.rut);
			System.out.println("Nombre Completo: "+this.nombre+" "+this.apellidoPaterno+" "+this.apellidoMaterno);
			System.out.println("Carrera: "+this.carrera);
			System.out.println("Promedio: "+(this.nota1*0.2 + this.nota2*0.3 + this.nota3*0.5));
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
