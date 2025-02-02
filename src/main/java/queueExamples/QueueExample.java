package queueExamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
	public static void main(String[] args)
	{
           // TODO Auto-generated method stub
		
          // Create a Queue using LinkedList
       Queue<String> queue = new LinkedList<>();
       // Adding elements to the queue
       queue.add("Alice");
       queue.add("Bob");
       queue.add("Charlie");


       // Display the queue
       System.out.println("Queue: " + queue);


       // Remove and return the head of the queue
       String removedElement = queue.remove();
       System.out.println("Removed element: " + removedElement);
       System.out.println("Queue after removal: " + queue);


       // Peek at the head of the queue without removing it
       String headElement = queue.peek();
       System.out.println("Head of the queue: " + headElement);


       // Poll to retrieve and remove the head of the queue
       String polledElement = queue.poll();
       System.out.println("Polled element: " + polledElement);
       System.out.println("Queue after polling: " + queue);
	}

}
