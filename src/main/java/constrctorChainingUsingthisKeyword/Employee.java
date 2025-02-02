package constrctorChainingUsingthisKeyword;

public class Employee 
{
	private String name;
	   private int age;
	   private String department;


	   // Constructor with one parameter
	   public Employee(String name)
	   {
	       this(name, 30); // Calling the two-parameter constructor with a default age
	   }


	   // Constructor with two parameters
	   public Employee(String name, int age)
	   {
	       this(name, age, "Unassigned"); // Calling the three-parameter constructor with a default department
	   }


	   // Constructor with three parameters
	   public Employee(String name, int age, String department)
	   {
	       this.name = name;
	       this.age = age;
	       this.department = department;
	   }


	   // Method to display employee details
	   public void displayDetails()
	   {
	       System.out.println("Name: " + name);
	       System.out.println("Age: " + age);
	       System.out.println("Department: " + department);
	   }

}
