import java.io.*;

public class JuegoApp
{
 // variables
 String secreto; // El número secreto que se debe adivinar
 String intento; // El número ingresado por el jugador en cada jugada
 int cantJugadas = 15;
 String registroJugadas[][] = new String[cantJugadas][4];
 int numeroJugada = 1; // Lleva el número de jugadas realizadas
 boolean continuar = true; // Continuar o no el juego
 boolean resultadoJuego = false;
 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

 // main
 public static void main(String args[]) // --> Cata
 {
   JuegoApp juego = new JuegoApp();
   try {
     juego.reiniciarJuego();
   }
   catch(Exception ex) {
     System.out.println(ex.getMessage());
   }
   System.out.println("Hasta Pronto");
 }

 // métodos

 void reiniciarJuego()
 {
   secreto = generaSecreto();
   numeroJugada = 1;
   for(int i=0; i < cantJugadas; i++) {
     registroJugadas[i][0] = "";
     registroJugadas[i][1] = "";
     registroJugadas[i][2] = "";
     registroJugadas[i][3] = "";
   }
   while(numeroJugada <= 15) { // mientras queden intentos
     System.out.println("Jugada " + numeroJugada);
     // Pide ingresar un intento
     intento = pideIntento();
     // Si es igual al secreto, finaliza el programa exitosamente
     if (intento.equals(secreto)) {
       resultadoJuego = true;
       break;
     } else { // Si no, evalúa el intento, lo guarda y pide nuevo intento
       String IntentoArr[] = new String[4];
       String resultadoIntento = evaluaIntento(intento);
       IntentoArr = intento.split("");
       for(int i = 0; i < IntentoArr.length; i ++) {
         registroJugadas[numeroJugada-1][i] = IntentoArr[i];
       }
       System.out.println("Resultado: " + resultadoIntento);
       System.out.println("---------------");
     }
     numeroJugada++;
   }
   // Si no quedan intentos, finaliza el juego
   finalizaJuego(resultadoJuego);

 }

 String generaSecreto() // --> Javo
 {
   // Devuelve un string de 4 dígitos numéricos distintos creado al azar.
   int vector[] = new int [4];
   int i = 0, j;
   vector[i] = (int)(Math.random()*10);
   for (i = 1;i < 4;i++){
     vector[i] = (int)(Math.random()*10);
     for (j = 0;j < i;j++){
       if (vector[i] == vector[j]){
         i--;
       }
     }
   }
   // Pasar vector a string
   String aleatorio = "";
   for (i = 0;i < 4;i++){
     aleatorio = aleatorio + vector[i];
     // System.out.print(vector[i]);
   }
   return aleatorio;
 }

 boolean validaIntento(String intento) // --> Javo
 {
   // Devuelve verdadero o falso si el intento es válido.
   // Para que sea válido debe ser de 4 dígitos numéricos no repetidos.
   if(intento.length() == 4) { // Son 4
     for(int i = 0; i < 4; i++) { // Son numéricos
       if(!Character.isDigit(intento.charAt(i))) {
         System.out.println("Los dígitos deben ser números");
         return false;
       }
     }
     for(int i = 0; i < 4; i++) { // No están repetidos
       char charRef = intento.charAt(i);
       for(int j = i+1; j < 4; j++) {
         if (charRef == intento.charAt(j)) {
           System.out.println("El digito " + charRef + " esta repetido");
           return false;
         }
       }
     }
   } else {
     System.out.println("El número debe ser de 4 dígitos");
     return false;
   }
   return true;
 }

 String evaluaDigito(String digito, int posicion) // --> Cata
 {
   // Devuelve un string F, T o N.
   // F, si el digito se encuentra en el secreto en la posicion indicada. T si se encuentra en otra posicion. N si no se encuentra.
   // Busco retornar fama como primera opción
   String digitoReferencia = Character.toString(secreto.charAt(posicion));
   // System.out.println("digitoReferencia " + digitoReferencia + " para posicion " + posicion);
   if(digito.equals(digitoReferencia)) {
     return "F";
   }
   // Si aún no he retornado un resultado, vuelvo a evaluar, pero sin requerir posición
   for(int i = 0; i < 4; i++) {
     digitoReferencia = Character.toString(secreto.charAt(i));
     if(digito.equals(digitoReferencia)) {
       return "T";
     }
   }
   return "N"; // Nada encontrado
 }

 String evaluaIntento(String intento) // --> Cata
 {
   // POR HACER: Recibe el intento de 4 dígitos, los manda a evaluar por separado, cuenta aciertos y devuelve un string con el resultado consolidado.
   // Ej: 1T2F
   int T = 0;
   int F = 0;
   // System.out.println("Evaluando intento " + intento);
   for(int i = 0; i < 4; i++) {
     String digito = Character.toString(intento.charAt(i));
     // System.out.println("evaluando digito " + digito + "en pos " + i);
     String resultadoDigito = evaluaDigito(digito, i);
     if (resultadoDigito.equals("T")) {
       T++;
     } else if (resultadoDigito.equals("F")) {
       F++;
     }
   }
   return T+"T"+F+"F";
 }

 String pideIntento() // --> Andy
 {
   // Pide al usuario que ingrese un nuevo intento.
   // Usa el método validaIntento para ver si es válido. Si es así lo devuelve, si no es válido, le pide al usuario ingresar uno nuevo.

   boolean intentoValido = false;
   try
   {
     while (!intentoValido) {
       System.out.println("Ingresa un número de 4 dígitos distintos para adivinar el numero secreto");
       intento = teclado.readLine();
       intentoValido = validaIntento(intento);
     }
     return intento;
   }
   catch (Exception ex) {
     System.out.println(ex.getMessage());
     return "error";
   }
 }

 void finalizaJuego(boolean resultado) // --> Andy
 {
   // POR HACER: Felicita o no al jugador dependiendo el resultado. Muestra el secreto y pregunta si quiere jugar de nuevo (devolviendo true o false).
   if(resultado == true) {
     System.out.println("Felicitaciones, has ganado");
   } else {
     System.out.println("Lo siento, has perdidio");
   }
   System.out.println("El numero secreto es: " + secreto);
   System.out.println("Tus jugadas:");
   for(int i = 0; i < cantJugadas; i++) {
     System.out.println(registroJugadas[i][0]+registroJugadas[i][1]+registroJugadas[i][2]+registroJugadas[i][3]);
   }
   try {
     String continuarJuego = "";
     System.out.println("¿Jugar de nuevo? S/N");
     continuarJuego = teclado.readLine();
     if(continuarJuego.equals("S")) {
       reiniciarJuego();
     }
   }
   catch(Exception ex) {
     System.out.println(ex.getMessage());
   }
 }

}
