import java.io.*;

public class PersonaListaApp2
{
  public static void main(String a[])
  {
    try
    {
      Persona arreglo[] = new Persona[5];
      // Llenar arreglo
      int i = 0;
      for (i = 0; i < 5; i++) {
        arreglo[i] = new Persona();
        arreglo[i].leerDatos();
      }
      // desplegar arreglo
      for (i = 0; i < 5; i++) {
        arreglo[i].desplegarDatos();
      }
    }
  }
}
