package getClassMethod;

public class Main 
{
	public static void main(String[] args)
    {
    // TODO Auto-generated method stub
    Person person = new Person("Alice");


   // Getting the class of the object
   Class<?> clazz = person.getClass();


   // Printing the class name
   System.out.println("Class Name: " + clazz.getName()); // Outputs: Class Name: Person


   // Checking the simple name of the class
   System.out.println("Simple Name: " + clazz.getSimpleName()); // Outputs: Simple Name: Person




   // Getting the superclass of the class
   Class<?> superClass = clazz.getSuperclass();
   System.out.println("Superclass: " + superClass.getName()); // Outputs: Superclass: java.lang.Object
    }

}
