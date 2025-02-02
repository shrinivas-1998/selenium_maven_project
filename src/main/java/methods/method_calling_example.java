package methods;

public class method_calling_example 
{
	 public static void main(String[] args) 
     {
	  // TODO Auto-generated method stub
	  System.out.println("from main");
	  test();
	  System.out.println("end of main method");
     }
	public static void test()
	{
		System.out.println("from test() method");
	}
}
