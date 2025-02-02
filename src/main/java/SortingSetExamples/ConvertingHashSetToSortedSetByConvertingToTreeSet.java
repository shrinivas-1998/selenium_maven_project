package SortingSetExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertingHashSetToSortedSetByConvertingToTreeSet 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// create a hashset
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(50);
		hashSet.add(40);
		hashSet.add(20);
		hashSet.add(100);
		
		System.out.println("Hash Set : "+ hashSet);
		
		// converting hashset into TreeSet
		Set<Integer> sortedSet = new TreeSet<>(hashSet);
		
		System.out.println("Sorted Set : "+ sortedSet );
	}

}
