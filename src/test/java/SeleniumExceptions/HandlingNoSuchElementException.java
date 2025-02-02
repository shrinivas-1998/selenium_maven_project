package SeleniumExceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HandlingNoSuchElementException 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Iterator<String> iterator = list.iterator();

		if (iterator.hasNext()) 
		{
			String element = iterator.next();
			System.out.println(element);
		}
		else 
		{
			System.out.println("No elements in the list.");
		}
	}
}
