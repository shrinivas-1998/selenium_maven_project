package variableExamples;

public class StaticVariableExample 
{
	 // Static variable
	   static int count = 0; // This variable will keep track of the number of instances created
	   
	   // Constructor
	   public StaticVariableExample()
	   {
	       count++; // Increment the count each time an instance is created
	   }

	   // Method to display the current count of instances
	   public void displayCount()
	   {
	       System.out.println("Number of instances created: " + count);
	   }

	     public static void main(String[] args)
	     {
	      // TODO Auto-generated method stub
	       StaticVariableExample instance1 = new StaticVariableExample();
	       instance1.displayCount(); // Output: 1


	       StaticVariableExample instance2 = new StaticVariableExample();
	       instance2.displayCount(); // Output: 2


	       StaticVariableExample instance3 = new StaticVariableExample();
	       instance3.displayCount(); // Output: 3


	       // Accessing static variable without creating an instance
	       System.out.println("Total instances created (accessed via class): " + StaticVariableExample.count);		
	   }
}
