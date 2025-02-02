package testNG_Framework_Dependency_Methods_and_Grouping_Tests;

import org.testng.annotations.Test;

public class Payment_Tests 
{
	@Test(priority = 1, groups = {"sanity", "regression", "functional"})
     public void PaymentInRupees()
     {
    	 System.out.println("This is payment in rupees");
     }
	
	@Test(priority = 2, groups = {"sanity", "regression", "functional"})
    public void PaymentInDollars()
    {
   	 System.out.println("This is payment in dollars");
    }
}
