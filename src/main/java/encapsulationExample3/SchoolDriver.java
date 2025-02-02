package encapsulationExample3;

public class SchoolDriver 
{
	public static void main(String[] args)
	{	
	// TODO Auto-generated method stub
	School  s1 = new School("kedarnath vidyalaya latur", "vikas dhere", 20, 5, 15.0);
	s1.SchoolDetails();
	s1.getnoofclassroom();
	s1.setnoofstudents(60);
	s1.getnoofstudents();
	s1.setschoolname("shivaji english medium high school");
	s1.setattendence(50);
	s1.SchoolDetails();
	}

}
