package cloneMethodDeepCopyExample;

public class Person implements Cloneable
{
	 private String name;
	   private int age;
	   Address address; // Mutable field
	   public Person(String name, int age, Address address)
	   {
	       this.name = name;
	       this.age = age;
	       this.address = address;
	   }


	   @Override
	   protected Object clone() throws CloneNotSupportedException
	   {
	       Person cloned = (Person) super.clone();
	       cloned.address = (Address) address.clone(); // Deep copy of Address
	       return cloned;
	   }




	   @Override
	   public String toString()
	   {
	       return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
	   }

}
