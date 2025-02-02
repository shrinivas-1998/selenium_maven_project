package variableExamples;

public class VariableExample 
{
	      // Instance variable
	      private int instanceVariable;
	      // Static variable
	      static int staticVariable = 10;
	  
	      public static void main(String[] args)
	      {
	       // TODO Auto-generated method stub
	       // Local variable
	       int localVariable = 5;

	       // Creating an instance of VariableExample
	       VariableExample example = new VariableExample();
	      
	       // Initializing instance variable
	       example.instanceVariable = 15;
	       // Displaying the values of the variables
	       System.out.println("Local Variable: " + localVariable);
	       System.out.println("Instance Variable: " + example.instanceVariable);
	       System.out.println("Static Variable: " + staticVariable);
	      
	       // Modifying the local variable
	       localVariable += 10;
	       System.out.println("Modified Local Variable: " + localVariable);
	     }
}
