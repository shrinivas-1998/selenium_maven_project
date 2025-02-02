package encapsulationExample3;

public class School 
{
	private String schoolname;
    private String principalname;
    private int noofstudents;
    private int noofclassroom;
    private double attendence;
   
    School(String schoolname, String principalname, int noofstudents,int noofclassroom, double attendence )
    {
   	 this.schoolname = schoolname;
   	 this.principalname = principalname;
   	 this.noofstudents = noofstudents;
   	 this.noofclassroom = noofclassroom;
   	 this.attendence = attendence;
    }
   
    public String getschoolname()
    {
   	 return schoolname;
    }

  public void setschoolname(String schoolname)
    {
	  this.schoolname = schoolname;
    }

    public String getprincipalname()
    {
   	 return principalname;
    }
   
    public int getnoofstudents()
    {
   	 return noofstudents;
    }
   
    public void setnoofstudents(int noofstudents)
    {
   	 this.noofstudents = noofstudents;
    }
   
    public int getnoofclassroom()
    {
   	 return noofclassroom;
    }
   
    public void setattendence(double attendence)
    {
   	 this.attendence = attendence;
    }
   
    public void SchoolDetails()
    {
   	 System.out.println(schoolname);
   	 System.out.println(principalname);
   	 System.out.println(noofstudents);
   	 System.out.println(noofclassroom);
   	 System.out.println(attendence);
    }       
}
