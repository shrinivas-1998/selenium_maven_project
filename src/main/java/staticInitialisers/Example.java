package staticInitialisers;

public class Example 
{
	// Static variable
	   private static int staticVariable;


	   // Static initializer
	   static
	   {
	       // Initialization logic
	       staticVariable = 10;
	       System.out.println("Static initializer called. Static variable initialised to " + staticVariable);
	   }


	   // Static method to access the static variable
	   public static int getStaticVariable()
	   {
	       return staticVariable;
	   }
}
