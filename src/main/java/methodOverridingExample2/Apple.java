package methodOverridingExample2;

public class Apple extends Fruit
{
	@Override
	void taste()
	{
		super.taste();
		System.out.println("taste of apple");
	}


	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	System.out.println("main strats");
	Apple a1 = new Apple();
	a1.taste();
	System.out.println("main end");
	}

}
