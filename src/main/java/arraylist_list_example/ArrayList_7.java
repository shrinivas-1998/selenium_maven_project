package arraylist_list_example;

import java.util.ArrayList;

public class ArrayList_7 {

	public static void main(String[] args) 
	{		

		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add('s');
		a1.add("hello");
		a1.add(40);
		System.out.println(a1);
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add(10);
		a2.add("hello");
		a2.add(40);
		System.out.println(a2);
		
		a1.add(a2);
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.size());
	
	}
}
