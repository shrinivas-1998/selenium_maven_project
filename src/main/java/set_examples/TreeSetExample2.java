package set_examples;

import java.util.TreeSet;

public class TreeSetExample2 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     TreeSet<Integer> treeSet = new TreeSet<>();
    
     // Adding elements
     treeSet.add(10);
     treeSet.add(20);
     treeSet.add(15);
    
     // Displaying elements
     System.out.println("TreeSet: " + treeSet);


     // Checking size and emptiness
     System.out.println("Size: " + treeSet.size());
     System.out.println("Is Empty: " + treeSet.isEmpty());


     // Retrieving first and last elements
     System.out.println("First Element: " + treeSet.first());
     System.out.println("Last Element: " + treeSet.last());


     // Removing an element
     treeSet.remove(10);
     System.out.println("After removing 10: " + treeSet);
	}

}
