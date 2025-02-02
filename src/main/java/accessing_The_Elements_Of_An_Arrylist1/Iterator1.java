package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
       a1.add(10);
       a1.add(20);
       a1.add(30);
       a1.add(40);
       a1.add(50);
      
       // Obtain an Iterator from the ArrayList
       Iterator<Integer> iterator = a1.iterator();
       System.out.println(iterator.hasNext());
       System.out.println(iterator.next());    // Print the next element (10)
       System.out.println(iterator.next());    // Print the next element (20)
       System.out.println(iterator.next());    // Print the next element (30)
       System.out.println(iterator.next());    // Print the next element (40)
       System.out.println(iterator.hasNext()); // Check if there are more elements (true if there are more)
       System.out.println(iterator.next());
       System.out.println(iterator.hasNext()); // Check if there are more elements (true if there are more)
       System.out.println(iterator.next());
	}

}
