package operators;

public class PostDecrementExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub	
       int x = 10;
       int y = x--; // y gets the original value of x, then x is decremented
       System.out.println("Value of x: " + x); // Output: 9
       System.out.println("Value of y: " + y); // Output: 10
     }
}
