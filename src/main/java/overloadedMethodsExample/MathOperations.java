package overloadedMethodsExample;

public class MathOperations 
{
	// Method to add two integers
	   public int add(int a, int b)
	   {
	       return a + b;
	   }
	   // Overloaded method to add three integers
	   public int add(int a, int b, int c)
	   {
	       return a + b + c;
	   }
	   // Overloaded method to add two doubles
	   public double add(double a, double b)
	   {
	       return a + b;
	   }
	   public static void main(String[] args)
	   {
	       MathOperations math = new MathOperations();
	       // Calling the overloaded methods
	       int sum1 = math.add(5, 10);          // Calls first method
	       int sum2 = math.add(5, 10, 15);      // Calls second method
	       double sum3 = math.add(5.5, 4.5);    // Calls third method
	       // Printing the results
	       System.out.println("Sum of two integers: " + sum1); // Output: 15
	       System.out.println("Sum of three integers: " + sum2); // Output: 30
	       System.out.println("Sum of two doubles: " + sum3); // Output: 10.0
	   }
}
