package overridingTheEqualSObjectMethodExample4;

public class Person 
{
	private String name;
	 private int age;
	    public Person(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	    }
	   
	    @Override
	    public boolean equals(Object obj)
	    {
	        if (this == obj)  // Check if both references point to the same object
	        {
	        return true;
	        }
	       
	        if (!(obj instanceof Person)) 	// Check if the object is of type Person
	        {
	        	return false;
	        }
	       
	        Person other = (Person) obj; // Cast to Person
	       
	        return name.equals(other.name) && age == other.age; // Compare fields
	    }

}
