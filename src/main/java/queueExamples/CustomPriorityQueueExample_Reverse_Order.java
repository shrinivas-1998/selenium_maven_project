package queueExamples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueueExample_Reverse_Order 
{
	 public static void main(String[] args)
     {
     // TODO Auto-generated method stub
     // Create a PriorityQueue with a custom comparator (for descending order)
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());


      // Adding elements
      priorityQueue.add(5);
      priorityQueue.add(1);
      priorityQueue.add(3);
      priorityQueue.add(2);
      priorityQueue.add(4);


      // Display the PriorityQueue
      System.out.println("PriorityQueue (descending order): " + priorityQueue);


      // Remove and return the highest priority element
      Integer highestPriority = priorityQueue.remove();
      System.out.println("Removed highest priority element: " + highestPriority);
      System.out.println("PriorityQueue after removal: " + priorityQueue);
      }

}
