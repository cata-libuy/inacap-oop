import java.io.*;

public class Alumno extends Persona
{
  public String carrera, estado;
  public float nota1, nota2;

  public Alumno()
  {
    super();
    carrera = "";
    nota1 = 0.0f;
    nota2 = 0.0f;
    estado = "";
  }

  public Alumno(String rut, String nombre, String apellidos, char sexo, String carrera, float nota1, float nota2, String estado)
  {
    super(rut, nombre, apellidos, sexo);
    this.carrera = carrera;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.estado = estado;
  }

  public void leerDatos()
  {
    super.leerDatos();
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Ingrese Carrera: ");
      carrera = teclado.readLine();
      System.out.println("Ingrese Nota 1: ");
      nota1 = Float.parseFloat(teclado.readLine());
      System.out.println("Ingrese Nota 2: ");
      nota2 = Float.parseFloat(teclado.readLine());
      System.out.println("Ingrese Estado: ");
      estado = teclado.readLine();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  public void desplegarDatos()
  {
    System.out.println("Datos Personales");
    super.desplegarDatos();
    System.out.println("carrera: " + this.carrera);
    System.out.println("nota 1: " + this.nota1);
    System.out.println("nota 2: " + this.nota2);
    System.out.println("estado: " + this.estado);
    System.out.println("-------------");
  }

}
