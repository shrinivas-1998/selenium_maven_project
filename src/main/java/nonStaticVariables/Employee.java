package nonStaticVariables;

public class Employee 
{
	String name ="akshay shirode sir";
	int id = 1233;
	double salary = 12220;
     public static void main(String[] args) 
      {
	// TODO Auto-generated method stub	
	Employee e1  = new Employee();	
	System.out.println(e1.name);
	System.out.println(e1.id);
	System.out.println(e1.salary);
      }

}
