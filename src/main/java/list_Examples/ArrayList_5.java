package list_Examples;

import java.util.ArrayList;

public class ArrayList_5 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add('s');
		a1.add("hello");
		a1.add(20);
		
	// indexOf(element) will return the index of element and if the index is not present then return -1
			
		System.out.println(a1.indexOf(20));
		System.out.println(a1.indexOf("hello"));
		System.out.println(a1.indexOf("sheela"));
	}

}
