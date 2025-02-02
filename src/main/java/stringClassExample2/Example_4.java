package stringClassExample2;

public class Example_4 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = "laila";
		String s4 = new String("laila");
		String s5 = s4;
		String s6 = s2;
	    String s7 = new String("laila");
	    System.out.println(s1 == s2);
	    System.out.println(s1.equals(s2));
	    System.out.println(s2 == s6);
	    System.out.println(s3.equals(s4));
	    System.out.println(s2 == s6);
	    System.out.println(s2.equals(s6));
	    System.out.println(s7 == s3);
	    System.out.println(s7.equals(s3));
	}

}
