package queue_example;

import java.util.PriorityQueue;

public class PriorityQueue_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriorityQueue p1 = new PriorityQueue();
		p1.add("laila");
		p1.add("shyam");
		p1.add("ram");
		p1.add("tinku");
		p1.add("ramesh");
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);		
	}
}
