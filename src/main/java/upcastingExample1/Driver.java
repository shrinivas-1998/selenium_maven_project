package upcastingExample1;

public class Driver 
{
	public static void main(String[] args)
	   {
	      // TODO Auto-generated method stub
	       Child c1 = new Child();


	       System.out.println(c1.a);
	       System.out.println(c1.b);
			
	       Parent p1 = new Child(); // upcasting
	       System.out.println(p1.a);
	       // System.out.println(p1.b); // compile time error
	   }

}
