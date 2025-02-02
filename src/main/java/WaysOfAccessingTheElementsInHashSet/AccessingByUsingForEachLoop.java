package WaysOfAccessingTheElementsInHashSet;

import java.util.HashSet;

public class AccessingByUsingForEachLoop
{
	 public static void main(String[] args) 
	   {
	       // Create a HashSet of Integer objects
	       HashSet<Integer> h1 = new HashSet<>();
	       h1.add(10);
	       h1.add(20);
	       h1.add(30);
	       h1.add(40);
	       h1.add(50);
	       h1.add(10); // Duplicates are ignored in HashSet
	      
	       // Print the HashSet
	       System.out.println("HashSet: " + h1); // The order of elements is not guaranteed
	      
	       // Use a for-each loop to traverse the HashSet
	       for (Integer number : h1) 
	      {
	           System.out.println(number); // Print each element
	       }
	   }

}
