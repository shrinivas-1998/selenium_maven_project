package operators;

public class PreDecrementExample 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
        int x = 10;
        int y = --x; // x is decremented first, then y gets the new value of x
        System.out.println("Value of x: " + x); // Output: 9
        System.out.println("Value of y: " + y); // Output: 9
      }
}
