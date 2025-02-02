package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;

public class By_Using_Get_Method 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		
		// adding elements in ArrayList
		fruits.add("apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		// Accessing elements using get() method
       String firstFruit = fruits.get(0);
       String secondFruit = fruits.get(1);
      
       System.out.println("First fruit : "+firstFruit);   // Output: Apple
       System.out.println("second fruit : "+secondFruit); // Output: Banana
	}

}
