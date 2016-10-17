import java.io.*;

public class Arbol extends Planta
{
  // super();
  private double altura;
  private int edad;

  public Arbol()
  {
    super();
    this.altura = 0.0;
    this.edad = 0;
  }

  public Arbol(int idPlanta, String nombre, String origen, int precio, double altura, int edad)
  {
    super(idPlanta, nombre, origen, precio);
    this.altura = altura;
    this.edad = edad;
  }

  public void setEdad(int edad)
  {
    this.edad = edad;
  }

  public void setAltura(double Altura)
  {
    this.altura = altura;
  }

  public String getDatos()
  {
    return super.getDatos() + " " + this.edad + " " + this.altura;
  }
}
