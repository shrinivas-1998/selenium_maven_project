package set_examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	 public static void main(String[] args)
	   {
	      // TODO Auto-generated method stub
	      // Create a LinkedHashSet
	       LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	       // Add elements
	       linkedHashSet.add("Apple");
	       linkedHashSet.add("Banana");
	       linkedHashSet.add("Cherry");
	       linkedHashSet.add("Date");
	       linkedHashSet.add("Fig");

	       // Attempt to add a duplicate
	       linkedHashSet.add("Apple"); // This will not be added

	       // Display elements
	       System.out.println("LinkedHashSet elements: ");
	       for (String fruit : linkedHashSet)
	       {
	           System.out.println(fruit);
	       }

	       // Check if an element exists
	       System.out.println("\nContains 'Banana': " + linkedHashSet.contains("Banana"));
	       System.out.println("Contains 'Grapes': " + linkedHashSet.contains("Grapes"));

	       // Remove an element
	       linkedHashSet.remove("Date");
	       System.out.println("\nAfter removing 'Date': ");
	       for (String fruit : linkedHashSet)
	       {
	           System.out.println(fruit);
	       }
	    }
}
