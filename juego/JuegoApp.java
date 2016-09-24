 import java.io.*;

public class JuegoApp
{
  // variables
  // => POR HACER: definir/ declarar variables a usar
  static String secreto; // El número secreto que se debe adivinar
  static String intento; // El número ingresado por el jugador en cada jugada
  static String registroJugadas[][] = new String[15][4];
  static int numeroJugada = 1; // Lleva el número de jugadas realizadas
  static boolean continuar = true; // Continuar o no el juego
	static boolean resultadoJuego = false;
  static JuegoApp juego = new JuegoApp();

  // main
  public static void main(String args[]) // --> Cata
  {
    // => POR HACER: Lleva flujo
		try {
			secreto = juego.generaSecreto();
			while(numeroJugada < 15) { // mientras queden intentos
				System.out.println("Jugada " + numeroJugada);
				// Pide ingresar un intento
				intento = juego.pideIntento();
					// Si es igual al secreto, finaliza el programa exitosamente
					if (intento == secreto) {
						resultadoJuego = true;
						juego.finalizaJuego(resultadoJuego);
					} else { // Si no, evalúa el intento, lo guarda y pide nuevo intento
						String resultadoIntento[] = new String[4];
						resultadoIntento = juego.evaluaIntento(intento).split("");
						for(int i = 0; i < resultadoIntento.length; i ++) {
							registroJugadas[numeroJugada-1][i] = resultadoIntento[i];
						}
						System.out.println("Resultado: " + juego.evaluaIntento(intento));
						System.out.println("---------------");
					}
				numeroJugada++;
			}
			// Si no quedan intentos, finaliza el juego
			juego.finalizaJuego(resultadoJuego);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
  }

  // métodos

  String generaSecreto() // --> Javo
  {
    // POR HACER: Devuelve un string de 4 dígitos numéricos distintos creado al azar.
    System.out.println("generaSecreto no implementado");
    return "1234";
  }

  boolean validaIntento(String intento) // --> Javo
  {
    // POR HACER: Devuelve verdadero o falso si el intento es válido.
    // Para que sea válido debe ser de 4 dígitos numéricos no repetidos.
    System.out.println("validaIntento no implementado");
    return true;
  }

  String evaluaDigito(String digito, int posicion) // --> Cata
  {
    // POR HACER: Devuelve un string F, T o N.
    // F, si el digito se encuentra en el secreto en la posicion indicada. T si se encuentra en otra posicion. N si no se encuentra.
    System.out.println("evaluaDigito no implementado");
    return "N";
  }

  String evaluaIntento(String intento) // --> Cata
  {
    // POR HACER: Recibe el intento de 4 dígitos, los manda a evaluar por separado, cuenta aciertos y devuelve un string con el resultado consolidado.
    // Ej: 1T2F
    System.out.println("evaluaIntento no implementado");
    return "1T2F";
  }

  String pideIntento() // --> Andy
  {
    // POR HACER: Pide al usuario que ingrese un nuevo intento. 
		// Usa el método validaIntento para ver si es válido. Si es así lo devuelve, si no es válido, le pide al usuario ingresar uno nuevo.
    System.out.println("pideIntento no implementado");
    return "1235";
  }

  boolean finalizaJuego(boolean resultado) // --> Andy
  {
    // POR HACER: Felicita o no al jugador dependiendo el resultado. Muestra el secreto y pregunta si quiere jugar de nuevo (devolviendo true o false).
    System.out.println("finalizaJuego no implementado");
    return false;
  }


}
