import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.*;

public class C3 {

  public static void main(String args[])
  {
    int digito;
    Scanner sc = new Scanner(System.in);
    int terreno[][] = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        digito = sc.nextInt();
        terreno[i][j] = digito;
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (terreno[i][j] == 1) {
          System.out.print("("+i+","+j+") ");
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (terreno[i][j] == 2) {
          System.out.print("("+i+","+j+") ");
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (terreno[i][j] == 3) {
          System.out.print("("+i+","+j+") ");
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (terreno[i][j] == 4) {
          System.out.print("("+i+","+j+") ");
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (terreno[i][j] == 5) {
          System.out.print("("+i+","+j+")");
        }
      }
    }
    System.out.println();
  }
}
