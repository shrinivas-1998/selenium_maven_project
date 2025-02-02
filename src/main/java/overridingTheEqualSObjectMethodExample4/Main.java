package overridingTheEqualSObjectMethodExample4;

public class Main 
{
	public static void main(String[] args)
	{
	   // TODO Auto-generated method stub
               Person person1 = new Person("Alice", 30);
               Person person2 = new Person("Alice", 30);
               System.out.println(person1.equals(person2)); // Outputs: true
	}

}
