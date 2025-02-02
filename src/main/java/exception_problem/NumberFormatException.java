package exception_problem;

public class NumberFormatException 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String [] inputs = {"123", "456", "abc", "", null, "789"};
		
		for(String input:inputs)
		{
	              int number = Integer.parseInt(input);
	              System.out.println("Parsed number: " + number);
		}
	}

}
