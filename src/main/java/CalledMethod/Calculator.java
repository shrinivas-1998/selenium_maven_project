package CalledMethod;

public class Calculator 
{
	 // This is the called method
	   public int add(int a, int b)
	   {
	       // Called method statement
	       return a + b; // This statement performs the addition and returns the result
	   }
		
		public static void main(String[] args)
		{
		 // TODO Auto-generated method stub
	             Calculator calc = new Calculator(); // Create an instance of Calculator
	      
	             // Calling method statement
	            int result = calc.add(5, 3); // This line calls the add method
	            System.out.println("Sum: " + result); // Output the result
		}

}
