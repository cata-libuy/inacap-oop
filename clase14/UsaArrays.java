import java.io.*;
import java.util.Arrays;

public class UsaArrays {
  public static void main(String args[])
  {
    int[] A = {190, -1, 54, 12, 67 };
    int B[] = { 88, -32, 9, 24, 77};
    String[] pal = new String[7];
    UsaArrays app = new UsaArrays();

    Arrays.fill(pal, "Hola Mundo");
    app.mostrarStrings(pal);
    if (Arrays.equals(A, B)) {
      System.out.println("Son iguales");
    } else {
      System.out.println("Son distintos");
    }

    // Ordenar A y B
    Arrays.sort(A);
    Arrays.sort(B);

    // LLamada a método mostrar
    app.mostrar(A);
    app.mostrar(B);

    Arrays.fill(A, 0);
    app.mostrar(A);
  }

  private void mostrar(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("*********FIN ARREGLO********");
  }

  private void mostrarStrings(String arr[])
  {
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("*********FIN ARREGLO********");
  }
}
