package TypesOfMethodBasedOnArgumnets;

public class Calculator 
{
	// Parameterized method to add two numbers
	   public int add(int a, int b)
	   {
	       return a + b; // Return the sum of the parameters
	   }

	   public static void main(String[] args)
	   {
	       Calculator calc = new Calculator(); // Create an instance of Calculator
	       int sum = calc.add(10, 111); // Call the parameterized method with arguments
	       System.out.println("Sum: " + sum); // Output the sum
	   }
}
