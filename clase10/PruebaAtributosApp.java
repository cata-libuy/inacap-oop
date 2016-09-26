import java.io.*;

public class PruebaAtributosApp
{
  String saludo = "hola";
  String despedida = "chao";

  public static void main(String args[])
  {
    PruebaAtributosApp prueba = new PruebaAtributosApp();
    prueba.saludar();
    prueba.despedirse();
    System.out.println("De nuevo " + prueba.saludo);
  }

  void saludar()
  {
    System.out.println(saludo);
  }

  void despedirse()
  {
    System.out.println(despedida);
  }
}
