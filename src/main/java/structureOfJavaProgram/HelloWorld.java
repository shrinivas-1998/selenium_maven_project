package structureOfJavaProgram;

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args)  // Main method
	  {
	     // TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in); // Creating a Scanner object

	    System.out.print("Enter your name: ");
	    String name = scanner.nextLine(); // Reading user input

	   System.out.println("Hello, " + name + "!"); // Outputting a greeting
	   scanner.close(); // Closing the scanner
	}
}
