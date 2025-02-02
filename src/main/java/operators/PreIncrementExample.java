package operators;

public class PreIncrementExample 
{
	public static void main(String[] args)
	{
	  // TODO Auto-generated method stub
	   int a = 5;
       int b = ++a; // a is incremented first, then b gets the new value of a
       System.out.println("Value of a: " + a); // Output: 6
       System.out.println("Value of b: " + b); // Output: 6
	}
}
