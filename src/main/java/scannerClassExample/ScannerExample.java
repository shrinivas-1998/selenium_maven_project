package scannerClassExample;

import java.util.Scanner;

public class ScannerExample 
{
	   public static void main(String[] args)
	   {
	     // TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter your name: ");
	     String name = scanner.nextLine();

	     System.out.print("Enter your age: ");
	     int age = scanner.nextInt();

	     System.out.println("Hello, " + name + ". You are " + age + " years old.");
	     scanner.close(); // Close the scanner
	   }
}
