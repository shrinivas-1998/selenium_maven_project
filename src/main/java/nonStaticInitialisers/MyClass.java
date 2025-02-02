package nonStaticInitialisers;

public class MyClass 
{
	// Instance variable
	   int value;


	   // Instance initializer
	   {
	       value = 10; // Initialize instance variable
	   }


	   // Constructor
	   MyClass() 
	{
	       System.out.println("Constructor called");
	   }
}
