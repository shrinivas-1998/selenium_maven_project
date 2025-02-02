package variableShadowingExample;

public class Driver 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		C c1 = new C();
		System.out.println(c1.a);
		A a1 = new A();
		System.out.println(a1.a);
		A a2 = new C();
		System.out.println(a2.a);
		B b1  = new B();
		System.out.println(b1.a);
	}


}
