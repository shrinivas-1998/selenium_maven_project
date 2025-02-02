package throw_keyword_example;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 20;
		if(a>b)
		{
			throw new ArithmeticException("manually thrown");
		}
		else
		{
			System.out.println("no exception");
		}
	}

}
