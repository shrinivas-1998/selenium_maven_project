package string_class_methods_example;

public class String_Class_Methods 
{
	public static void main(String[] args)
	   {
	       // Initial string
	       String str = "  Hello, World!  ";


	       // Length of the string
	       System.out.println("Length: " + str.length());


	       // Character at index 1
	       System.out.println("Character at index 1: " + str.charAt(1));


	       // Substring
	       System.out.println("Substring (0, 5): " + str.substring(0, 5));


	       // Index of a substring
	       System.out.println("Index of 'World': " + str.indexOf("World"));


	       // Convert to lowercase
	       System.out.println("Lowercase: " + str.toLowerCase());


	       // Convert to uppercase
	       System.out.println("Uppercase: " + str.toUpperCase());


	       // Trim the string
	       System.out.println("Trimmed: '" + str.trim() + "'");


	       // Replace characters
	       System.out.println("Replace 'e' with 'a': " + str.replace('e', 'a'));


	       // Split the string
	       String str1 = "Hello,World,Java";
	       String[] parts = str1.split(",");
	       System.out.println("Split string: ");


	       for (String part : parts)
	       {
	           System.out.println(part);
	       }
	       // Comparing strings
	       System.out.println("Compared Strings (trimmed): " + str.trim().equals(str1));


	       // Checking whether the string starts with a specific word
	       System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));


	       // Checking whether the string ends with a specific word
	       System.out.println("Ends with 'Java': " + str1.endsWith("Java"));
	   }

}
