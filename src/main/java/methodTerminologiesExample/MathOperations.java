package methodTerminologiesExample;

public class MathOperations 
{
	// Static method for adding two integers
	   public static int add(int a, int b)
	   {
	       return a + b; // Return the sum
	   }
	  
		public static void main(String[] args)
		{
		   // TODO Auto-generated method stub	
		    // Calling the static method directly using the class name
	        int sum = add(5, 3);
	        //int sum = MathOperations.add(5, 3);
	        System.out.println("The sum is: " + sum); // Output the result
		}

}
