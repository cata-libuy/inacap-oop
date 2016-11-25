import java.io.*;
import java.util.Scanner;

public class A4{
  Scanner sc = new Scanner(System.in);
  int numeros[] = new int[20];
  String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  String entrada, cifrado, descifrado;
  int desplazamiento;

  public static void main(String args[])
  {
    A4 app = new A4();
    while(true) {
      app.entrada = app.sc.nextLine();
      if (app.entrada.equals("FIN")) {
        break;
      } else {
        app.procesarChunks(app.entrada);
      }

    }
  }

  public int obtenerDesplazamiento(String entrada) {
    String[] parts = entrada.split(" ");
    String desStr = parts[0].replace("+", "");
    return Integer.parseInt(desStr);
  }

  public void procesarChunks(String entrada) {
    String[] parts = entrada.split(" ");
    for (int i = 1; i < parts.length; i++) {
      int des = obtenerDesplazamiento(entrada);
      String chunk = parts[i];
      if (i == parts.length -1) {
        descifrar(des, chunk, "last");
      }
      descifrar(des, chunk, "any");
    }
    System.out.println();
  }

  public void descifrar(int des, String chunk, String last) {

    String nuevoChunk = "";
    for (int i = 0; i < chunk.length(); i++){
      int alfOldIndex = alfabeto.indexOf(Character.toUpperCase(chunk.charAt(i)));
      int alfNewIndex = alfOldIndex + des > alfabeto.length() -1 ? (alfOldIndex + des) % alfabeto.length() : alfOldIndex + des;
      // System.out.println("chunk: " + chunk + " ,des: " + des + ", char at : " + chunk.charAt(i) + " oldIndex: " + alfOldIndex + ", newIn: " + alfNewIndex + "nuevochar " + alfabeto.charAt(alfNewIndex));
      nuevoChunk = nuevoChunk + alfabeto.charAt(alfNewIndex);
    }
    if (last.equals("last")) {
      System.out.print(nuevoChunk);
    }
    System.out.print(nuevoChunk + " ");
  }
}
