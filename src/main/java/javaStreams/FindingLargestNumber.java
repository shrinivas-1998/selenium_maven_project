package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingLargestNumber {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 3);

		Optional<Integer> max = numbers.stream().max(Integer::compare);

		max.ifPresent(System.out::println); // Print the maximum number
	}
}
