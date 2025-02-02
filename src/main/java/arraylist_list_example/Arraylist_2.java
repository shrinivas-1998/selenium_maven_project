package arraylist_list_example;

import java.util.ArrayList;

public class Arraylist_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 ArrayList<Object> a1 = new ArrayList<>();
		 a1.add(10);
		 a1.add("hello");
		 a1.add(20);
		 System.out.println(a1);
		 a1.add(0, 30); // we can add the elements by specifying the index values [a1.add(int, object)]
		 System.out.println("after adding elements");
		 System.out.println(a1);
	}
}
