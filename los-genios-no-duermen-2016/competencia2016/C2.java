import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
import java.math.*;

public class C2 {

  public static void main(String args[])
  {
    int digito;
    String entrada;
    Scanner sc = new Scanner(System.in);
    entrada = sc.nextLine();
    String[] parts = entrada.split("-1");
    // separacion matrices
    for (int i = 0; i < parts.length; i++) {
      int dimMatrizEntrada = Integer.parseInt(datos[0]);
      int dimMatrizBorde = Integer.parseInt(datos[1]);
      // construccion de una matriz
      String strDatos = parts[i].substring(2);
      String[] soloDatos = strDatos.split(" ");
      int matriz[][] = new int[dimMatrizEntrada][dimMatrizEntrada];
      int contador = 0;
      for (int j = 0; j < dimMatrizEntrada; j++) {
        for (int k = 0; k < dimMatrizEntrada; k++) {
          System.out.println("llenando matriz en " + j + " " + k + " con " + soloDatos[contador]);
          if (contador == soloDatos.length-1) {
            break;
          }
          matriz[j][k] = Integer.parseInt(soloDatos[contador]);
          contador++;
        }
      }
      ArrayList<Integer> paraImprimir = new ArrayList<>();
      for (int l = 0; l < dimMatrizEntrada; l++) {
        for (int m = 0; m < dimMatrizEntrada; m++) {
          if (matriz[l][m] != 1 && matriz[l][m] != 0) {
            paraImprimir.add(matriz[l][m]);
          }
        }
      }
      int suma = 0;
      for (Integer num:paraImprimir) {
        suma = suma + num;
      }
      System.out.print(suma);
      for (Integer num:paraImprimir) {
        System.out.print(" " + num);
      }
      if (i == parts.length) {
        System.out.print(" -1 ");
      }
    }
  }
}
