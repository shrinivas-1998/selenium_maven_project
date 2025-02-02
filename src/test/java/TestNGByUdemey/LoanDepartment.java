package TestNGByUdemey;

import org.testng.annotations.Test;

public class LoanDepartment 
{
  @Test(groups = {"smoke"})
  public void loan() 
  {
	  System.out.println("Giving Loan");
  }
}
