package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion_Vs_SoftAssertion 
{
  //@Test
  public void Test_HardAssertion() 
  {
	  System.out.println("manual testing.....");
	  System.out.println("manual testing.....");
	  
	  Assert.assertEquals(1, 2); // hard assertion
	  
	  System.out.println("automation testing.....");
	  System.out.println("automation testing....."); 
  }
  
  @Test
  public void Test_SoftAssertion() 
  {
	  System.out.println("manual testing.....");
	  System.out.println("manual testing.....");
	  
	  SoftAssert sa = new  SoftAssert(); 
	  sa.assertEquals(1, 2);        // soft assertion 
	  
	  System.out.println("automation testing.....");
	  System.out.println("automation testing.....");
	  
	  sa.assertAll(); // mandatory 
  }
}
