package SortingSetExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingHashSetToArrayList_2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Set<String> name = new HashSet<>();
		name.add("shrinivas");
		name.add("akshay");
		name.add("suraj");
		name.add("niraj");
		name.add("vikas");
		name.add("mihir");
		
		System.out.println("Unsorted set : "+name);
		
		List<String> SortedArray = new ArrayList<>(name);
		
		Collections.sort(SortedArray);
		
		System.out.println("Sorted Set : "+SortedArray);
	}

}
