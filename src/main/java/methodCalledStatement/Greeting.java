package methodCalledStatement;

public class Greeting 
{
	// Method to return a greeting message
    public String getGreeting(String name)
    {
        return "Hello, " + name + "!"; // Return the greeting message
    }
   
    public static void main(String[] args)
    {
      // TODO Auto-generated method stub
      Greeting greet = new Greeting(); // Create an instance of Greeting
      // Method call statement
      String message = greet.getGreeting("Alice"); // Calling the getGreeting method
      System.out.println(message); // Output the returned message
    }
}
