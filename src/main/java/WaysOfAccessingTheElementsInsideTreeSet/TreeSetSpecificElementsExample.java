package WaysOfAccessingTheElementsInsideTreeSet;

import java.util.TreeSet;

public class TreeSetSpecificElementsExample 
{
	  public static void main(String[] args)
      {
      // TODO Auto-generated method stub
      TreeSet<String> treeSet = new TreeSet<>();
      treeSet.add("Apple");
      treeSet.add("Banana");
      treeSet.add("Cherry");
     
      System.out.println("TreeSet : "+treeSet);


      // Accessing Specific Elements
      System.out.println("Accessing Specific Elements:");
      String lower = treeSet.lower("Cherry"); // Returns "Banana"
      String higher = treeSet.higher("Cherry"); // Returns null (no element)
      System.out.println("Lower than Cherry: " + lower);
      System.out.println("Higher than Cherry: " + higher);
     }

}
