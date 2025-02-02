package queueExamples;

import java.util.PriorityQueue;

public class PriorityQueueExample 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     // Create a PriorityQueue
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      // Adding elements to the PriorityQueue
      priorityQueue.add(5);
      priorityQueue.add(1);
      priorityQueue.add(3);
      priorityQueue.add(2);
      priorityQueue.add(4);


      // Display the PriorityQueue
      System.out.println("PriorityQueue: " + priorityQueue);


      // Remove and return the highest priority element
      Integer highestPriority = priorityQueue.remove();
      System.out.println("Removed highest priority element: " + highestPriority);
      System.out.println("PriorityQueue after removal: " + priorityQueue);


      // Peek at the highest priority element without removing it
      Integer headElement = priorityQueue.peek();
      System.out.println("Highest priority element: " + headElement);


      // Poll to retrieve and remove the highest priority element
      Integer polledElement = priorityQueue.poll();
      System.out.println("Polled highest priority element: " + polledElement);
      System.out.println("PriorityQueue after polling: " + priorityQueue);
	}


}
