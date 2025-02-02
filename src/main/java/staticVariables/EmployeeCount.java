package staticVariables;

public class EmployeeCount 
{
	public static void main(String[] args)
	{
	         // TODO Auto-generated method stub
	         Employee emp1 = new Employee("Alice");
	        Employee emp2 = new Employee("Bob");
	        Employee emp3 = new Employee("Charlie");
	        emp1.display();
	        emp2.display();
	        emp3.display();
	        // Accessing the static method to get the count of employees
                System.out.println("Total number of employees: " + Employee.getEmployeeCount());
	}
}
