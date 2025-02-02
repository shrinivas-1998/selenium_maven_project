package throws_keyword_example;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException, ArithmeticException
	{
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++ )
		{
			System.out.println(i);
			Thread.sleep(2000); //it will take 2 seconds before print next value because of sleep method
		}
	}

}
