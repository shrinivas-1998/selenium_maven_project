package list_Examples;

import java.util.ArrayList;

public class ArrayList_4 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		ArrayList<Object> a2 = new ArrayList<>();
		// add(object)
		a2.add(a1);
		a2.add(1999);
		System.out.println(a2);
		System.out.println(a2.size());
		
		//addALL(collection)
		a2.add(a1);
		System.out.println(a2);
		System.out.println(a2.size());
	}

}
