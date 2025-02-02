package encapsulation_example_3;

public class School_Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		School  s1 = new School("kedarnath vidhyalaya latur", "vikas dhere", 20, 5, 15.0);
		s1.SchoolDetails();
		s1.getnoofclassroom();
		s1.setnoofstudents(60);
		s1.getnoofstudents();
		s1.schoolname();
		s1.setattendence(50);
		s1.SchoolDetails();
	}

}
