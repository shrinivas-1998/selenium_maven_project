package concatenation;

public class ConcatenationWithConcatMethod 
{
	public static void main(String[] args)
	{
              // TODO Auto-generated method stub	
             String greeting = "Hello, ";
             String name = "Alice";


              // Concatenating using the concat() method
            String message = greeting.concat(name);
            System.out.println("Message: " + message); // Output: Message: Hello, Alice
	}
}
