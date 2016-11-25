public class A2
{
   public static void main(String[] args)
   {
      for(short cantBotellas=99; cantBotellas >= 2; cantBotellas--)
      {
         System.out.println(cantBotellas + " botellas de cerveza en la pared,");
         System.out.println(cantBotellas + " botellas de cerveza.");
         System.out.println("Una se cayo");
         System.out.println("y quedaron " + (cantBotellas - 1) + 
            			   " botellas de cerveza en la pared.");
         System.out.println();
      }
   	
      System.out.println("1 botella de cerveza en la pared,");
      System.out.println("1 botella de cerveza.");
      System.out.println("Una se cayo");
      System.out.println("y no hay mas botellas de cerveza en la pared.");
      System.out.println();
   	
      System.out.println("No hay botellas de cerveza en la pared,");
      System.out.println("no hay botellas de cerveza.");
      System.out.println("Hay que ir a la tienda y comprar mas,");
      System.out.println("99 botellas de cerveza en la pared.");
   }
}