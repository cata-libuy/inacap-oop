import java.io.*;
import java.util.Scanner;

public class A1 {

  int suma = 0;
  Scanner sc = new Scanner(System.in);
  int cantidadALeer = 0;
  int cantidadLeida = 0;
  int dato;
  String binarioStr;
  public static void main(String args[])
  {
    A1 app = new A1();
    app.cantidadALeer = app.sc.nextInt();
    while(true) {
      app.binarioStr = app.sc.nextLine();
      app.binarioADecimal(app.binarioStr);
      break;
    }

  }

  public void binarioADecimal(String binario)
  {
    int num;
    int sumaBin = 0;
    int exponente = 0;
    for(int i = binario.length() -1; i > 0; i--) {
      num = Character.getNumericValue(binario.charAt(i));
      num = potenciaDeDos(num, i);
      sumaBin = sumaBin + num;
      exponente++;
    }
    System.out.println("binario " + binario);
    System.out.println("num " + sumaBin);
  }

  public int potenciaDeDos(int base, int exponente)
  {
    int resultado = 0;
    if (exponente == 0) {
      return 1;
    }
    if (exponente == 1) {
      return base;
    }
    for (int i = 0; i < exponente; i++) {
      resultado = base * 2;
    }
    return resultado;
  }
}
