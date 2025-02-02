package string_class_methods;

public class String_Class_example 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = " Hello, world!";
		
		// length of the String
		System.out.println("Length : "+str.length() );
		
		// character at index 7
		System.out.println("Character at index 7 : " + str.charAt(7) );
		
		// Substring
		System.out.println("Substring : "+str.substring(7, 12));
		
		// String comparison
		String str2 = "hello world";
		System.out.println("Strings are equals :" +str.equals(str2) );
		
		// Convert to uppercase
		System.out.println("Uppercase : "+str.toUpperCase() );
		
		// Convert to lower case
		System.out.println("Lowercase :"+ str.toLowerCase());
		
		// Trim
		System.out.println("Trim : "+str.trim());
	}

}
