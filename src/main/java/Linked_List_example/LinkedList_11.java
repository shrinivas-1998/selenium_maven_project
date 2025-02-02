package Linked_List_example;

import java.util.LinkedList;

public class LinkedList_11 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l1 = new LinkedList<>();
		l1.add('b');
		l1.add('c');
		l1.add('d');
		l1.add('e');
		l1.add(50);
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1);
	}

}
