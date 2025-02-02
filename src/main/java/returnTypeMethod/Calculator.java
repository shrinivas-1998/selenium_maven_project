package returnTypeMethod;

public class Calculator 
{
	// Method to add two integers and return the result
	   public int add(int a, int b)
	   {
	       return a + b; // Returns the sum of a and b
	   }
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
			
	           // Creating an instance of the Calculator class
	             Calculator calculator = new Calculator();
	           // Calling the return type method and storing the result
	          int sum = calculator.add(9, 8);
	      
	           // Printing the result
	             System.out.println("Sum: " + sum); // Output: Sum: 8
		}

}
