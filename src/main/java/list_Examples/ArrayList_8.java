package list_Examples;

import java.util.ArrayList;

public class ArrayList_8 
{
	public static void main(String[] args) {
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
		System.out.println(a1.removeAll(a2)); // common elements from arraylist will be removed
		System.out.println(a1);
		System.out.println(a2);
		
		// case 2 : common elements from arraylist1 will be retained and rest of the elements are removed
		System.out.println(a1.retainAll(a2));
		System.out.println(a1);
		System.out.println(a2);
	}

}
