package comparable_ineterface_and_method_name;

import java.util.Arrays;

public class BookDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book b1 = new Book("java", 123, 540.0);
		Book b2 = new Book("python", 124, 440.0);
		Book b3 = new Book("c++", 125, 550.0);
		Book b4 = new Book("selenium", 126, 580.0);
		
		Book[] arr = {b1,b2,b3,b4};
		
		System.out.println("before sorting");
		for (int i = 0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("after sorting");
		Arrays.sort(arr);
		for(int i =0; i<=arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
