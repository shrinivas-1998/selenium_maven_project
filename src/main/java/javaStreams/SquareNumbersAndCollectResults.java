package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersAndCollectResults 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Square each number and collect the results into a new list
		List<Integer> squares = numbers.stream().map(n -> n * n) // Intermediate operation
				.collect(Collectors.toList()); // Terminal operation

		System.out.println(squares);
	}
}
