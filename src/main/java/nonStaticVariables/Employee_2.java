package nonStaticVariables;

public class Employee_2 
{
	String name = "vikas dhere";
	int id = 420;
	double salary = 14500;
	long mobile_no = 986545845;
	public static void main(String[] args) 
             {
		// TODO Auto-generated method stub
		
		System.out.println("main starts");
		Employee_2  emp2 = new Employee_2();
		System.out.println(emp2.name);
		System.out.println(emp2.id);
		System.out.println(emp2.mobile_no);
		System.out.println(emp2.salary);
		System.out.println("main ends");
	}

}
