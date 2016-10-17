import java.io.*;

public class TestViveroApp
{
  public static void main(String args[])
  {
    boolean resultado1, resultado2, resultado3, resultado4;
    Vivero vivero1 = new Vivero(2,2);
    Planta planta1 = new Planta(1, "Ficus", "Chile", 500);
    Planta planta2 = new Planta(2, "Gomero", "Chile", 500);
    Arbol arbol1 = new Arbol(3, "Araucaria", "Chile", 5000, 1.5, 50);
    Arbol arbol2 = new Arbol(4, "Maiten", "Chile", 2000, 1.0, 2);
    resultado1 = vivero1.setPlanta(planta1, 0);
    resultado2 = vivero1.setPlanta(planta2, 1);
    resultado3 = vivero1.setArbol(arbol1, 0);
    resultado4 = vivero1.setArbol(arbol2, 1);
    System.out.println("Resultados test " + resultado1 + " " + resultado2 + " " + resultado3 + " " + resultado4);
  }
}
