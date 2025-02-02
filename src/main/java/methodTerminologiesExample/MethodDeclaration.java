package methodTerminologiesExample;

public class MethodDeclaration 
{
	 // Method declaration for adding two integers
	   public int add(int a, int b)
	   {
	       return a + b; // Method body
	   }	
		
	  // Method declaration for printing a message
	   public void printMessage()
	   {
	       System.out.println("hello akshay how are you ?"); // Method body
	   }
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			MethodDeclaration operations = new MethodDeclaration(); // Create an instance
			int sum = operations.add(5, 3); // Call the add method
			System.out.println("The sum is : "+sum);
			operations.printMessage(); // Call the printMessage method
		}
}
