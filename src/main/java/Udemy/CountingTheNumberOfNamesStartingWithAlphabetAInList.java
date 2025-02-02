package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountingTheNumberOfNamesStartingWithAlphabetAInList
{
	// @Test
	public void regular() 
	{
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Abhay");
		Names.add("Akshay");
		Names.add("Vikas");
		Names.add("Akaay");
		Names.add("Abhishek");
		Names.add("Shrinivas");

		int count = 0;
		for (int i = 0; i < Names.size(); i++) 
		{
			String actual = Names.get(i);
			if (actual.startsWith("A")) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

	// @Test
	public void streamFilter() 
	{
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Abhay");
		Names.add("Akshay");
		Names.add("Vikas");
		Names.add("Akaay");
		Names.add("Abhishek");
		Names.add("Shrinivas");

		Long count = Names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);

		Long d = Stream.of("Abhay", "Akshay", "Vikas", "Akaay", "Abhishek", "Shrinivas").filter(s -> 
		{
			s.startsWith("A");
			return true;

		}).count();

		// Print all the names of Arraylist
		//Print the names of ArrayList whose character length is more than four
		Names.stream().filter(s -> s.length() > 4).forEach(s ->
		System.out.println(s));

		// limiting print count
		Names.stream().filter(s -> s.length() > 4).limit(3).forEach(s -> System.out.println(s));
	}

	// @Test
	public void streamMap() 
	{
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Rahul");
		Names.add("Abhay");
		Names.add("Vikas");

		// Printing the words which is end with character "y" and convert them into
		// UPPER CASE
		Stream.of("Abhay", "Akshay", "Vikas", "Akaay", "Abhishek", "Shrinivas").filter(s -> s.endsWith("y"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// printing stream into UPPER CASE
		Stream.of("Abhay", "Akshay", "Vikas", "Akaay", "Abhishek", "Shrinivas").map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// printing names which have first letter "a" with uppercase and sorted
		List<String> names1 = Arrays.asList("Abhay", "Akshay", "Vikas", "Akaay", "Abhishek", "Shrinivas");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// Merging two lists
		Stream<String> newStream = Stream.concat(Names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));

		// matching stream
		boolean Flag = newStream.anyMatch(s -> s.equalsIgnoreCase("shrinivas"));
		System.out.println(Flag);
		Assert.assertTrue(true);
	}

	@Test
	public void StreamCollect() 
	{

		List<String> ls = Stream.of("Abhay", "Akshay", "Vikasa", "Akaaya", "Abhisheka", "Shrinivas")
				.filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));

		// Print unique numbers from an array
		// sort the array - 3rd index - 1,2,3,4,5,6
		List<Integer> Values = Arrays.asList(3, 2, 2, 7, 5, 6, 4, 1);
		Values.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> li = Values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}
