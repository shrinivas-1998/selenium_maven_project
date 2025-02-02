package methods;

public class Method_calling_example2 
{
	 public static void main(String[] args) 
     {
		// TODO Auto-generated method stub
        System.out.println("FROM main() method");
        m1();
        System.out.println("main() method continues execution");
        test();
     }
	
	public static void m1()
	{
		System.out.println("from m1() method");
		test();
	}
	
	public static void test()
	{
		System.out.println("test() executes");
		System.out.println("test is important than one day");
	}
}
