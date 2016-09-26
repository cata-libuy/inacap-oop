import java.io.*;

public class Vehiculo
{
  // Atributos
  String patente, marca, modelo;
  int nChasis, year, valorFiscal;

  // Constructor
  public Vehiculo() //vacio
  {
    this.patente = "";
    this.marca = "";
    this.modelo = "";
    this.nChasis = 0;
    this.year = 0;
    this.valorFiscal = 0;
  }

  public Vehiculo(String patente, String marca, String modelo, int nChasis, int year, int valorFiscal )
  {
    this.patente = patente;
    this.marca = marca;
    this.modelo = modelo;
    this.nChasis = nChasis;
    this.year = year;
    this.valorFiscal = valorFiscal;
  }

  public void leerDatos()
  {
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("Ingrese datos del vehículo");
      System.out.println("Patente: ");
      this.patente = teclado.readLine();
      System.out.println("Marca: ");
      this.marca = teclado.readLine();
      System.out.println("Modelo :");
      this.modelo = teclado.readLine();
      System.out.println("Numero Chasis: ");
      this.nChasis = Integer.parseInt(teclado.readLine().trim());
      System.out.println("Año: ");
      this.nChasis = Integer.parseInt(teclado.readLine());
      System.out.println("Valor fiscal: ");
      this.valorFiscal = Integer.parseInt(teclado.readLine().trim());
    }
    catch(Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  public void desplegarDatos() {
    System.out.println("Datos del vehiculo: ");
    System.out.println("Patente: " + this.patente);
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Num Chasis: " + this.nChasis);
    System.out.println("Año: " + this.year);
    System.out.println("Valor Fiscal: " + this.valorFiscal);
  }

}
