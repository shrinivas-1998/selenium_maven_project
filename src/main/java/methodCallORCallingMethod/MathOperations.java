package methodCallORCallingMethod;

public class MathOperations 
{
       // Method to add two numbers
	    public int add(int a, int b)
	    {
	       return a + b; // Return the sum
	    }
	  
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
	     MathOperations math = new MathOperations(); // Create an instance of MathOperations
	     // Method call
	     int sum = math.add(10, 20); // Calling the add method with arguments 5 and 3
	     System.out.println("Sum: " + sum); // Output the result
		}
}
