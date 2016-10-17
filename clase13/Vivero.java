public class Vivero
{
  private int numeroPlantas, numeroArboles;
  private Planta plantas[];
  private Arbol arboles[];

  public Vivero(int numeroPlantas, int numeroArboles)
  {
    this.numeroPlantas = numeroPlantas;
    this.numeroArboles = numeroArboles;
    this.plantas = new Planta[numeroPlantas];
    this.arboles = new Arbol[numeroArboles];
  }

  public boolean setPlanta(Planta planta, int index)
  {
    if (index < plantas.length) {
      this.plantas[index] = planta;
      return true;
    }
    return false;
  }

  public boolean setArbol(Arbol arbol, int index)
  {
    if (index < arboles.length) {
      this.arboles[index] = arbol;
      return true;
    }
    return false;
  }
}
