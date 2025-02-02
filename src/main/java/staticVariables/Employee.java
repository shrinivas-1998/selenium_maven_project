package staticVariables;

public class Employee 
{
	 // Static variable to keep track of the number of employees
	   private static int employeeCount = 0;


	   // Instance variable for employee name
	   private String name;


	   // Constructor
	   public Employee(String name)
	   {
	       this.name = name;
	       employeeCount++; // Increment the static variable when a new employee is created
	   }


	   // Static method to get the current employee count
	   public static int getEmployeeCount()
	   {
	       return employeeCount;
	   }


	   // Instance method to display employee details
	   public void display()
	   {
	       System.out.println("Employee Name: " + name);
	   }

}
