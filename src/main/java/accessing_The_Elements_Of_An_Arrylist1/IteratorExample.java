package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 // Create a list of strings
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Cherry");
       // Obtain an iterator for the list
       Iterator<String> iterator = fruits.iterator();
       // Use the iterator to traverse the list
       while (iterator.hasNext()) {
           String fruit = iterator.next();
           System.out.println(fruit);
          
           // Remove "Banana" from the list
           if (fruit.equals("Banana"))
           {
               iterator.remove(); // Remove the current element
           }
       }
       // Display the list after removal
       System.out.println("Fruits after removal: " + fruits); // Output: [Apple, Cherry]
	}

}
