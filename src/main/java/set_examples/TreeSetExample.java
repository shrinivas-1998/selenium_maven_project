package set_examples;

import java.util.TreeSet;

public class TreeSetExample
{
	public static void main(String[] args)
	{
	     // TODO Auto-generated method stub
	     // Create a TreeSet
	    TreeSet<Integer> treeSet = new TreeSet<>();
		
	    // Add elements
	     treeSet.add(10);
	     treeSet.add(20);
	     treeSet.add(15);
	     treeSet.add(5);
	     treeSet.add(25);
	    
	  // Print the TreeSet (elements will be sorted)
	    System.out.println("TreeSet: " + treeSet);
	   
	 // Check if an element exists
       System.out.println("Contains 15? " + treeSet.contains(15));
      
    // Remove an element
       treeSet.remove(10);
       System.out.println("After removing 10: " + treeSet);
      
    // Get the first and last elements
       System.out.println("First Element: " + treeSet.first());
       System.out.println("Last Element: " + treeSet.last());
     }

}
