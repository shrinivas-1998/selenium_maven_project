package overridingTheEqualSObjectMethodExample2;

public class Student 
{
	String name;
	int age;
	char gender;
	
	Student(String name,int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString()
	{
            return "student name : "+ name +", student age : "+ age + ", student gender : " + gender;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student temp = (Student)o;
	    if(this.name == temp.name && this.age == temp.age && this.gender == temp.gender )
	    {
	       return true;
	    }
		
	    else
	    {
	     return false;
	    }
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Student s1 = new Student("shrinivas", 26, 'M');
		Student s2 = new Student("RANI", 22, 'F');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 ==s2);
		System.out.println(s1.equals(s2));
	}

}
