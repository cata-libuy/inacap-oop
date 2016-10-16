import java.io.*;

public class CursoApp
{
  Alumno alumno1 = new Alumno();
  public static void main(String args[])
  {
    CursoApp curso = new CursoApp();
    curso.alumno1.leerDatos();
    curso.alumno1.desplegarDatos();
  }
}
