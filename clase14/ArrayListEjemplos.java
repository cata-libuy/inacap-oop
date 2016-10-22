import java.io.*;
import java.util.*;
// Colección de objetos no limitada cuya dimensión es dinámica.

// Se declara con un tipo de dato
// ArrayList<tipoDato> NombreArrayList = new ArrayList<tipoDato>();
public class ArrayListEjemplos {
  public static void main(String args[]) {
    ArrayList<Integer> L = new ArrayList<Integer>();
    for (int i = 0; i <= 10; i++) {
      L.add(i);
    }
    for (int i = 0; i < L.size(); i++) {
      System.out.println(L.get(i));
    }
  }
}
