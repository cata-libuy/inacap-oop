// Con array list, hacer una app que permita lleer desde el teclado promedio de notas hasta que la persona indique que no quiere seguir ingresando.
// Las notas ingresadas deben ser desplegadas al finalizar.
import java.io.*;
import java.util.*;

public class NotasApp {
  ArrayList<Float> notas = new ArrayList<Float>();
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  boolean continuar = true;
  public static void main(String args[])
  {
    NotasApp app = new NotasApp();
    while (app.continuar) {
      app.notas.add(app.leerNota());
      app.continuar = app.quiereContinuar();
    }
    app.desplegarNotas();
    System.out.println("Good bye");
  }

  public Float leerNota()
  {
    Float nota;
    try {
      System.out.println("Ingrese nota");
      nota = Float.parseFloat(teclado.readLine().trim());
      return nota;
    } catch (Exception ex) {
      System.out.println("error: " + ex.getMessage());
      return -1.0f;
    }
  }

  public boolean quiereContinuar()
  {
    String respuesta;
    try {
      System.out.println("¿Continuar Ingresando? S/N");
      respuesta = teclado.readLine().trim().toUpperCase();
      if (respuesta.equals("S"))
        return true;
      return false;
    } catch (Exception ex) {
      System.out.println("error: " + ex.getMessage());
      return false;
    }
  }

  public void desplegarNotas()
  {
    for (int i = 0; i < notas.size(); i++) {
      System.out.println("Nota " + i + ": " + notas.get(i));
    }
  }

}
