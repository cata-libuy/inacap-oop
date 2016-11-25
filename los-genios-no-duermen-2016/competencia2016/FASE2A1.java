import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.*;

public class FASE2A1 {

  String entrada;
  Scanner sc = new Scanner(System.in);

  public static void main(String args[])
  {

    FASE2A1 app = new FASE2A1();
    DecimalFormat df = new DecimalFormat("##");
    df.setRoundingMode(RoundingMode.DOWN);
    while(true) {
      app.entrada = app.sc.nextLine();
      String[] parts = app.entrada.split("-1");
      Float promedios[] = new Float[parts.length];
      for (int i = 0; i < promedios.length; i++) {
        promedios[i] = app.calculoAsignatura(parts[i]);
        System.out.print(df.format(promedios[i]) + " ");
      }
      app.promedioFinal(promedios);
      break;
    }

  }

  public Float calculoAsignatura(String datos)
  {
    if (datos.charAt(0) == ' ') {
      datos = datos.substring(1);
    }
    String[] parts = datos.split(" ");
    Float promedio = 0.0f;
    for (int i = 0; i < parts.length -1; i++) {
      if (i%2 == 0) {
        Float nota = Float.parseFloat(parts[i]);
        Float ponderador = Float.parseFloat(parts[i+1]);
        promedio = promedio + ((nota * ponderador) / 100);
      }
    }
    return promedio;
  }

  public void promedioFinal (Float f[]) {
    DecimalFormat df = new DecimalFormat("##");
    df.setRoundingMode(RoundingMode.DOWN);
		int i;
		Float suma=0.0f;
		for(i=0;i<f.length;i++){
			suma = suma+f[i];
		}
		suma = suma/(f.length);
    System.out.println(df.format(suma));
    System.out.println();
	}
}
