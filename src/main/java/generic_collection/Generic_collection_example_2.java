package generic_collection;

import java.util.ArrayList;

public class Generic_collection_example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("shrinivas");
		a1.add("vikas");
		a1.add("niraj");
		a1.add("suraj");
		a1.add("akshay");
		//a1.add('10');
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		a1.remove(1);
		a1.add("niraj khatri");
		System.out.println(a1);	
	}
}
