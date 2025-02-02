package SeleniumExceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoSuchElementException 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Iterator<String> iterator = list.iterator();
		iterator.next(); // This will throw NoSuchElementException
	}
}
