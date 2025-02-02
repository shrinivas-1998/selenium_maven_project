package operators;

public class LogicalNotExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
      boolean isSunny = true;
      boolean isNotSunny = !isSunny; // Negates the value of isSunny


      System.out.println("Is it sunny? " + isSunny);          // Output: true
      System.out.println("Is it not sunny? " + isNotSunny);  // Output: false


      // Another example with a condition
      int temperature = 30;
      boolean isCold = temperature < 20; // Checks if it's cold
      boolean isNotCold = !isCold;       // Negates the result
      System.out.println("Is it cold? " + isCold);            // Output: false
      System.out.println("Is it not cold? " + isNotCold);     // Output: true
      }
}
