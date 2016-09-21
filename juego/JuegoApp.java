import java.io.*;

public class JuegoApp
{
  // variables
  // => POR HACER: definir/ declarar variables a usar
  // Str secreto, intento, resultados,
  // int numeroJugada
  // boolean continuar

  // main
  public static void main(String args[])
  {
    // => POR HACER: Lleva flujo
    // mientras queden intentos
      // Pide un ingresar intento
        // Si es igual al secreto, finaliza el programa exitosamente
        // Si no, evalúa el intento, lo guarda y pide nuevo intento
    // Si no quedan intentos, finaliza el juego   
    System.out.println("Juego no implementado");
  }

  // métodos

  String generaSecreto()
  {
    // POR HACER: Devuelve un string de 4 dígitos numéricos distintos creado al azar.
    System.out.println("generaSecreto no implementado");
    return "1234";
  }

  boolean validaIntento(String intento)
  {
    // POR HACER: Devuelve verdadero o falso si el intento es válido.
    // Para que sea válido debe ser de 4 dígitos numéricos no repetidos.
    System.out.println("validaIntento no implementado");
    return true;
  }

  String evaluaDigito(String digito, int posicion)
  {
    // POR HACER: Devuelve un string F, T o N.
    // F, si el digito se encuentra en el secreto en la posicion indicada. T si se encuentra en otra posicion. N si no se encuentra.
    System.out.println("evaluaDigito no implementado");
    return 'N';
  }

  String evaluaIntento(String intento)
  {
    // POR HACER: Recibe el intento de 4 dígitos, los manda a evaluar por separado, cuenta aciertos y devuelve un string con el resultado consolidado.
    // Ej: 1T2F
    System.out.println("evaluaIntento no implementado");
    return '1T2F';
  }

  String pideIntento()
  {
    // POR HACER: Pide al usuario que ingrese un nuevo intento y lo devuelve.
    System.out.println("pideIntento no implementado");
    return '1234';
  }

  boolean finalizaJuego(boolean resultado)
  {
    // POR HACER: Felicita o no al jugador dependiendo el resultado. Muestra el secreto y pregunta si quiere jugar de nuevo (devolviendo true o false).
    System.out.println("finalizaJuego no implementado");
    return false;
  }


}
