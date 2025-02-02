package javaStreams;

import java.util.Arrays;
import java.util.List;

public class ConvertaListOfNamesToUppercase 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		names.stream().map(String::toUpperCase) // Convert each name to uppercase
				.forEach(System.out::println);
	}
}
