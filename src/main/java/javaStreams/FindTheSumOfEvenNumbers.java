package javaStreams;

import java.util.Arrays;
import java.util.List;

public class FindTheSumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Sum of even numbers
		int sum = numbers.stream().filter(n -> n % 2 == 0) // Keep only even numbers
				.reduce(0, Integer::sum); // Sum them up

		System.out.println("Sum of even numbers: " + sum);
	}
}
