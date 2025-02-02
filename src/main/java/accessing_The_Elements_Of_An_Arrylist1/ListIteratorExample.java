package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Create an ArrayList of strings
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Cherry");
      
     // Obtain a ListIterator
       ListIterator<String> listIterator = fruits.listIterator();
      
     // Traversing the list forward
       System.out.println("Forward traversal:");
       while (listIterator.hasNext())
       {
           String fruit = listIterator.next();
           System.out.println(fruit);
       }
     // Traversing the list backward
       System.out.println("\nBackward traversal:");
       while (listIterator.hasPrevious())
       {
           String fruit = listIterator.previous();
           System.out.println(fruit);
       }
      
    // Adding an element
       listIterator = fruits.listIterator(); // Resetting the iterator
       listIterator.next(); // Move to the first element
       listIterator.add("Mango"); // Adding "Mango" after "Apple"
      
       // Display the updated list
       System.out.println("\nAfter adding Mango: " + fruits);
	}

}
