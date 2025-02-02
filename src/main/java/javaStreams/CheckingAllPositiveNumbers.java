package javaStreams;

import java.util.Arrays;
import java.util.List;

public class CheckingAllPositiveNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5);

		boolean allPositive = numbers.stream().allMatch(n -> n > 0);

		System.out.println("All numbers are positive: " + allPositive);
	}
}
