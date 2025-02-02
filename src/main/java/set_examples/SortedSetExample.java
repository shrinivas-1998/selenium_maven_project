package set_examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample 
{
	public static void main(String[] args)
    {
     // TODO Auto-generated method stub
		
      // Create a SortedSet using TreeSet
     SortedSet<Integer> sortedSet = new TreeSet<>();


     // Add elements
     sortedSet.add(30);
     sortedSet.add(10);
     sortedSet.add(20);
     sortedSet.add(40);
     sortedSet.add(50);


     // Display the elements (sorted order)
     System.out.println("SortedSet elements: " + sortedSet);


     // Access first and last elements
     System.out.println("First element: " + sortedSet.first());
     System.out.println("Last element: " + sortedSet.last());


     // Get a head set (elements less than 30)
     SortedSet<Integer> headSet = sortedSet.headSet(30);
     System.out.println("Head set (elements less than 30): " + headSet);


     // Get a tail set (elements greater than or equal to 30)
     SortedSet<Integer> tailSet = sortedSet.tailSet(30);
     System.out.println("Tail set (elements greater than or equal to 30): " + tailSet);


     // Get a sub set (elements between 20 and 40)
     SortedSet<Integer> subSet = sortedSet.subSet(20, 40);
     System.out.println("Sub set (elements between 20 and 40): " + subSet);
	}

}
