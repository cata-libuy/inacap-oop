// Desarrollar app que permita ingresar los datos de 100 vehiculos.
// Luego el sist. debe desplegar los datos de los vehículos ingresados desde el final al principio.
// Por ultimo, debe desplegar marca y modelo el o los vehiculos cuyo valor sea menor a 1.000.000
// El método main no debe tener más de 10 líneas en total

import java.io.*;

public class VehiculosApp
{
  Vehiculo vehiculos[] = new Vehiculo[5];

  public static void main(String a[])
  {
    try
    {
      VehiculosApp app = new VehiculosApp();
      app.guardarVehiculos();
      app.desplegarVehiculos();
      app.buscarVehiculosMenorPrecio(1000000);
    }
    catch(Exception ex)
    {
      System.out.println(ex.getMessage());
    }
  }

  // leer
  void guardarVehiculos()
  {
    int i = 0;
    for (i = 0; i < vehiculos.length ; i++) {
      vehiculos[i] = new Vehiculo();
      vehiculos[i].leerDatos();
    }
  }

  // Desplegar inverso
  void desplegarVehiculos()
  {
    System.out.println("\n***Vehiculos en orden inverso***");
    for (int i = vehiculos.length-1; i > -1; i--) {
      vehiculos[i].desplegarDatos();
    }
  }

  // menores a 1MM
  void buscarVehiculosMenorPrecio(int precio)
  {
    System.out.println("\n***Vehiculos con precio menor a " + precio + " ***");
    for (int i = 0; i < vehiculos.length ; i++) {
      if(vehiculos[i].valorFiscal <= precio) {
        vehiculos[i].desplegarDatos();
      }
    }
  }

}
