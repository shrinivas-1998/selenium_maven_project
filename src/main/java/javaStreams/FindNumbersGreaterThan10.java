package javaStreams;

import java.util.Arrays;
import java.util.List;

public class FindNumbersGreaterThan10 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 3);

		numbers.stream().filter(n -> n > 10) // Keep only numbers greater than 10
				.forEach(System.out::println);
	}
}
