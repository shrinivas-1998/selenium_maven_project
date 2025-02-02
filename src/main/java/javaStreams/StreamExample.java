package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie");

		// Filter names starting with "A" and collect into a new list
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

		System.out.println(filteredNames);

	}
}
