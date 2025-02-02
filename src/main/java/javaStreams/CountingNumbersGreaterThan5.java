package javaStreams;

import java.util.Arrays;
import java.util.List;

public class CountingNumbersGreaterThan5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 6, 8, 3, 10);

		long count = numbers.stream().filter(n -> n > 5) // Numbers greater than 5
				.count();

		System.out.println("Count: " + count);
	}
}
