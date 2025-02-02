package methodOverridingExample;

public class Son extends Father
{
	@Override
	 void Bike()
	 {
		  System.out.println("son's R15");
	 }


	  public static void main(String[] args)
		{
		  // TODO Auto-generated method stub
		  System.out.println("main starts");
		  Son  s1= new Son();
		  s1.Bike();
		  System.out.println("main ends");
			
		}

}
