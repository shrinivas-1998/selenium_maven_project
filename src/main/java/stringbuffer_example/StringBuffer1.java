package stringbuffer_example;

public class StringBuffer1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer(" world");
		System.out.println(s1);
		System.out.println(s2);
		s1.append(s2); // append is used to connect the words
		System.out.println("After appending");
		System.out.println(s1);
		System.out.println(s2);
		s2.append(s1);
		System.out.println(s2);
	}

}
