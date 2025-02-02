package WaysOfAccessingTheElementsOfLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIteratorExample 
{
	 public static void main(String[] args)
     {
      // TODO Auto-generated method stub
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
      linkedHashSet.add("Apple");
      linkedHashSet.add("Banana");
      linkedHashSet.add("Cherry");
      linkedHashSet.add("Carrot");
     
      System.out.println("linkedHashSet :"+linkedHashSet);


      // Using Iterator
      System.out.println("Using Iterator:");
      Iterator<String> iterator = linkedHashSet.iterator();
      while (iterator.hasNext())
      {
          System.out.println(iterator.next()); 
       }
   }
}
