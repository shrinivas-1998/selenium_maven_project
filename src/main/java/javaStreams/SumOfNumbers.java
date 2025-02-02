package javaStreams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers.stream().reduce(0, Integer::sum); // Sum all numbers

		System.out.println("Sum: " + sum);
	}
}
