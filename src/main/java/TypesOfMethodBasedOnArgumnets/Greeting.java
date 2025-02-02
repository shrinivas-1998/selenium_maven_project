package TypesOfMethodBasedOnArgumnets;

public class Greeting 
{
	   // No-argument method
	   public void sayHello()
	   {
	       System.out.println("Hello, World!");
	   }

	   public static void main(String[] args)
	   {
	       Greeting greet = new Greeting(); // Create an instance of Greeting
	       greet.sayHello(); // Call the no-argument method
	   }
} 
