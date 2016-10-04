import java.io.*;

public class Docente extends Persona
{
  public String titulo, gradoAcademico, carrera;
  public int sueldo;

  public Docente()
  {
    super();
    titulo = "";
    gradoAcademico = "";
    carrera = "";
    sueldo = 0;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  }

  public Docente(String rut, String nombre, String apellidos, char sexo, String titulo, String gradoAcademico, String carrera, int sueldo)
  {
    super(rut, nombre, apellidos, sexo);
    this.titulo = titulo;
    this.gradoAcademico = gradoAcademico;
    this.carrera = carrera;
    this.sueldo = sueldo;
  }

  public.leerDatos()
  {
    try {
      super.leerDatos();
      System.out.println("Titulo: ");
      titulo = teclado.readLine();
      System.out.println("Grado academico: ");
      gradoAcademico = teclado.readLine();
      System.out.println("Carrera: ");
      carrera = teclado.readLine();
      System.out.println("Sueldo: ");
      sueldo = Integer.parseInt(teclado.readLine());
    } catch( Exception ex ){
        System.out.printlon(ex.getMessage());
    }
  }

  public.desplegarDatos()
  {
    super.desplegarDatos();
    System.out.println("\n Titulo: " + titulo + "\n Grado academico: " + gradoAcademico + "\n Carrera: " + carrera + "\n Sueldo: " + sueldo);
  }

}
