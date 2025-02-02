package hashcodeMethodExample2;

public class Student 
{
	String s_name;
	 int s_age;
	 String s_gender;
	  Student(String s_name, int s_age, String s_gender  )
	 {
		  this.s_name = s_name;
		  this.s_age = s_age;
		  this.s_gender = s_gender;
	 }


	  @Override
	 public String toString()
	 {
		  return "student name : " + s_name + ", student_age : " + s_age + ", student gender : " + s_gender;
	 }


	  /*@Override
	 public boolean equals(Object o)
	 {
		  Student temp = (Student) o;
		  if(this.s_name == temp.s_name && this.s_age == temp.s_age && this.s_gender == temp.s_gender);
		  {
			  return true;
		  }
		 
		  else
		  {
			  return false;
		  }
	 }*/




	  @Override
	 public int hashCode()
	 {
		    int result = Integer.hashCode(s_age);
		    result = 31 * result + s_gender.hashCode();
		    result = 31 * result + s_name.hashCode();
		    return result ;
	 }


	 public void study()
	 {
	   System.out.println(s_name + "is studying well");
	}


	 public void eat()
	 {
		  System.out.println(s_name + "eats fruits daily");
	 }


	 public static void main(String[] args)
	 {
	       // TODO Auto-generated method stub
			
	       Student s1 = new Student("akshay", 15, "male");
	        Student s2 = new Student("rahul", 16, "male");
	       System.out.println(s1);
	       System.out.println(s2);
	       System.out.println(s1.equals(s2));
	       s1.eat();
	       s2.eat();
	       s1.study();
	       s2.study();
	       System.out.println(s1.hashCode());
	       System.out.println(s2.hashCode());
	    }

}
