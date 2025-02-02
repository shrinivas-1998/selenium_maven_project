package WaysOfAccessingTheElementsInHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class AccessingByUsingtIterator 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
		
       HashSet<String> fruits = new HashSet<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Mango");
       fruits.add("juice");
      
       // Using Iterator to access elements
       Iterator<String> iterator = fruits.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
   }

}
