package decision_making_statements;

public class nested_if_statement 
{
	public static void main(String[] args) 
    {
     // TODO Auto-generated method stub
    int age = 20;
    int wt = 55;
    if(age >=  18)
    {
	  if(wt >= 55)
	  {
		System.out.println("you are eligible for blood donation");
	  } 
    }

    else
    {
	  System.out.println("you are not eligible for blood donation");
    }
  }
}
