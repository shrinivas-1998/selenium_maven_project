package voidMethodExample;

public class Greeting 
{
	// Void method to print a greeting message
	   public void greet(String name)
	   {
	       System.out.println("Hello, " + name + "! Welcome to the program.");
	   }

	   public static void main(String[] args)
	   {
	       // Creating an instance of the Greeting class
	       Greeting greeting = new Greeting();
	       // Calling the void method
	       greeting.greet("shrinivas"); // Output: Hello, shrinivas! Welcome to the program.
	   }
}
