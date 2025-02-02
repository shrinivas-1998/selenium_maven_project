package set_examples;

import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(10);
		t1.add(30);
		t1.add(50);
		t1.add(40);
		t1.add(10);
      //  t1.add('d'); // class cast exception (java.lang.ClassCastException)
        System.out.println(t1);
	}

}
