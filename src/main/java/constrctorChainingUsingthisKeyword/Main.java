package constrctorChainingUsingthisKeyword;

public class Main 
{
	public static void main(String[] args)
	{
             // TODO Auto-generated method stub
		
              // Using the first constructor
            Employee emp1 = new Employee("Alice");
            emp1.displayDetails();
           System.out.println();


            // Using the second constructor
            Employee emp2 = new Employee("Bob", 25);
            emp2.displayDetails();
            System.out.println();
           // Using the third constructor
            Employee emp3 = new Employee("Charlie", 28, "IT");
             emp3.displayDetails();
         }

}
