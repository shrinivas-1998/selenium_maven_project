package WaysOfAccessingTheElementsInsideTreeSet;

import java.util.TreeSet;

public class TreeSetEnhancedForLoopExample 
{
	public static void main(String[] args)
    {
       // TODO Auto-generated method stub
		
       TreeSet<String> treeSet = new TreeSet<>();
       treeSet.add("Apple");
       treeSet.add("Banana");
       treeSet.add("Cherry");
      
       System.out.println("TreeSet : "+treeSet);

        // Using Enhanced For Loop
       System.out.println("Using Enhanced For Loop:");
       for (String fruit : treeSet)
       {
           System.out.println(fruit);
       }
    }

}
