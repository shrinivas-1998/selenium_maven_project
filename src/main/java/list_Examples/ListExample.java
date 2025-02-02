package list_Examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
      // Create a List of Strings
     List<String> fruits = new ArrayList<>();
		
     // Add elements to the List
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Cherry");
      fruits.add("Apple");   // Adding a duplicate
     


      // Display the List
      System.out.println("Fruits: " + fruits); // Output: Fruits: [Apple, Banana, Cherry, Apple]
     
     // Access an element by index
      String firstfruit = fruits.get(0);
      System.out.println("First fruit : " +firstfruit); // Output: First fruit: Apple
     
      // Remove an element by index
      fruits.remove(1); // Removes "Banana"
      System.out.println("After removal : "+fruits);
     
      // Check the size of the List
      System.out.println("Size of the list : " +fruits.size());  // Output: Size of the list: 3
     
      //  // Check if the list contains "Cherry"
      boolean hascherry = fruits.contains("Cherry");
      System.out.println("contains cherry ? : "+hascherry); // Output: Contains Cherry? true
		
  }

}
