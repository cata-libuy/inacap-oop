import java.io.*;

public class AlumnosListaApp
{
  Alumno alumnos[] = new Alumno[5]; // Crear una arreglo de alumnos

  public static void main(String args[])
  {
    AlumnosListaApp lista = new AlumnosListaApp();

    // Inicializar alumnos de la lista y llenarlos
    for(int i = 0; i < lista.alumnos.length; i++ ) {
      lista.alumnos[i] = new Alumno();
      lista.alumnos[i].leerDatos();
    }

    // desplegarDatos
    for(int i = 0; i < lista.alumnos.length; i++ ) {
      lista.alumnos[i].desplegarDatos();
    }
  }

}
