package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 
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
      
       while(iterator.hasNext())
       {
       	System.out.println(iterator.next());
       }
	}

}
