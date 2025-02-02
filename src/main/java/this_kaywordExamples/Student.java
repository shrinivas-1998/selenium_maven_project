package this_kaywordExamples;

public class Student 
{
	 String name ;
     int id;
     int age ;
     String surname;
    
     Student(String name, int id, int age, String surname)
     {
  	  this.name = name;
  	  this.id =id;
  	  this.age = age;
  	  this.surname =surname;
     }
     void dispalyDetails()
     {
  	   System.out.println("The student name is : "+name);
  	   System.out.println("The student id is :" + id);
  	   System.out.println("The student age is : " + age);
  	   System.out.println("The student surname is : " + surname);
     }
    
	public static void main(String[] args) 
             {
		// TODO Auto-generated method stub
		
		Student s2 = new Student("shrinivas", 420, 26, "bodhale");
		Student s3 = new Student("akshay", 421, 28, "shirode");
		Student s4 = new Student("suraj", 422, 27, "ghevare");
		Student s5 = new Student("vikas", 423, 25, "dhere");
		Student s6 = new Student("niraj", 422, 27, "shende");
		s2.dispalyDetails();
		s3.dispalyDetails();
		s4.dispalyDetails();
		s5.dispalyDetails();
		s6.dispalyDetails();
	}

}
