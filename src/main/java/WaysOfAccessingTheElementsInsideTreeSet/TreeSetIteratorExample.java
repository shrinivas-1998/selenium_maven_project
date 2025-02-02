package WaysOfAccessingTheElementsInsideTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIteratorExample 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
		
   TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("Apple");
    treeSet.add("Banana");
    treeSet.add("Cherry");
   
    System.out.println("TreeSet : "+treeSet);
   
    // Using Iterator
    System.out.println("Using Iterator:");
    Iterator<String> iterator = treeSet.iterator();
    while (iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
}

}
