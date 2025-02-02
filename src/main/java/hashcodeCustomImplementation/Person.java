package hashcodeCustomImplementation;

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
	       if (this == obj) return true; // Check if both references are the same
	       if (!(obj instanceof Person)) return false; // Check if the object is of type Person
	       Person other = (Person) obj;
	       return name.equals(other.name) && age == other.age; // Compare fields
	   }

	   @Override
	   public int hashCode()
	   {
	       return name.hashCode() + age; // Generate hash code based on name and age
	   }

}
