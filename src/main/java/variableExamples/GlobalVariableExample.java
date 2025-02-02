package variableExamples;

public class GlobalVariableExample 
{
	 // Instance variable (global for each instance)
	   private int instanceVar;


	   // Static variable (global for all instances)
	   static int staticVar = 10;


	   // Constructor to initialise instance variable
	   public GlobalVariableExample(int value)
	   {
	       this.instanceVar = value;
	   }


	   // Method to display values
	   public void display()
	   {
	       System.out.println("Instance Variable: " + instanceVar);
	       System.out.println("Static Variable: " + staticVar);
	   }


		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
		     GlobalVariableExample example1 = new GlobalVariableExample(1);
		     example1.display(); // Display for first instance


		     GlobalVariableExample example2 = new GlobalVariableExample(2);
		     example2.display(); // Display for second instance


		     // Modifying static variable
		      staticVar = 20;
		      example1.display(); // Display after changing static variable
		      example2.display(); // Display after changing static variable
		}
}
