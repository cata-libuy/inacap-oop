import java.io.*;

public class VehiculosApp
{

  public static void main(String args[])
  {
    Vehiculo vehiculo1 = new Vehiculo();
    Vehiculo vehiculo2 = new Vehiculo();
    Vehiculo vehiculo3 = new Vehiculo();

    try
    {
      // Pedir datos
      vehiculo1.leerDatos();
      vehiculo2.leerDatos();
      vehiculo3.leerDatos();

      // desplegar
      vehiculo1.desplegarDatos();
      vehiculo2.desplegarDatos();
      vehiculo3.desplegarDatos();
    }
    catch(Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
