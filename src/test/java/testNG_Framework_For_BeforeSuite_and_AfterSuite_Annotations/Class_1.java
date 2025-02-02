package testNG_Framework_For_BeforeSuite_and_AfterSuite_Annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_1 
{
  @Test
  public void ABC() 
  {
	 System.out.println("This is from Class_1.."); 
  }
  
  
  @BeforeMethod
  public void bt()
  {
	  System.out.println("This is @BeforeTest method...");
  }
}
