package list_Examples;

import java.util.ArrayList;

public class ArrayList_6 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add('s');
		a1.add("hello");
		a1.add(40);
		
		// before removing
		System.out.println("before removing");
		System.out.println(a1);
	
		a1.remove(2);
		// after removing
	
		System.out.println("after removing");
		System.out.println(a1);
		
		a1.remove("hello");
		// after removing
		System.out.println("after removing");
		System.out.println(a1);
	}

}
