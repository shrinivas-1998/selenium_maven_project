package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingEvenDataInNewList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0) // Keep even numbers
				.collect(Collectors.toList());

		System.out.println(evenNumbers);
	}
}
