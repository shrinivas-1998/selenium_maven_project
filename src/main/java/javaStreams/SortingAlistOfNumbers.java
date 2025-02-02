package javaStreams;

import java.util.Arrays;
import java.util.List;

public class SortingAlistOfNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);

		numbers.stream().sorted() // Sort in natural order
				.forEach(System.out::println);
	}
}
