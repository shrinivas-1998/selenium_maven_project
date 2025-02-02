package nonStaticInitialisers;

public class Bike123 
{
	{
		System.out.println("1");
		System.out.println("2");
	}


	public static void main(String[] args) 
             {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		
		Bike123 b1 = new Bike123();
		Bike123 b2 = new Bike123();
		System.out.println("main ends");
		
	}

}
