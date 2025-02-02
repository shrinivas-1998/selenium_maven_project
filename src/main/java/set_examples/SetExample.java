package set_examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
      // Create a HashSet to store unique integers
		
      Set<Integer> numberSet = new HashSet<>();
      numberSet.add(10);
      numberSet.add(20);
      numberSet.add(30);
      numberSet.add(10); // Duplicate element (will not be added)
     
     // Displaying the elements in the set
      System.out.println("Set elements: " + numberSet);
     
    // Checking if an element exists
      if (numberSet.contains(20))
      {
          System.out.println("20 is present in the set.");
      }
    
    // Removing an element
      numberSet.remove(30);
      System.out.println("After removing 30, set elements: " + numberSet);
     
   // Iterating through the set
      System.out.println("Iterating through the set:");
      for (Integer number : numberSet)
      {
          System.out.println(number);
      }
	}

}
