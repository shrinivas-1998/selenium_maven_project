package set_examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExampleWithCustomCompartor 
{
	public static void main(String[] args)
    {
      // TODO Auto-generated method stub
		
      // Create a TreeSet with a custom comparator for descending order
      TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
     
      treeSet.add(10);
      treeSet.add(20);
      treeSet.add(15);
      treeSet.add(5);
      treeSet.add(25);
     
      System.out.println("TreeSet (Descending): " + treeSet);
    }

}
