import java.io.*;

public class Planta
{
  private int idPlanta, precio;
  private String nombre, origen;

  public Planta()
  {
    this.idPlanta = 0;
    this.nombre = "";
    this.origen = "";
    this.precio = 0;
  }

  public Planta(int idPlanta, String nombre, String origen, int precio)
  {
    this.idPlanta = idPlanta;
    this.nombre = "";
    this.origen = "";
    this.precio = precio;
  }

  public String getDatos()
  {
    return this.idPlanta + " " + this.nombre + " " + this.origen + " " + this.precio;
  }
}
