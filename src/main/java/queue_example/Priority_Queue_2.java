package queue_example;

import java.util.PriorityQueue;

public class Priority_Queue_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriorityQueue p1 = new PriorityQueue();
		p1.add(55);
		p1.add(10);
		p1.add(20);
		p1.add(33);
		p1.add(24);
		p1.add(62);
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.add(50);
		System.out.println(p1);
	}
}
