package cloneMethodExample;

public class Person  implements Cloneable
{
	private String name;
	int age;
   public Person(String name, int age)
   {
       this.name = name;
       this.age = age;
   }


   @Override
   protected Object clone() throws CloneNotSupportedException
   {
       return super.clone(); // Call Object's clone method
   }


   @Override
   public String toString()
   {
       return "Person{name='" + name + "', age=" + age + "}";
   }

}
