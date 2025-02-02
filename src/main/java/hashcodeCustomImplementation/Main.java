package hashcodeCustomImplementation;

public class Main 
{
	public static void main(String[] args)
    {
       // TODO Auto-generated method stub
       Person person1 = new Person("Alice", 30);
       Person person2 = new Person("Alice", 30);
       System.out.println("HashCode of person1: " + person1.hashCode());
       System.out.println("HashCode of person2: " + person2.hashCode());
       System.out.println("Are they equal? " + person1.equals(person2)); // true
     }

}
