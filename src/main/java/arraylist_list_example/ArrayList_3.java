package arraylist_list_example;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(null); // null value is also allowed
		System.out.println(a1);
		
     // using get(index) we can get the at the specified index
		System.out.println(a1.get(3));
		System.out.println(a1.get(2));
		
	// a container() is used to check whether the element is present in the given arraylist or not 
		System.out.println(a1.contains(20));
		System.out.println(a1.contains('s'));
		System.out.println(a1.contains("hello"));
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(20);
		a2.add('s');
		a2.add(30);
		System.out.println(a1.containsAll(a2));
	}
}
