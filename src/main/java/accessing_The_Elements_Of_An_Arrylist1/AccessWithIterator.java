package accessing_The_Elements_Of_An_Arrylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessWithIterator 
{
	 public static void main(String[] args)
     {
       // TODO Auto-generated method stub
      ArrayList<String> cars = new ArrayList<>();
     cars.add("Toyota");
     cars.add("Honda");
     cars.add("Ford");
    
  // Accessing elements using an iterator
     System.out.println("Cars:");
    
     Iterator<String> iterator = cars.iterator();
     while(iterator.hasNext())
     {
     	String car = iterator.next();
     	System.out.println(car);
     }
	}

}
