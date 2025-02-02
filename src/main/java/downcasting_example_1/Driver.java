package downcasting_example_1;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Creating a Parent object // upcasting 
        Parent p1 = new Child(); // This is valid. p1 is actually an instance of Child.

        // Downcasting p1 to Child
        Child ch1 = (Child) p1;

        // Accessing the properties
        System.out.println("Parent a: " + p1.a);  // Accesses Parent's version of a
        System.out.println("Parent b: " + p1.b);  // Accesses Parent's version of b
        System.out.println("Child a: " + ch1.a);  // Accesses Child's version of a
        System.out.println("Child b: " + ch1.b);  // Accesses Child's version of
	}
}
