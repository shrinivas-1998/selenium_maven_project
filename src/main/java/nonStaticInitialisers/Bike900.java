package nonStaticInitialisers;

public class Bike900 
{
	int cc;
	{
		System.out.println("bike creation");
	}


	public static void main(String[] args) 
            {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Bike900 b1 = new Bike900();
		Bike900 b2 = new Bike900();
		System.out.println("main ends");
	}

}
