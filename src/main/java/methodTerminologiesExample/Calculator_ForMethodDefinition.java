package methodTerminologiesExample;

public class Calculator_ForMethodDefinition 
{	
	 // Method definition for adding two integers
	   public int add(int a, int b)
	   {
	       return a + b; // Return the sum
	   }
	  
	  // Method definition for printing a message
	   public void printMessage(String message)
	   {
	       System.out.println(message); // Print the message
	   }
	  
	  public static void main(String[] args)
	  {
	   // TODO Auto-generated method stub
	   Calculator_ForMethodDefinition calc = new Calculator_ForMethodDefinition(); // Create an instance of Calculator

	   int sum = calc.add(5, 3); // Call the add method
	   calc.printMessage("The sum is: " + sum); // Call the printMessage method
	  }

}
