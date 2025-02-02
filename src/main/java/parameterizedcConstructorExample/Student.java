package parameterizedcConstructorExample;

public class Student 
{
	String name;
    int id;
    double fees;
   
    Student(String s, int i, double d)
    {
 	   name = s;
 	   id = i;
 	   fees =d;
    }
	public static void main(String[] args)
           {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("shrinivas", 420, 12000);
		System.out.println("main starts");
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.fees);
		System.out.println("main ends");
	 }

}
