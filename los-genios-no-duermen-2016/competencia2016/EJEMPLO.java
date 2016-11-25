import java.io.*;
import java.util.Scanner;

public class EJEMPLO {
  Scanner sc = new Scanner(System.in);
  int numeros[] = new int[20];
  ArrayList<String> palabras = new ArrayList<>();

  public static void main(String args[])
  {
    EJEMPLO app = new EJEMPLO();
    app.imprimeAlgo("hola");
  }

  public void imprimeAlgo(String algo)
  {
    System.out.println(algo);
  }
}
